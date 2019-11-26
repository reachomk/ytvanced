package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: bny */
public final class bny extends bnr {
    bny(bju bju, bnv bnv) {
        super(bju, bnv);
    }

    /* Access modifiers changed, original: final */
    public final void b(Canvas canvas, Matrix matrix, int i) {
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
