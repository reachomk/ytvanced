package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: enx */
public final class enx implements akxj {
    public final SwipeRefreshLayout a;
    public aktq b;
    public final bdfi c;
    private final eif e;
    private final ebk f;
    private final enz g = new enz(this);
    private final enw h = new enw(this);
    private final List i;
    private int j;
    private boolean k;

    public enx(eif eif, ebk ebk, SwipeRefreshLayout swipeRefreshLayout) {
        int i = 2;
        this.i = new ArrayList(2);
        this.e = eif;
        this.f = ebk;
        this.a = swipeRefreshLayout;
        boolean d = d();
        this.k = d;
        if (!d) {
            i = 3;
        }
        this.j = i;
        swipeRefreshLayout.setEnabled(d);
        this.c = bdfi.h();
        swipeRefreshLayout.a = new eob(this);
        eif.a(this.g);
        ebk.a(this.h);
    }

    public final void a(akwy akwy) {
        this.b = akwy;
        this.i.add(akwy.o);
        c();
    }

    public final void a() {
        this.e.b(this.g);
        this.f.b(this.h);
        this.c.bM_();
    }

    public final void a(int i) {
        this.j = i;
        this.a.a(i == 2);
        c();
    }

    private final void c() {
        boolean z = false;
        if (this.j != 3 && this.k) {
            z = true;
        }
        this.a.setEnabled(z);
    }

    public final void b() {
        this.k = d();
        c();
    }

    private final boolean d() {
        return this.e.c() != ejd.INLINE_FULLSCREEN;
    }
}
