package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* renamed from: bnx */
public final class bnx extends bnr {
    private final bkt g;

    bnx(bju bju, bnv bnv) {
        super(bju, bnv);
        this.g = new bkt(bju, this, new bnl("__container", bnv.a, false));
        this.g.a(Collections.emptyList(), Collections.emptyList());
    }

    /* Access modifiers changed, original: final */
    public final void b(Canvas canvas, Matrix matrix, int i) {
        this.g.a(canvas, matrix, i);
    }

    public final void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        this.g.a(rectF, this.a, z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bmi bmi, int i, List list, bmi bmi2) {
        this.g.a(bmi, i, list, bmi2);
    }
}
