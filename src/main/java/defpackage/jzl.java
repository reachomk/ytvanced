package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: jzl */
final class jzl extends jzi {
    public jzl(Context context, ans ans) {
        super(context, ans);
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 50.0f / ((float) displayMetrics.densityDpi);
    }
}
