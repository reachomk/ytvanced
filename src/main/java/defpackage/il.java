package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: il */
public final class il extends in {
    private static final RectF h = new RectF();
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public float e;
    public float f;

    public il(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        h.set(this.a, this.b, this.c, this.d);
        path.arcTo(h, this.e, this.f, false);
        path.transform(matrix);
    }
}
