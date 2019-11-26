package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: bgf */
final class bgf implements TypeEvaluator {
    private final float[] a;

    bgf(float[] fArr) {
        this.a = fArr;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        Object obj3 = this.a;
        if (obj3 == null) {
            obj3 = new float[fArr.length];
        }
        for (int i = 0; i < obj3.length; i++) {
            float f2 = fArr[i];
            obj3[i] = f2 + ((fArr2[i] - f2) * f);
        }
        return obj3;
    }
}
