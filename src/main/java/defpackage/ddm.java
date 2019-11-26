package defpackage;

/* renamed from: ddm */
public final class ddm {
    public static final int[] a = new int[]{2, 1, 4, 8};

    static int a(int[] iArr) {
        int i = 0;
        if (iArr == null) {
            return 0;
        }
        int i2 = 0;
        while (i < iArr.length) {
            i2 |= iArr[i];
            i++;
        }
        return i2;
    }
}
