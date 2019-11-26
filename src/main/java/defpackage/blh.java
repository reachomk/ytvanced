package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* renamed from: blh */
public final class blh extends bkp {
    private final bnr c;
    private final String d;
    private final boolean e;
    private final blj f;
    private blj g;

    public blh(bju bju, bnr bnr, bnn bnn) {
        super(bju, bnr, bnq.a(bnn.i), bnp.a(bnn.j), bnn.g, bnn.e, bnn.f, bnn.c, bnn.b);
        this.c = bnr;
        this.d = bnn.a;
        this.e = bnn.h;
        this.f = bnn.d.a();
        this.f.a((blm) this);
        bnr.a(this.f);
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.e) {
            this.b.setColor(((bll) this.f).g());
            blj blj = this.g;
            if (blj != null) {
                this.b.setColorFilter((ColorFilter) blj.f());
            }
            super.a(canvas, matrix, i);
        }
    }

    public final String b() {
        return this.d;
    }

    public final void a(Object obj, bph bph) {
        super.a(obj, bph);
        if (obj == bkg.b) {
            this.f.d = bph;
        } else if (obj == bkg.B) {
            if (bph == null) {
                this.g = null;
                return;
            }
            this.g = new blz(bph);
            this.g.a((blm) this);
            this.c.a(this.f);
        }
    }
}
