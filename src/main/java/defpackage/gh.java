package defpackage;

import android.graphics.Matrix;

/* renamed from: gh */
final class gh extends dv {
    private final /* synthetic */ gc a;

    gh(gc gcVar) {
        this.a = gcVar;
    }

    public final Matrix a(float f, Matrix matrix, Matrix matrix2) {
        this.a.s = f;
        return super.evaluate(f, matrix, matrix2);
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return evaluate(f, (Matrix) obj, (Matrix) obj2);
    }
}
