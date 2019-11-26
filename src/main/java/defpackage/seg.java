package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.util.Arrays;

/* renamed from: seg */
public final class seg extends AsyncTask {
    private final sgz a;

    public seg(sgz sgz) {
        this.a = sgz;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        sfq sfq = (sfq) obj;
        if (sfq.a()) {
            String valueOf = String.valueOf(sfq.b);
            String str = "Error sending APP_AUTH state: ";
            Log.w("AppAuthRequestTask", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        sgh sgh = new sgh();
        sgz sgz = this.a;
        sgh.a = sgz.a;
        sgh.b = sgz.f;
        String str = sgh.a;
        if (str == null) {
            throw new IllegalArgumentException("Service id must be set");
        } else if (sgh.b != null) {
            answ a = sgf.a(sgf.a(str));
            a.a(sgh.a);
            a.a(antp.APP_AUTH);
            a.a(sju.a(Arrays.asList(sgh.b)));
            ansx ansx = (ansx) ((anxl) a.build());
            sga a2 = sga.a();
            Context context = contextArr[0];
            sgz sgz2 = this.a;
            return a2.a(context, sgz2.i, ansx, sgz2.f, sgz2.j, sgz2.m, sgz2.n);
        } else {
            throw new IllegalArgumentException("Scopes must be set");
        }
    }
}
