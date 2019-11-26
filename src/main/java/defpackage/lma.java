package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: lma */
public final class lma extends ans implements lnj {
    private final boolean A;
    private final int B;
    private final ffs C = new ffs("SWLM");
    private int D;
    private long E = -1;
    public final Set a = new CopyOnWriteArraySet();
    private final lnf b;
    private final lnw w;
    private final bcaa x;
    private final apa y;
    private final adqf z;

    public lma(lnf lnf, lnw lnw, bcaa bcaa, apa apa, adqf adqf, int i, boolean z) {
        super(0, false);
        this.b = lnf;
        this.w = (lnw) amqw.a((Object) lnw);
        this.x = bcaa;
        this.y = apa;
        this.z = adqf;
        this.A = z;
        this.B = i;
    }

    public final boolean m() {
        return false;
    }

    public final void a(RecyclerView recyclerView, int i) {
        int F = F();
        int abs = Math.abs(F - i);
        if (!(((long) i) == -1 || abs == 0)) {
            if (!this.A && this.z.c() == null && abs == 1 && ((long) F) != -1) {
                ejd c = ((eif) this.x.get()).c();
                if (c == ejd.WATCH_WHILE_MAXIMIZED || c == ejd.WATCH_WHILE_FULLSCREEN) {
                    aqc lmc = new lmc("SLSS", recyclerView);
                    lmc.b = i;
                    a(lmc);
                    this.E = a(i);
                    return;
                }
            }
            e(i);
        }
    }

    public final void e(int i) {
        a_(i, -this.B);
    }

    public final void a_(int i, int i2) {
        super.a_(i, i2);
        this.E = a(i);
    }

    public final int a(int i, apw apw, aqh aqh) {
        i = super.a(this.w.b(i), apw, aqh);
        this.b.a(k(aqh));
        G();
        return i;
    }

    public final void a(aqh aqh) {
        super.a(aqh);
        for (int i = 0; i < w(); i++) {
            apn.c(i(i));
        }
        this.b.a(k(aqh));
    }

    private final int k(aqh aqh) {
        if (aqh.a()) {
            return aqh.a;
        }
        return F();
    }

    private final int F() {
        int a = this.y.a();
        if (!(this.E == -1 || a == 0)) {
            for (int i = 0; i < a; i++) {
                if (this.E == this.y.b(i)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private final long a(int i) {
        return xty.a(i, 0, this.y.a()) ? this.y.b(i) : -1;
    }

    public final void l(int i) {
        this.w.a(i);
        this.D = i;
        G();
        View b = this.b.b();
        if (b != null) {
            int i2 = this.D;
            int a = this.b.a(b);
            if (i2 == 0 && a == 0) {
                b.requestFocus();
            }
        }
    }

    private final void G() {
        View b = this.b.b();
        int a = b != null ? this.b.a(b) : 0;
        for (llz a2 : this.a) {
            a2.a(this.D, a);
        }
    }

    public final void a(lmk lmk) {
        this.E = lmk != null ? a(lmk.d()) : -1;
    }

    public final boolean a(apw apw, aqh aqh, int i, Bundle bundle) {
        return (i == 8192 || i == 4096) ? false : super.a(apw, aqh, i, bundle);
    }
}
