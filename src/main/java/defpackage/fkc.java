package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;

/* renamed from: fkc */
public final class fkc extends fkd implements ajkk, exv, exw, fjt, fjy {
    private final fjv a;
    private final fke b;
    private final xoa c;
    private final bcaa d;
    private final fkf e;
    private final acvx f;

    public fkc(Activity activity, exu exu, bcaa bcaa, zyw zyw, fjv fjv, xoa xoa, ajjz ajjz, Handler handler, acvx acvx, fkf fkf) {
        fke fke = new fke(new fjr(activity), handler);
        super(activity, fjv);
        this.a = fjv;
        this.b = fke;
        this.c = xoa;
        this.d = bcaa;
        this.e = fkf;
        this.f = acvx;
        apxn a = zyw.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.Z) {
                fjv.a();
            }
        }
        exu.a((exv) this);
        exu.a((exw) this);
        fjv.b.add(this);
        ajjz.a((ajkk) this);
        fke fke2 = this.b;
        xoa.a(fke2.a);
        fke2.a.b = this;
        if (exu.a) {
            a();
        }
    }

    public final void a() {
        this.c.enable();
        g();
    }

    public final void b() {
        this.c.disable();
        fke fke = this.b;
        fke.e = null;
        fke.b.removeCallbacks(fke.c);
    }

    public final void a(Configuration configuration) {
        fke fke = this.b;
        fke.d = true;
        fke.a(configuration);
        g();
        this.b.d = false;
    }

    public final void c() {
        a(f());
    }

    public final void a(int i, int i2) {
        a(f(), false);
    }

    public final void a(int i) {
        ejd f = f();
        if (fka.a(f)) {
            fjv fjv = this.a;
            amqw.a(fka.a(f));
            boolean z = true;
            if (!(fka.a(i) || fka.b(i))) {
                z = false;
            }
            amqw.a(z);
            ejd a = (fjv.a.a() || !f.a() || fjv.d(i)) ? f : f.a(false);
            if (f != a) {
                this.e.a(a);
            }
        }
    }

    public final void a(ejd ejd) {
        a(ejd, true);
    }

    public final boolean b(ejd ejd) {
        if (ejd.e()) {
            return false;
        }
        fjv fjv = this.a;
        int a = this.b.a();
        int a2 = fjv.a(ejd, a);
        if (a2 == 2 || a2 == 3) {
            a2 = fka.a(a);
        } else if (a2 != 4 && a2 != 5) {
            return false;
        } else {
            a2 = fka.b(a);
        }
        return a2 ^ 1;
    }

    public final ejd d() {
        return fjv.b(this.b.a());
    }

    public final boolean e() {
        return a(false);
    }

    public final boolean a(boolean z) {
        int a;
        fjv fjv = this.a;
        if (z) {
            a = this.b.a.a.a();
        } else {
            a = this.b.a();
        }
        return fjv.a(a);
    }

    private final ejd f() {
        return ((eif) this.d.get()).c();
    }

    private final void g() {
        ejd ejd;
        ejd f = f();
        fjv fjv = this.a;
        int a = this.b.a();
        if (f.k() || f.n() || f.j()) {
            ejd = f;
        } else {
            ejd ejd2;
            if (f == ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
                ejd2 = ejd.WATCH_WHILE_MAXIMIZED;
            } else if (f == ejd.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED) {
                ejd2 = ejd.WATCH_WHILE_MINIMIZED;
            } else {
                ejd2 = f;
            }
            if (ejd2 == ejd.WATCH_WHILE_MAXIMIZED && !fjv.a(a)) {
                ejd = ejd.WATCH_WHILE_FULLSCREEN;
            } else if (ejd2 == ejd.INLINE) {
                ejd = fjv.b(a);
            } else {
                boolean z = true;
                if (!(ejd2.a() && (fjv.a.a() || fjv.d(a)))) {
                    z = false;
                }
                ejd = ejd2.a(z);
            }
        }
        if (f != ejd) {
            if (!(ejd == null || f.a() || !ejd.a() || ejd.k() || ejd.n())) {
                this.f.a(3, new acvs(acwc.FULLSCREEN_OPEN_BY_ROTATE), null);
            }
            this.e.a(ejd);
            return;
        }
        a(f, false);
    }

    private final void a(ejd ejd, boolean z) {
        if (fka.a(ejd)) {
            int a;
            int a2 = this.b.a();
            if (z) {
                a = this.a.a(ejd, a2);
            } else {
                fjv fjv = this.a;
                amqw.a(fka.a(ejd));
                if (fjv.a.a() || !ejd.a() || ejd.k()) {
                    a = fjv.a(ejd, a2);
                } else {
                    a = fkb.a(a2, fjv.c(a2));
                }
            }
            b(a);
        }
    }

    public final void b(int i) {
        fke fke = this.b;
        Integer num = fke.e;
        if (num == null || num.intValue() != i) {
            fke.b.removeCallbacks(fke.c);
            fke.a(i);
        }
    }
}
