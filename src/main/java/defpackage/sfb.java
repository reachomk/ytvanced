package defpackage;

import android.app.Application;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: sfb */
public final class sfb extends AsyncTask {
    public final anko a = anko.f();
    private final /* synthetic */ sfc b;

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.a.a_((sfq) obj);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        sgc sgc = this.b.c.h;
        String str = sgc == null ? null : sgc.c;
        sgk sgk = new sgk();
        sgz sgz = this.b.c;
        sgk.a = sgz.a;
        sgk.b = sgz.f;
        sgk.c = str;
        sga a = sga.a();
        sfc sfc = this.b;
        Application application = sfc.a;
        String str2 = sfc.c.i;
        if (sgk.a == null) {
            throw new IllegalArgumentException("Service id must be set");
        } else if (sgk.b != null) {
            ansq ansq = (ansq) ansr.d.createBuilder();
            ansf ansf = ansf.b;
            ansq.copyOnWrite();
            ansr ansr = (ansr) ansq.instance;
            if (ansf != null) {
                ansr.b = ansf;
                ansr.a = 4;
                if (!TextUtils.isEmpty(sgk.c)) {
                    ansq.a(sgk.c);
                }
                answ a2 = sgf.a(sgf.a(sgk.a));
                a2.a(sgk.a);
                a2.a(antp.ACCOUNT_CREATION);
                a2.a(sju.a(Arrays.asList(sgk.b)));
                a2.a((ansr) ((anxl) ansq.build()));
                ansx ansx = (ansx) ((anxl) a2.build());
                sgz sgz2 = this.b.c;
                return a.a(application, str2, ansx, sgz2.f, sgz2.j, sgz2.m, sgz2.n);
            }
            throw new NullPointerException();
        } else {
            throw new IllegalArgumentException("Scopes must be set");
        }
    }

    public /* synthetic */ sfb(sfc sfc) {
        this.b = sfc;
    }
}
