package defpackage;

import android.animation.TypeEvaluator;

/* renamed from: lv */
final class lv implements TypeEvaluator {
    private sg[] a;

    lv() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        sg[] sgVarArr = (sg[]) obj;
        sg[] sgVarArr2 = (sg[]) obj2;
        if (se.a(sgVarArr, sgVarArr2)) {
            if (!se.a(this.a, sgVarArr)) {
                this.a = se.a(sgVarArr);
            }
            for (int i = 0; i < sgVarArr.length; i++) {
                sg sgVar = this.a[i];
                sg sgVar2 = sgVarArr[i];
                sg sgVar3 = sgVarArr2[i];
                sgVar.a = sgVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = sgVar2.b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    sgVar.b[i2] = (fArr[i2] * (1.0f - f)) + (sgVar3.b[i2] * f);
                    i2++;
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
