package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: jzk */
final class jzk extends jzi {
    public jzk(Context context, ans ans) {
        super(context, ans);
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 37.5f / ((float) displayMetrics.densityDpi);
    }
}
