package defpackage;

import android.os.Build.VERSION;

/* renamed from: baet */
public final class baet {
    public static final int a = VERSION.SDK_INT;

    public static int a(int i, int i2) {
        boolean z = true;
        baet.a(i >= 0);
        baet.a(i2 > 0);
        if (i % (i2 + i2) != 0) {
            z = false;
        }
        baet.a(z);
        return (i / i2) / 2;
    }

    public static boolean b(int i) {
        return i == 1 || i == 2 || i == 4 || i == 6 || i == 9 || i == 11 || i == 16 || i == 18;
    }

    public static int a(int i) {
        boolean z = true;
        baet.a(true);
        if (i <= 0) {
            z = false;
        }
        baet.a(z);
        return i << 11;
    }

    public static long a(long j, int i) {
        baet.a(i > 0);
        return (j * 1000000) / ((long) i);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }
}
