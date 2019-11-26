package defpackage;

import android.graphics.PorterDuff.Mode;

/* renamed from: xoh */
final class xoh extends zq {
    public xoh() {
        super(6);
    }

    public static int a(int i, Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
