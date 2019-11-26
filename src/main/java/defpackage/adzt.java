package defpackage;

import android.accounts.Account;
import android.os.AsyncTask;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: adzt */
final class adzt extends AsyncTask {
    private final /* synthetic */ String a;
    private final /* synthetic */ adzr b;

    adzt(adzr adzr, String str) {
        this.b = adzr;
        this.a = str;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("X-Identity-Oauth2-Device-Usercode", this.a);
        this.b.c.loadUrl("https://accounts.google.com/o/oauth2/device/usercode?pageId=none", hashMap);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Account[] accountArr = (Account[]) objArr;
        try {
            this.b.d.a(accountArr[0], "https://accounts.google.com");
        } catch (IOException | tbd | tbi e) {
            xtl.a(adzr.a, "Error while setting up account cookies", e);
        }
        return null;
    }
}
