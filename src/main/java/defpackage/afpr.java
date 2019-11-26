package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: afpr */
public final class afpr implements Runnable {
    public final xsd a;
    private final Activity b;
    private final Account c;
    private final String d;

    public afpr(Activity activity, Account account, String str, xsd xsd) {
        this.b = activity;
        this.c = account;
        this.d = str;
        this.a = xsd;
    }

    public final void run() {
        AccountManager accountManager = AccountManager.get(this.b);
        String valueOf = String.valueOf(Uri.encode(this.d));
        String str = "weblogin:continue=";
        String str2 = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
        valueOf = String.valueOf(str2);
        String str3 = "Getting authToken for authTokenType = ";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            str3.concat(valueOf);
        }
        try {
            valueOf = ((Bundle) accountManager.getAuthToken(this.c, str2, null, this.b, null, null).getResult()).getString("authtoken");
            if (TextUtils.isEmpty(valueOf)) {
                xtl.d("Couldn't retrieve a non-empty authToken");
                return;
            }
            str3 = String.valueOf(valueOf);
            str = "Loading auth'ed page from authToken = ";
            if (str3.length() == 0) {
                str3 = new String(str);
            } else {
                str.concat(str3);
            }
            this.b.runOnUiThread(new afpq(this, valueOf, accountManager, str2));
        } catch (Exception e) {
            xtl.a("An error happened when getting authToken.", e);
        }
    }
}
