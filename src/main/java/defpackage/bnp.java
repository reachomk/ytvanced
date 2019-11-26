package defpackage;

import android.graphics.Paint.Join;

/* renamed from: bnp */
public final class bnp {
    public static Join a(int i) {
        i--;
        if (i == 0) {
            return Join.MITER;
        }
        if (i != 2) {
            return Join.ROUND;
        }
        return Join.BEVEL;
    }

    public static int[] a() {
        return new int[]{1, 2, 3};
    }
}
