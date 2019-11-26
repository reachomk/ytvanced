package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;

/* renamed from: bla */
public final class bla extends bkp {
    private final String c;
    private final boolean d;
    private final zr e = new zr();
    private final zr f = new zr();
    private final RectF g = new RectF();
    private final int h;
    private final blj i;
    private final blj j;
    private final blj k;
    private blz l;
    private final int m;

    public bla(bju bju, bnr bnr, bnd bnd) {
        super(bju, bnr, bnq.a(bnd.l), bnp.a(bnd.m), bnd.g, bnd.c, bnd.f, bnd.h, bnd.i);
        this.c = bnd.a;
        this.m = bnd.k;
        this.d = bnd.j;
        this.h = (int) (bju.a.b() / 32.0f);
        this.i = bnd.b.a();
        this.i.a((blm) this);
        bnr.a(this.i);
        this.j = bnd.d.a();
        this.j.a((blm) this);
        bnr.a(this.j);
        this.k = bnd.e.a();
        this.k.a((blm) this);
        bnr.a(this.k);
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        if (!this.d) {
            Shader shader;
            a(this.g, matrix, false);
            long c;
            float f;
            if (this.m == 1) {
                c = (long) c();
                shader = (LinearGradient) this.e.a(c);
                if (shader == null) {
                    PointF pointF = (PointF) this.j.f();
                    PointF pointF2 = (PointF) this.k.f();
                    bnb bnb = (bnb) this.i.f();
                    int[] a = a(bnb.b);
                    float[] fArr = bnb.a;
                    f = this.g.left;
                    float width = this.g.width();
                    float f2 = pointF.x;
                    float f3 = this.g.top;
                    float height = this.g.height();
                    float f4 = pointF.y;
                    float f5 = this.g.left;
                    float width2 = this.g.width();
                    long j = c;
                    f3 = (float) ((int) ((f + (width / 2.0f)) + f2));
                    Shader linearGradient = new LinearGradient(f3, (float) ((int) ((f3 + (height / 2.0f)) + f4)), (float) ((int) ((f5 + (width2 / 2.0f)) + pointF2.x)), (float) ((int) ((this.g.top + (this.g.height() / 2.0f)) + pointF2.y)), a, fArr, TileMode.CLAMP);
                    this.e.b(j, linearGradient);
                    shader = linearGradient;
                }
            } else {
                c = (long) c();
                shader = (RadialGradient) this.f.a(c);
                if (shader == null) {
                    PointF pointF3 = (PointF) this.j.f();
                    PointF pointF4 = (PointF) this.k.f();
                    bnb bnb2 = (bnb) this.i.f();
                    int[] a2 = a(bnb2.b);
                    float[] fArr2 = bnb2.a;
                    int width3 = (int) ((this.g.left + (this.g.width() / 2.0f)) + pointF3.x);
                    int height2 = (int) ((this.g.top + (this.g.height() / 2.0f)) + pointF3.y);
                    float f6 = this.g.left;
                    f = this.g.width();
                    Shader radialGradient = new RadialGradient((float) width3, (float) height2, (float) Math.hypot((double) (((int) ((f6 + (f / 2.0f)) + pointF4.x)) - width3), (double) (((int) ((this.g.top + (this.g.height() / 2.0f)) + pointF4.y)) - height2)), a2, fArr2, TileMode.CLAMP);
                    this.f.b(c, radialGradient);
                    shader = radialGradient;
                }
            }
            this.b.setShader(shader);
            super.a(canvas, matrix, i);
        }
    }

    public final String b() {
        return this.c;
    }

    private final int c() {
        int round = Math.round(this.j.c * ((float) this.h));
        int round2 = Math.round(this.k.c * ((float) this.h));
        int round3 = Math.round(this.i.c * ((float) this.h));
        round = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            round = (round * 31) * round2;
        }
        return round3 != 0 ? (round * 31) * round3 : round;
    }

    private final int[] a(int[] iArr) {
        blz blz = this.l;
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

    public final void a(Object obj, bph bph) {
        super.a(obj, bph);
        if (obj == bkg.C) {
            if (bph == null) {
                blj blj = this.l;
                if (blj != null) {
                    this.a.b(blj);
                }
                this.l = null;
                return;
            }
            this.l = new blz(bph);
            this.l.a((blm) this);
            this.a.a(this.l);
        }
    }
}
