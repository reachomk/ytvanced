package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

/* renamed from: ig */
final class ig extends im {
    private final /* synthetic */ List a;
    private final /* synthetic */ Matrix b;

    ig(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    public final void a(Matrix matrix, hr hrVar, int i, Canvas canvas) {
        for (im a : this.a) {
            a.a(this.b, hrVar, i, canvas);
        }
    }
}
