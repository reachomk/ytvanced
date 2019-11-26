package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: dci */
final class dci extends any {
    private final /* synthetic */ dcf i;

    dci(dcf dcf, Context context) {
        this.i = dcf;
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(View view, aqh aqh, aqf aqf) {
        dcf dcf = this.i;
        int[] a = dcf.a(dcf.a.n, view);
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
