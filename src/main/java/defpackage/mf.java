package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.Shader;

/* renamed from: mf */
final class mf {
    public static final Matrix a = new Matrix();
    public Paint b;
    public Paint c;
    public final me d;
    public float e;
    public float f;
    public float g;
    public float h;
    public String i;
    public Boolean j;
    public final zj k;
    private final Path l;
    private final Path m;
    private final Matrix n;
    private PathMeasure o;
    private int p;
    private int q;

    public mf() {
        this.n = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.q = 255;
        this.i = null;
        this.j = null;
        this.k = new zj();
        this.d = new me();
        this.l = new Path();
        this.m = new Path();
    }

    public final void setRootAlpha(int i) {
        this.q = i;
    }

    public final int getRootAlpha() {
        return this.q;
    }

    public final void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public final float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public mf(mf mfVar) {
        this.n = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.q = 255;
        this.i = null;
        this.j = null;
        this.k = new zj();
        this.d = new me(mfVar.d, this.k);
        this.l = new Path(mfVar.l);
        this.m = new Path(mfVar.m);
        this.e = mfVar.e;
        this.f = mfVar.f;
        this.g = mfVar.g;
        this.h = mfVar.h;
        this.p = mfVar.p;
        this.q = mfVar.q;
        this.i = mfVar.i;
        String str = mfVar.i;
        if (str != null) {
            this.k.put(str, this);
        }
        this.j = mfVar.j;
    }

    public final void a(me meVar, Matrix matrix, Canvas canvas, int i, int i2) {
        me meVar2 = meVar;
        Canvas canvas2 = canvas;
        meVar2.a.set(matrix);
        meVar2.a.preConcat(meVar2.j);
        canvas.save();
        for (int i3 = 0; i3 < meVar2.b.size(); i3++) {
            md mdVar = (md) meVar2.b.get(i3);
            if (mdVar instanceof me) {
                a((me) mdVar, meVar2.a, canvas, i, i2);
            } else if (mdVar instanceof mg) {
                mg mgVar = (mg) mdVar;
                float f = ((float) i) / this.g;
                float f2 = ((float) i2) / this.h;
                float min = Math.min(f, f2);
                Matrix matrix2 = meVar2.a;
                this.n.set(matrix2);
                this.n.postScale(f, f2);
                float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float f3 = min;
                float f4 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                f = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                f = f > 0.0f ? Math.abs(f4) / f : 0.0f;
                if (f != 0.0f) {
                    Path path = this.l;
                    path.reset();
                    sg[] sgVarArr = mgVar.m;
                    if (sgVarArr != null) {
                        sg.a(sgVarArr, path);
                    }
                    path = this.l;
                    this.m.reset();
                    if (mgVar.b()) {
                        FillType fillType;
                        Path path2 = this.m;
                        if (mgVar.o != 0) {
                            fillType = FillType.EVEN_ODD;
                        } else {
                            fillType = FillType.WINDING;
                        }
                        path2.setFillType(fillType);
                        this.m.addPath(path, this.n);
                        canvas2.clipPath(this.m);
                    } else {
                        ro roVar;
                        Paint paint;
                        Shader shader;
                        mb mbVar = (mb) mgVar;
                        float f5 = mbVar.g;
                        if (!(f5 == 0.0f && mbVar.h == 1.0f)) {
                            float f6 = mbVar.i;
                            f5 = (f5 + f6) % 1.0f;
                            f4 = (mbVar.h + f6) % 1.0f;
                            if (this.o == null) {
                                this.o = new PathMeasure();
                            }
                            this.o.setPath(this.l, false);
                            float length = this.o.getLength();
                            f5 *= length;
                            f4 *= length;
                            path.reset();
                            if (f5 > f4) {
                                this.o.getSegment(f5, length, path, true);
                                this.o.getSegment(0.0f, f4, path, true);
                            } else {
                                this.o.getSegment(f5, f4, path, true);
                            }
                            path.rLineTo(0.0f, 0.0f);
                        }
                        this.m.addPath(path, this.n);
                        if (mbVar.d.c()) {
                            roVar = mbVar.d;
                            if (this.c == null) {
                                this.c = new Paint(1);
                                this.c.setStyle(Style.FILL);
                            }
                            paint = this.c;
                            if (roVar.a()) {
                                shader = roVar.a;
                                shader.setLocalMatrix(this.n);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(mbVar.f * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                paint.setColor(lz.a(roVar.b, mbVar.f));
                            }
                            paint.setColorFilter(null);
                            this.m.setFillType(mbVar.o != 0 ? FillType.EVEN_ODD : FillType.WINDING);
                            canvas2.drawPath(this.m, paint);
                        }
                        if (mbVar.b.c()) {
                            roVar = mbVar.b;
                            if (this.b == null) {
                                this.b = new Paint(1);
                                this.b.setStyle(Style.STROKE);
                            }
                            paint = this.b;
                            Join join = mbVar.k;
                            if (join != null) {
                                paint.setStrokeJoin(join);
                            }
                            Cap cap = mbVar.j;
                            if (cap != null) {
                                paint.setStrokeCap(cap);
                            }
                            paint.setStrokeMiter(mbVar.l);
                            if (roVar.a()) {
                                shader = roVar.a;
                                shader.setLocalMatrix(this.n);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(mbVar.e * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                paint.setColor(lz.a(roVar.b, mbVar.e));
                            }
                            paint.setColorFilter(null);
                            paint.setStrokeWidth(mbVar.c * (f3 * f));
                            canvas2.drawPath(this.m, paint);
                        }
                    }
                }
            }
            int i4 = i;
            int i5 = i2;
        }
        canvas.restore();
    }
}
