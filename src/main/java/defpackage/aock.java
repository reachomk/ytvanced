package defpackage;

/* renamed from: aock */
public final class aock {
    public static final float[] a = new float[0];
    public static final String[] b = new String[0];
    public static final byte[] c = new byte[0];

    static int a(int i) {
        return i & 7;
    }

    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static final int a(aobv aobv, int i) {
        int i2 = aobv.b;
        aobv.b(i);
        int i3 = 1;
        while (aobv.a() == i) {
            aobv.b(i);
            i3++;
        }
        aobv.a(i2, i);
        return i3;
    }

    public static int b(int i) {
        return i >>> 3;
    }
}
