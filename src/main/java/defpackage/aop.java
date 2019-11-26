package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: aop */
final class aop extends any {
    private final /* synthetic */ aoq i;

    aop(aoq aoq, Context context) {
        this.i = aoq;
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, aqh aqh, aqf aqf) {
        aoq aoq = this.i;
        int[] a = aoq.a(aoq.a.n, view);
        int i = a[0];
        int i2 = a[1];
        int a2 = a(Math.max(Math.abs(i), Math.abs(i2)));
        if (a2 > 0) {
            aqf.a(i, i2, a2, this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i) {
        return Math.min(100, super.b(i));
    }
}
