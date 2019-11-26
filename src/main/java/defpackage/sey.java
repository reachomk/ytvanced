package defpackage;

import android.app.Application;
import android.os.AsyncTask;
import java.util.Arrays;

/* renamed from: sey */
final class sey extends AsyncTask {
    public final anko a = anko.f();
    private final /* synthetic */ sev b;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        sfq sfq = (sfq) obj;
        super.onPostExecute(sfq);
        this.a.a_(sfq);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        sgl sgl = new sgl();
        sgz sgz = this.b.b;
        sgl.b = sgz.f;
        sgl.a = sgz.a;
        sgl.c = sgz.h.c;
        String str = sgl.a;
        if (str == null) {
            throw new IllegalArgumentException("Service id must be set");
        } else if (sgl.b == null) {
            throw new IllegalArgumentException("Scopes must be set");
        } else if (sgl.c != null) {
            answ a = sgf.a(sgf.a(str));
            a.a(sgl.a);
            a.a(antp.PROVIDER_CONSENT);
            ansq ansq = (ansq) ansr.d.createBuilder();
            ansq.a(sgl.c);
            a.a((ansr) ((anxl) ansq.build()));
            a.a(sju.a(Arrays.asList(sgl.b)));
            ansx ansx = (ansx) ((anxl) a.build());
            sga a2 = sga.a();
            sev sev = this.b;
            Application application = sev.a;
            sgz sgz2 = sev.b;
            return a2.a(application, sgz2.i, ansx, sgz2.f, sgz2.j, sgz2.m, sgz2.n);
        } else {
            throw new IllegalArgumentException("Consent code must be set");
        }
    }

    /* synthetic */ sey(sev sev) {
        this.b = sev;
    }
}
