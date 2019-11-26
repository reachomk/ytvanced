package defpackage;

/* renamed from: fma */
public final class fma {
    public static boolean a(int i) {
        return i == 0;
    }

    static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean b(int i) {
        return fma.a(i, 2);
    }

    public static boolean c(int i) {
        return fma.a(i, 1);
    }
}
