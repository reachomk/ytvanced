package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: ik */
public final class ik extends in {
    public float a;
    public float b;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.g;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.a, this.b);
        path.transform(matrix);
    }
}
