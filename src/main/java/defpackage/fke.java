package defpackage;

import android.content.res.Configuration;
import android.os.Handler;

/* renamed from: fke */
final class fke implements exw {
    public final fjr a;
    public final Handler b;
    public final Runnable c = new fkh(this);
    public boolean d;
    public Integer e;

    public fke(fjr fjr, Handler handler) {
        this.a = fjr;
        this.b = handler;
    }

    public final void a(Configuration configuration) {
        this.a.a(configuration);
    }

    public final int a() {
        return this.a.a.b();
    }

    public final void a(int i) {
        this.e = Integer.valueOf(i);
        if (this.d) {
            this.b.post(this.c);
        } else {
            this.a.a(i);
        }
    }
}
