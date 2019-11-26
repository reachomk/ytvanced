package defpackage;

/* renamed from: anrh */
final class anrh {
    static void a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    static boolean a(byte b) {
        return b >= (byte) 0;
    }

    static boolean b(byte b) {
        return b < (byte) -32;
    }

    static boolean c(byte b) {
        return b < (byte) -16;
    }

    private static boolean d(byte b) {
        return b > (byte) -65;
    }

    private static int e(byte b) {
        return b & 63;
    }

    static void a(byte b, byte b2, char[] cArr, int i) {
        if (b < (byte) -62 || anrh.d(b2)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) (((b & 31) << 6) | anrh.e(b2));
    }

    static void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (anrh.d(b2) || ((b == (byte) -32 && b2 < (byte) -96) || ((b == (byte) -19 && b2 >= (byte) -96) || anrh.d(b3)))) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        cArr[i] = (char) ((((b & 15) << 12) | (anrh.e(b2) << 6)) | anrh.e(b3));
    }

    static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (anrh.d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || anrh.d(b3) || anrh.d(b4)) {
            throw new IllegalArgumentException("Invalid UTF-8");
        }
        int e = ((((b & 7) << 18) | (anrh.e(b2) << 12)) | (anrh.e(b3) << 6)) | anrh.e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }
}
