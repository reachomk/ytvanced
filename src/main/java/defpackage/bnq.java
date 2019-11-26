package defpackage;

import android.graphics.Paint.Cap;

/* renamed from: bnq */
public final class bnq {
    public static Cap a(int i) {
        i--;
        if (i == 0) {
            return Cap.BUTT;
        }
        if (i != 1) {
            return Cap.SQUARE;
        }
        return Cap.ROUND;
    }

    public static int[] a() {
        return new int[]{1, 2, 3};
    }
}
