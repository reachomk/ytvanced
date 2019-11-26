package defpackage;

import android.view.View;

/* renamed from: hyg */
public final class hyg extends ekk implements fgt, hyc {
    private final bcaa a;
    private final bcaa b;
    private final xhv c;
    private final xpa d;
    private final hyd e;
    private fob f;

    public hyg(elm elm, bcaa bcaa, bcaa bcaa2, xhv xhv, xpa xpa) {
        hyd hyd = new hyd();
        super(elm);
        this.a = bcaa;
        this.b = bcaa2;
        this.c = xhv;
        this.d = xpa;
        this.e = hyd;
    }

    public final void A_() {
        ((fgc) this.a.get()).a((fgt) this);
    }

    public final void ar_() {
        ((fgc) this.a.get()).b((fgt) this);
    }

    public final void a(ffu ffu, int i, int i2) {
        if (i2 != 0) {
            this.f = ffu.b;
            this.e.a(true);
            return;
        }
        this.f = null;
        this.e.a(false);
    }

    public final boolean c() {
        return this.e.c();
    }

    public final void a(hye hye) {
        this.e.a(hye);
    }

    public final void b(hye hye) {
        this.e.b(hye);
    }

    public final void onClick(View view) {
        if (this.f != null) {
            if (this.c.c()) {
                ((kzb) this.b.get()).a(this.f.b());
            } else {
                this.d.a();
            }
        }
    }

    public final boolean onLongClick(View view) {
        onClick(view);
        return true;
    }
}
