package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: boa */
public final class boa extends bnr {
    private final RectF g = new RectF();
    private final Paint h = new bkq();
    private final float[] i = new float[8];
    private final Path j = new Path();
    private final bnv k;
    private blj l;

    boa(bju bju, bnv bnv) {
        super(bju, bnv);
        this.k = bnv;
        this.h.setAlpha(0);
        this.h.setStyle(Style.FILL);
        this.h.setColor(bnv.k);
    }

    public final void b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.k.k);
        if (alpha != 0) {
            blj blj = this.f.e;
            i = (int) (((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (blj != null ? ((Integer) blj.f()).intValue() : 100))) / 100.0f)) * 255.0f);
            this.h.setAlpha(i);
            blj blj2 = this.l;
            if (blj2 != null) {
                this.h.setColorFilter((ColorFilter) blj2.f());
            }
            if (i > 0) {
                float[] fArr = this.i;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                bnv bnv = this.k;
                float f = (float) bnv.i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) bnv.j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.j.reset();
                Path path = this.j;
                fArr = this.i;
                path.moveTo(fArr[0], fArr[1]);
                path = this.j;
                fArr = this.i;
                path.lineTo(fArr[2], fArr[3]);
                path = this.j;
                fArr = this.i;
                path.lineTo(fArr[4], fArr[5]);
                path = this.j;
                fArr = this.i;
                path.lineTo(fArr[6], fArr[7]);
                path = this.j;
                fArr = this.i;
                path.lineTo(fArr[0], fArr[1]);
                this.j.close();
                canvas.drawPath(this.j, this.h);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        RectF rectF2 = this.g;
        bnv bnv = this.k;
        rectF2.set(0.0f, 0.0f, (float) bnv.i, (float) bnv.j);
        this.a.mapRect(this.g);
        rectF.set(this.g);
    }

    public final void a(Object obj, bph bph) {
        super.a(obj, bph);
        if (obj != bkg.B) {
            return;
        }
        if (bph != null) {
            this.l = new blz(bph);
        } else {
            this.l = null;
        }
    }
}
