package defpackage;

import android.graphics.PorterDuff.Mode;

/* renamed from: aqp */
final class aqp extends zq {
    public aqp() {
        super(6);
    }

    public static int a(int i, Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
