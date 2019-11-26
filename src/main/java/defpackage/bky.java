package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bky */
public final class bky implements bkw, blc, blm {
    private final Path a = new Path();
    private final Paint b = new bkq(1);
    private final bnr c;
    private final String d;
    private final boolean e;
    private final List f = new ArrayList();
    private final blj g;
    private final blj h;
    private blj i;
    private final bju j;

    public bky(bju bju, bnr bnr, bnm bnm) {
        this.c = bnr;
        this.d = bnm.b;
        this.e = bnm.e;
        this.j = bju;
        if (bnm.c == null || bnm.d == null) {
            this.g = null;
            this.h = null;
            return;
        }
        this.a.setFillType(bnm.a);
        this.g = bnm.c.a();
        this.g.a((blm) this);
        bnr.a(this.g);
        this.h = bnm.d.a();
        this.h.a((blm) this);
        bnr.a(this.h);
    }

    public final void a() {
        this.j.invalidateSelf();
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            bku bku = (bku) list2.get(i);
            if (bku instanceof ble) {
                this.f.add((ble) bku);
            }
        }
    }

    public final String b() {
        return this.d;
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.e) {
            this.b.setColor(((bll) this.g).g());
            this.b.setAlpha(bpd.a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.h.f()).intValue())) / 100.0f) * 255.0f)));
            blj blj = this.i;
            if (blj != null) {
                this.b.setColorFilter((ColorFilter) blj.f());
            }
            this.a.reset();
            for (i = 0; i < this.f.size(); i++) {
                this.a.addPath(((ble) this.f.get(i)).e(), matrix);
            }
            canvas.drawPath(this.a, this.b);
            bjd.a();
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.a.reset();
        for (int i = 0; i < this.f.size(); i++) {
            this.a.addPath(((ble) this.f.get(i)).e(), matrix);
        }
        this.a.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public final void a(Object obj, bph bph) {
        if (obj == bkg.a) {
            this.g.d = bph;
        } else if (obj == bkg.d) {
            this.h.d = bph;
        } else if (obj == bkg.B) {
            if (bph == null) {
                this.i = null;
                return;
            }
            this.i = new blz(bph);
            this.i.a((blm) this);
            this.c.a(this.i);
        }
    }
}
