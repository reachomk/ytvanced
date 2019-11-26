package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: bma */
public final class bma {
    public blj a;
    public blj b;
    public blj c;
    public blj d;
    public blj e;
    public final blo f;
    public final blo g;
    public final blj h;
    public final blj i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public bma(bmy bmy) {
        bmp bmp = bmy.a;
        this.a = bmp != null ? bmp.a() : null;
        bmx bmx = bmy.b;
        this.b = bmx != null ? bmx.a() : null;
        bmr bmr = bmy.c;
        this.c = bmr != null ? bmr.a() : null;
        bmo bmo = bmy.d;
        this.d = bmo != null ? bmo.a() : null;
        bmo = bmy.f;
        this.f = bmo != null ? (blo) bmo.a() : null;
        if (this.f != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        bmo = bmy.g;
        this.g = bmo != null ? (blo) bmo.a() : null;
        bmq bmq = bmy.e;
        if (bmq != null) {
            this.e = bmq.a();
        }
        bmo = bmy.h;
        if (bmo == null) {
            this.h = null;
        } else {
            this.h = bmo.a();
        }
        bmo bmo2 = bmy.i;
        if (bmo2 == null) {
            this.i = null;
        } else {
            this.i = bmo2.a();
        }
    }

    public final void a(bnr bnr) {
        bnr.a(this.e);
        bnr.a(this.h);
        bnr.a(this.i);
        bnr.a(this.a);
        bnr.a(this.b);
        bnr.a(this.c);
        bnr.a(this.d);
        bnr.a(this.f);
        bnr.a(this.g);
    }

    public final void a(blm blm) {
        blj blj = this.e;
        if (blj != null) {
            blj.a(blm);
        }
        blj = this.h;
        if (blj != null) {
            blj.a(blm);
        }
        blj = this.i;
        if (blj != null) {
            blj.a(blm);
        }
        blj = this.a;
        if (blj != null) {
            blj.a(blm);
        }
        blj = this.b;
        if (blj != null) {
            blj.a(blm);
        }
        blj = this.c;
        if (blj != null) {
            blj.a(blm);
        }
        blj = this.d;
        if (blj != null) {
            blj.a(blm);
        }
        blo blo = this.f;
        if (blo != null) {
            blo.a(blm);
        }
        blo = this.g;
        if (blo != null) {
            blo.a(blm);
        }
    }

    public final Matrix a() {
        PointF pointF;
        float floatValue;
        float sin;
        this.j.reset();
        blj blj = this.b;
        if (blj != null) {
            pointF = (PointF) blj.f();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.j.preTranslate(pointF.x, pointF.y);
            }
        }
        blj = this.d;
        if (blj != null) {
            if (blj instanceof blz) {
                floatValue = ((Float) blj.f()).floatValue();
            } else {
                floatValue = ((blo) blj).g();
            }
            if (floatValue != 0.0f) {
                this.j.preRotate(floatValue);
            }
        }
        if (this.f != null) {
            blo blo = this.g;
            floatValue = blo != null ? (float) Math.cos(Math.toRadians((double) ((-blo.g()) + 90.0f))) : 0.0f;
            blo blo2 = this.g;
            sin = blo2 != null ? (float) Math.sin(Math.toRadians((double) ((-blo2.g()) + 90.0f))) : 1.0f;
            double tan = Math.tan(Math.toRadians((double) this.f.g()));
            b();
            float[] fArr = this.n;
            fArr[0] = floatValue;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = floatValue;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            b();
            fArr = this.n;
            fArr[0] = 1.0f;
            fArr[3] = (float) tan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            this.l.setValues(fArr);
            b();
            float[] fArr2 = this.n;
            fArr2[0] = floatValue;
            fArr2[1] = f;
            fArr2[3] = sin;
            fArr2[4] = floatValue;
            fArr2[8] = 1.0f;
            this.m.setValues(fArr2);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        blj = this.c;
        if (blj != null) {
            bpk bpk = (bpk) blj.f();
            sin = bpk.a;
            if (!(sin == 1.0f && bpk.b == 1.0f)) {
                this.j.preScale(sin, bpk.b);
            }
        }
        blj = this.a;
        if (blj != null) {
            pointF = (PointF) blj.f();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.j.preTranslate(-pointF.x, -pointF.y);
            }
        }
        return this.j;
    }

    private final void b() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a(float f) {
        blj blj = this.b;
        PointF pointF = null;
        PointF pointF2 = blj != null ? (PointF) blj.f() : null;
        blj blj2 = this.c;
        bpk bpk = blj2 != null ? (bpk) blj2.f() : null;
        this.j.reset();
        if (pointF2 != null) {
            this.j.preTranslate(pointF2.x * f, pointF2.y * f);
        }
        if (bpk != null) {
            double d = (double) f;
            this.j.preScale((float) Math.pow((double) bpk.a, d), (float) Math.pow((double) bpk.b, d));
        }
        blj = this.d;
        if (blj != null) {
            float floatValue = ((Float) blj.f()).floatValue();
            blj2 = this.a;
            if (blj2 != null) {
                pointF = (PointF) blj2.f();
            }
            Matrix matrix = this.j;
            floatValue *= f;
            f = 0.0f;
            float f2 = pointF != null ? pointF.x : 0.0f;
            if (pointF != null) {
                f = pointF.y;
            }
            matrix.preRotate(floatValue, f2, f);
        }
        return this.j;
    }

    /* JADX WARNING: Missing block: B:33:0x0079, code skipped:
            if (r0 == null) goto L_0x007f;
     */
    /* JADX WARNING: Missing block: B:34:0x007c, code skipped:
            r0.d = r4;
     */
    /* JADX WARNING: Missing block: B:38:0x0085, code skipped:
            if (r0 == null) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:42:0x008d, code skipped:
            if (r0 == null) goto L_0x008f;
     */
    public final boolean a(java.lang.Object r3, defpackage.bph r4) {
        /*
        r2 = this;
        r0 = defpackage.bkg.e;
        r1 = 0;
        if (r3 != r0) goto L_0x001b;
    L_0x0005:
        r3 = r2.a;
        if (r3 != 0) goto L_0x0017;
    L_0x0009:
        r3 = new blz;
        r0 = new android.graphics.PointF;
        r0.<init>();
        r3.<init>(r4, r1);
        r2.a = r3;
        goto L_0x0099;
    L_0x0017:
        r3.d = r4;
        goto L_0x0099;
    L_0x001b:
        r0 = defpackage.bkg.f;
        if (r3 != r0) goto L_0x0035;
    L_0x001f:
        r3 = r2.b;
        if (r3 != 0) goto L_0x0031;
    L_0x0023:
        r3 = new blz;
        r0 = new android.graphics.PointF;
        r0.<init>();
        r3.<init>(r4, r1);
        r2.b = r3;
        goto L_0x0099;
    L_0x0031:
        r3.d = r4;
        goto L_0x0099;
    L_0x0035:
        r0 = defpackage.bkg.k;
        if (r3 != r0) goto L_0x004d;
    L_0x0039:
        r3 = r2.c;
        if (r3 != 0) goto L_0x004a;
    L_0x003d:
        r3 = new blz;
        r0 = new bpk;
        r0.<init>();
        r3.<init>(r4, r1);
        r2.c = r3;
        goto L_0x0099;
    L_0x004a:
        r3.d = r4;
        goto L_0x0099;
    L_0x004d:
        r0 = defpackage.bkg.l;
        if (r3 != r0) goto L_0x0060;
    L_0x0051:
        r3 = r2.d;
        if (r3 != 0) goto L_0x005d;
    L_0x0055:
        r3 = new blz;
        r3.<init>(r4, r1);
        r2.d = r3;
        goto L_0x0099;
    L_0x005d:
        r3.d = r4;
        goto L_0x0099;
    L_0x0060:
        r0 = defpackage.bkg.c;
        if (r3 != r0) goto L_0x0073;
    L_0x0064:
        r3 = r2.e;
        if (r3 != 0) goto L_0x0070;
    L_0x0068:
        r3 = new blz;
        r3.<init>(r4, r1);
        r2.e = r3;
        goto L_0x0099;
    L_0x0070:
        r3.d = r4;
        goto L_0x0099;
    L_0x0073:
        r0 = defpackage.bkg.y;
        if (r3 != r0) goto L_0x007f;
    L_0x0077:
        r0 = r2.h;
        if (r0 != 0) goto L_0x007c;
    L_0x007b:
        goto L_0x007f;
    L_0x007c:
        r0.d = r4;
        goto L_0x0099;
    L_0x007f:
        r0 = defpackage.bkg.z;
        if (r3 != r0) goto L_0x0087;
    L_0x0083:
        r0 = r2.i;
        if (r0 != 0) goto L_0x007c;
    L_0x0087:
        r0 = defpackage.bkg.m;
        if (r3 != r0) goto L_0x008f;
    L_0x008b:
        r0 = r2.f;
        if (r0 != 0) goto L_0x007c;
    L_0x008f:
        r0 = defpackage.bkg.n;
        if (r3 != r0) goto L_0x009b;
    L_0x0093:
        r3 = r2.g;
        if (r3 == 0) goto L_0x009b;
    L_0x0097:
        r3.d = r4;
    L_0x0099:
        r3 = 1;
        return r3;
    L_0x009b:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bma.a(java.lang.Object, bph):boolean");
    }
}
