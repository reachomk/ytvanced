package defpackage;

/* renamed from: zm */
final class zm {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];

    public static int a(int i) {
        return zm.c(i << 2) / 4;
    }

    private static int c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                return i3;
            }
        }
        return i;
    }

    public static int b(int i) {
        return zm.c(i << 3) / 8;
    }

    public static boolean a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj != null) {
                return obj.equals(obj2) ? z : false;
            } else {
                z = false;
            }
        }
    }

    static int a(int[] iArr, int i, int i2) {
        i--;
        int i3 = 0;
        while (i3 <= i) {
            int i4 = (i3 + i) >>> 1;
            int i5 = iArr[i4];
            if (i5 < i2) {
                i3 = i4 + 1;
            } else if (i5 <= i2) {
                return i4;
            } else {
                i = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    static int a(long[] jArr, int i, long j) {
        i--;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j2 = jArr[i3];
            if (j2 < j) {
                i2 = i3 + 1;
            } else if (j2 <= j) {
                return i3;
            } else {
                i = i3 - 1;
            }
        }
        return i2 ^ -1;
    }
}
