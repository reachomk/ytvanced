package defpackage;

/* renamed from: aobj */
public final class aobj {
    public static final int a = aobj.a(1, 3);
    public static final int b = aobj.a(1, 4);
    public static final int c = aobj.a(2, 0);
    public static final int d = aobj.a(3, 2);

    public static int a(int i) {
        return i & 7;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }
}
