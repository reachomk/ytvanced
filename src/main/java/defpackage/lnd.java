package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: lnd */
public final class lnd implements aikg, aikh, ext {
    public final aikf a;
    private final RecyclerView b;
    private final Runnable c;

    public lnd(aikf aikf, RecyclerView recyclerView, apa apa) {
        this.a = aikf;
        this.b = recyclerView;
        apa.getClass();
        this.c = new lnc(apa);
    }

    public final void b() {
        this.b.removeCallbacks(this.c);
        this.b.c(this.a.a());
    }

    public final void a(int i, int i2) {
        if ((i == -1 || i2 == -1) && this.b.getChildCount() > 0) {
            this.b.removeCallbacks(this.c);
            if (this.b.n()) {
                this.b.post(this.c);
            } else {
                this.c.run();
            }
        }
    }

    public final void a() {
        this.a.c.remove(this);
        aikf aikf = this.a;
        aikf.d.remove(this);
        aikf.f.b((aikg) this);
        this.b.removeCallbacks(this.c);
    }
}
