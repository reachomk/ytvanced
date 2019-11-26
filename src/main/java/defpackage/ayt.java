package defpackage;

import android.view.animation.Interpolator;

/* renamed from: ayt */
class ayt implements Interpolator {
    private final float[] a;
    private final float b = (1.0f / ((float) (this.a.length - 1)));

    protected ayt(float[] fArr) {
        this.a = fArr;
    }

    public float getInterpolation(float f) {
        float f2 = 1.0f;
        if (f < 1.0f) {
            f2 = 0.0f;
            if (f > 0.0f) {
                int length = this.a.length;
                length = Math.min((int) (((float) (length - 1)) * f), length - 2);
                float f3 = this.b;
                float[] fArr = this.a;
                float f4 = fArr[length];
                return f4 + (((f - (((float) length) * f3)) / f3) * (fArr[length + 1] - f4));
            }
        }
        return f2;
    }
}
