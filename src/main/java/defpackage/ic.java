package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: ic */
public final class ic {
    private final ih[] a = new ih[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final ih e = new ih();
    private final float[] f = new float[2];
    private final float[] g = new float[2];

    public ic() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new ih();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    private static float a(int i) {
        return (float) ((i + 1) * 90);
    }

    public final void a(ia iaVar, float f, RectF rectF, Path path) {
        a(iaVar, f, rectF, null, path);
    }

    public final void a(ia iaVar, float f, RectF rectF, if ifVar, Path path) {
        int i;
        path.rewind();
        ie ieVar = new ie(iaVar, f, rectF, ifVar, path);
        for (i = 0; i < 4; i++) {
            ht htVar;
            ia iaVar2 = ieVar.a;
            if (i == 1) {
                htVar = iaVar2.c;
            } else if (i == 2) {
                htVar = iaVar2.d;
            } else if (i != 3) {
                htVar = iaVar2.b;
            } else {
                htVar = iaVar2.a;
            }
            htVar.a(ieVar.e, this.a[i]);
            float a = ic.a(i);
            this.b[i].reset();
            RectF rectF2 = ieVar.c;
            PointF pointF = this.d;
            if (i == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            this.b[i].setTranslate(this.d.x, this.d.y);
            this.b[i].preRotate(a);
            float[] fArr = this.f;
            ih ihVar = this.a[i];
            fArr[0] = ihVar.b;
            fArr[1] = ihVar.c;
            this.b[i].mapPoints(fArr);
            a = ic.a(i);
            this.c[i].reset();
            Matrix matrix = this.c[i];
            float[] fArr2 = this.f;
            matrix.setTranslate(fArr2[0], fArr2[1]);
            this.c[i].preRotate(a);
        }
        i = 0;
        while (i < 4) {
            float[] fArr3;
            float[] fArr4 = this.f;
            ih ihVar2 = this.a[i];
            fArr4[0] = 0.0f;
            fArr4[1] = ihVar2.a;
            this.b[i].mapPoints(fArr4);
            Path path2;
            if (i == 0) {
                path2 = ieVar.b;
                fArr3 = this.f;
                path2.moveTo(fArr3[0], fArr3[1]);
            } else {
                path2 = ieVar.b;
                fArr3 = this.f;
                path2.lineTo(fArr3[0], fArr3[1]);
            }
            this.a[i].a(this.b[i], ieVar.b);
            if ifVar2 = ieVar.d;
            if (ifVar2 != null) {
                ifVar2.a(this.a[i], this.b[i], i);
            }
            int i2 = i + 1;
            int i3 = i2 & 3;
            float[] fArr5 = this.f;
            ih ihVar3 = this.a[i];
            fArr5[0] = ihVar3.b;
            fArr5[1] = ihVar3.c;
            this.b[i].mapPoints(fArr5);
            fArr5 = this.g;
            ihVar3 = this.a[i3];
            fArr5[0] = 0.0f;
            fArr5[1] = ihVar3.a;
            this.b[i3].mapPoints(fArr5);
            fArr3 = this.f;
            float f2 = fArr3[0];
            float[] fArr6 = this.g;
            float max = Math.max(((float) Math.hypot((double) (f2 - fArr6[0]), (double) (fArr3[1] - fArr6[1]))) - 4046.848f, 0.0f);
            RectF rectF3 = ieVar.c;
            fArr5 = this.f;
            ihVar3 = this.a[i];
            fArr5[0] = ihVar3.b;
            fArr5[1] = ihVar3.c;
            this.b[i].mapPoints(fArr5);
            if (i == 1 || i == 3) {
                Math.abs(rectF3.centerX() - this.f[0]);
            } else {
                Math.abs(rectF3.centerY() - this.f[1]);
            }
            this.e.a();
            ia iaVar3 = ieVar.a;
            hv hvVar;
            if (i == 1) {
                hvVar = iaVar3.g;
            } else if (i == 2) {
                hvVar = iaVar3.h;
            } else if (i != 3) {
                hvVar = iaVar3.f;
            } else {
                hvVar = iaVar3.e;
            }
            hv.a(max, this.e);
            this.e.a(this.c[i], ieVar.b);
            if ifVar3 = ieVar.d;
            if (ifVar3 != null) {
                ifVar3.b(this.e, this.c[i], i);
            }
            i = i2;
        }
        path.close();
    }
}
