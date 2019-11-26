package defpackage;

import java.util.concurrent.Executor;

/* renamed from: hhb */
public final class hhb {
    public final bcaa a;
    public final eki b;
    public final ekf c;
    private final zyw d;
    private final bcaa e;
    private final afpu f;
    private final afym g;
    private final Executor h;
    private final wya i;

    public hhb(zyw zyw, bcaa bcaa, afpu afpu, afym afym, Executor executor, bcaa bcaa2, eki eki, wya wya, ekf ekf) {
        this.d = zyw;
        this.e = bcaa;
        this.f = afpu;
        this.g = afym;
        this.h = executor;
        this.a = bcaa2;
        this.b = eki;
        this.i = wya;
        this.c = ekf;
    }

    public final void a() {
        if (this.c.b()) {
            apxn a = this.d.a();
            if (a != null) {
                aulu aulu = a.e;
                if (aulu == null) {
                    aulu = aulu.bw;
                }
                if (aulu.an) {
                    this.h.execute(new hha(this));
                }
            }
            if (foh.l(this.d) > 0) {
                this.i.a("main_offline_auto_offline", (long) foh.l(this.d), 1, true, 1, false, null, afyv.a, true, false);
            } else {
                b();
            }
        }
        if (this.f.a()) {
            this.c.e();
            this.h.execute(new hhd(this));
            if (!this.c.c()) {
                this.h.execute(new hhc(this));
            }
        }
    }

    public final void b() {
        if (this.c.a()) {
            this.g.a(((agwc) this.e.get()).c());
        }
    }

    public final void c() {
        String d = ((agwc) this.e.get()).d();
        if (!"NO_OP_STORE_TAG".equals(d)) {
            this.g.c(d);
        }
    }
}
