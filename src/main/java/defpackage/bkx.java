package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkx */
public final class bkx implements bkw, blc, blm {
    private final String a;
    private final boolean b;
    private final bnr c;
    private final zr d = new zr();
    private final zr e = new zr();
    private final Matrix f = new Matrix();
    private final Path g = new Path();
    private final Paint h = new bkq(1);
    private final RectF i = new RectF();
    private final List j = new ArrayList();
    private final blj k;
    private final blj l;
    private final blj m;
    private final blj n;
    private blj o;
    private blz p;
    private final bju q;
    private final int r;
    private final int s;

    public bkx(bju bju, bnr bnr, bne bne) {
        this.c = bnr;
        this.a = bne.f;
        this.b = bne.g;
        this.q = bju;
        this.s = bne.h;
        this.g.setFillType(bne.a);
        this.r = (int) (bju.a.b() / 32.0f);
        this.k = bne.b.a();
        this.k.a((blm) this);
        bnr.a(this.k);
        this.l = bne.c.a();
        this.l.a((blm) this);
        bnr.a(this.l);
        this.m = bne.d.a();
        this.m.a((blm) this);
        bnr.a(this.m);
        this.n = bne.e.a();
        this.n.a((blm) this);
        bnr.a(this.n);
    }

    public final void a() {
        this.q.invalidateSelf();
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            bku bku = (bku) list2.get(i);
            if (bku instanceof ble) {
                this.j.add((ble) bku);
            }
        }
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        Matrix matrix2 = matrix;
        if (!this.b) {
            Shader shader;
            this.g.reset();
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                this.g.addPath(((ble) this.j.get(i2)).e(), matrix2);
            }
            this.g.computeBounds(this.i, false);
            long c;
            PointF pointF;
            PointF pointF2;
            bnb bnb;
            Shader linearGradient;
            if (this.s == 1) {
                c = (long) c();
                shader = (LinearGradient) this.d.a(c);
                if (shader == null) {
                    pointF = (PointF) this.m.f();
                    pointF2 = (PointF) this.n.f();
                    bnb = (bnb) this.k.f();
                    linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, a(bnb.b), bnb.a, TileMode.CLAMP);
                    this.d.b(c, linearGradient);
                    shader = linearGradient;
                }
            } else {
                c = (long) c();
                shader = (RadialGradient) this.e.a(c);
                if (shader == null) {
                    pointF = (PointF) this.m.f();
                    pointF2 = (PointF) this.n.f();
                    bnb = (bnb) this.k.f();
                    int[] a = a(bnb.b);
                    float[] fArr = bnb.a;
                    float f = pointF.x;
                    float f2 = pointF.y;
                    float hypot = (float) Math.hypot((double) (pointF2.x - f), (double) (pointF2.y - f2));
                    linearGradient = new RadialGradient(f, f2, hypot > 0.0f ? hypot : 0.001f, a, fArr, TileMode.CLAMP);
                    this.e.b(c, linearGradient);
                }
            }
            this.f.set(matrix2);
            shader.setLocalMatrix(this.f);
            this.h.setShader(shader);
            blj blj = this.o;
            if (blj != null) {
                this.h.setColorFilter((ColorFilter) blj.f());
            }
            this.h.setAlpha(bpd.a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.l.f()).intValue())) / 100.0f) * 255.0f)));
            canvas.drawPath(this.g, this.h);
            bjd.a();
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        this.g.reset();
        for (int i = 0; i < this.j.size(); i++) {
            this.g.addPath(((ble) this.j.get(i)).e(), matrix);
        }
        this.g.computeBounds(rectF, false);
        rectF.set(rectF.left - 4.0f, rectF.top - 4.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final String b() {
        return this.a;
    }

    private final int c() {
        int round = Math.round(this.m.c * ((float) this.r));
        int round2 = Math.round(this.n.c * ((float) this.r));
        int round3 = Math.round(this.k.c * ((float) this.r));
        round = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            round = (round * 31) * round2;
        }
        return round3 != 0 ? (round * 31) * round3 : round;
    }

    private final int[] a(int[] iArr) {
        blz blz = this.p;
        if (blz != null) {
            Integer[] numArr = (Integer[]) blz.f();
            int length = iArr.length;
            int length2 = numArr.length;
            int i = 0;
            if (length != length2) {
                iArr = new int[length2];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    public final void a(bmi bmi, int i, List list, bmi bmi2) {
        bpd.a(bmi, i, list, bmi2, this);
    }

    public final void a(Object obj, bph bph) {
        if (obj == bkg.d) {
            this.l.d = bph;
        } else if (obj != bkg.B) {
            if (obj == bkg.C) {
                if (bph == null) {
                    blj blj = this.p;
                    if (blj != null) {
                        this.c.b(blj);
                    }
                    this.p = null;
                    return;
                }
                this.p = new blz(bph);
                this.p.a((blm) this);
                this.c.a(this.p);
            }
        } else if (bph != null) {
            this.o = new blz(bph);
            this.o.a((blm) this);
            this.c.a(this.o);
        } else {
            this.o = null;
        }
    }
}
