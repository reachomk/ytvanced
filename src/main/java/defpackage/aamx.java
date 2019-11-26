package defpackage;

import android.util.DisplayMetrics;

/* renamed from: aamx */
public final class aamx {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;

    public aamx(DisplayMetrics displayMetrics, boolean z) {
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int b = xss.b(displayMetrics, i);
        int b2 = xss.b(displayMetrics, i2);
        float f = ((float) i) / displayMetrics.xdpi;
        float f2 = ((float) i2) / displayMetrics.ydpi;
        if (z && i > i2) {
            this.a = b2;
            this.b = b;
            this.c = f2;
            this.d = f;
        } else {
            this.a = b;
            this.b = b2;
            this.c = f;
            this.d = f2;
        }
        this.e = displayMetrics.density;
    }
}
