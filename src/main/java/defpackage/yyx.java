package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: yyx */
final class yyx extends any {
    yyx(Context context) {
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final float a(DisplayMetrics displayMetrics) {
        return 50.0f / ((float) displayMetrics.densityDpi);
    }

    public final int a(int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
