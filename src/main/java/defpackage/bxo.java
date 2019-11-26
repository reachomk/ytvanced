package defpackage;

import android.util.DisplayMetrics;

/* renamed from: bxo */
final class bxo implements bxn {
    private final DisplayMetrics a;

    bxo(DisplayMetrics displayMetrics) {
        this.a = displayMetrics;
    }

    public final int a() {
        return this.a.widthPixels;
    }

    public final int b() {
        return this.a.heightPixels;
    }
}
