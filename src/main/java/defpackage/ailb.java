package defpackage;

import android.view.MotionEvent;

/* renamed from: ailb */
public final class ailb {
    public final MotionEvent a;
    public final int b;

    public static int a(int i, int i2) {
        float f = (float) (i2 / 2);
        float f2 = (((float) i2) * 0.33333334f) / 2.0f;
        float f3 = (float) i;
        if (f3 >= f - f2) {
            return f3 <= f + f2 ? 0 : 1;
        } else {
            return 2;
        }
    }

    public ailb(MotionEvent motionEvent, int i) {
        this.a = motionEvent;
        this.b = i;
    }
}
