package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: fmr */
final class fmr extends any {
    public int i;

    public fmr(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final int d() {
        return -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 250.0f / ((float) displayMetrics.densityDpi);
    }

    public final int a(View view, int i) {
        return super.a(view, i) + this.i;
    }
}
