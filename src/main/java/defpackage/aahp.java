package defpackage;

/* renamed from: aahp */
final class aahp {
    private static final int[] a = new int[]{7680, 5120, 3840, 2560, 1920, 1280, 854, 640, 428, 256};
    private static final int[] b = new int[]{4320, 2880, 2160, 1440, 1080, 720, 480, 360, 240, 144};

    static int a(int i, int i2) {
        if (i > 3840 || i2 > 2160) {
            return -1;
        }
        int i3 = 3;
        while (true) {
            int[] iArr = b;
            if (i3 < iArr.length) {
                if (i <= a[i3] && i2 <= iArr[i3]) {
                    i3++;
                }
            } else if (i <= 0 && i2 <= 0) {
                return -1;
            } else {
                return 144;
            }
        }
        return b[i3 - 1];
    }

    static int b(int i, int i2) {
        if (i < 0 || i2 < 0 || (i == 0 && i2 == 0)) {
            return -1;
        }
        int[] iArr = b;
        int min = Math.min(i, i2);
        i = Math.max(i, i2);
        int i3 = 0;
        while (true) {
            int[] iArr2 = b;
            if (i3 < iArr2.length && ((float) i) < ((float) a[i3]) * 1.3f && ((float) min) < ((float) iArr2[i3]) * 1.3f) {
                i3++;
            }
        }
        return iArr[Math.max(0, i3 - 1)];
    }
}
