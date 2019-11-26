package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: bfy */
final class bfy {
    public final Matrix a = new Matrix();
    public final float[] b;
    public float c;
    public float d;
    private final View e;

    bfy(View view, float[] fArr) {
        this.e = view;
        this.b = (float[]) fArr.clone();
        float[] fArr2 = this.b;
        this.c = fArr2[2];
        this.d = fArr2[5];
        a();
    }

    public final void a() {
        float[] fArr = this.b;
        fArr[2] = this.c;
        fArr[5] = this.d;
        this.a.setValues(fArr);
        bht.c(this.e, this.a);
    }
}
