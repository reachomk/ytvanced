package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: hfo */
public final class hfo {
    public static final String a = xtl.b("MDX.AutonavController");
    public final epc b;
    public final adqf c;
    public final aeca d;
    public adqe e;
    public boolean f = false;
    public aeby g;
    public final hdp h;
    public final aecb i = new hfr(this);
    private final RecyclerView j;

    public hfo(adqf adqf, RecyclerView recyclerView, lsl lsl, aeca aeca) {
        this.c = (adqf) amqw.a((Object) adqf);
        this.j = (RecyclerView) amqw.a((Object) recyclerView);
        this.b = (epc) amqw.a(lsl.b);
        this.h = new hdp(new hfq(this));
        this.d = aeca;
        this.g = aeca.g;
    }

    public final void a() {
        adih a = this.g.j().a();
        if (!this.f || a == adih.UNSUPPORTED) {
            this.h.b(false);
            return;
        }
        boolean z = true;
        this.h.b(true);
        if (a != adih.ENABLED) {
            z = false;
        }
        this.h.a(z);
        if (!z) {
            this.h.c(false);
        }
    }

    public final void b() {
        a();
        aakj b = this.g.j().b();
        if (b == null || amqu.a(b.b())) {
            this.h.c(false);
            return;
        }
        this.h.a(b, new hft(this, b));
        this.h.c(true);
        ((ans) this.j.n).a_(this.b.e.d() - 1, 0);
    }
}
