package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: sdx */
public final class sdx extends AsyncTask {
    public final anko a = anko.f();
    private final String b;
    private final sgz c;

    public sdx(String str, sgz sgz) {
        this.b = (String) amqw.a((Object) str);
        this.c = sgz;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a_((sfq) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context[] contextArr = (Context[]) objArr;
        sgi sgi = new sgi();
        sgz sgz = this.c;
        sgi.a = sgz.a;
        sgi.b = sgz.f;
        String str = sgi.a;
        if (str == null) {
            throw new IllegalArgumentException("Service id must be set");
        } else if (sgi.b != null) {
            answ a = sgf.a(sgf.a(str));
            a.a(sgi.a);
            a.a(antp.ACCOUNT_SELECTION);
            a.a(sju.a(Arrays.asList(sgi.b)));
            ansx ansx = (ansx) ((anxl) a.build());
            sga a2 = sga.a();
            Context context = contextArr[0];
            String str2 = this.b;
            sgz sgz2 = this.c;
            return a2.a(context, str2, ansx, sgz2.f, sgz2.j, sgz2.m, sgz2.n);
        } else {
            throw new IllegalArgumentException("Scopes must be set");
        }
    }
}
