package defpackage;

/* renamed from: aobg */
final class aobg {
    public static void a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static boolean a(byte b) {
        return b >= (byte) 0;
    }

    public static boolean b(byte b) {
        return b < (byte) -32;
    }

    public static boolean c(byte b) {
        return b < (byte) -16;
    }

    private static boolean d(byte b) {
        return b > (byte) -65;
    }

    private static int e(byte b) {
        return b & 63;
    }

    public static void a(byte b, byte b2, char[] cArr, int i) {
        if (b < (byte) -62 || aobg.d(b2)) {
            throw anyg.j();
        }
        cArr[i] = (char) (((b & 31) << 6) | aobg.e(b2));
    }

    public static void a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (aobg.d(b2) || ((b == (byte) -32 && b2 < (byte) -96) || ((b == (byte) -19 && b2 >= (byte) -96) || aobg.d(b3)))) {
            throw anyg.j();
        }
        cArr[i] = (char) ((((b & 15) << 12) | (aobg.e(b2) << 6)) | aobg.e(b3));
    }

    public static void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (aobg.d(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || aobg.d(b3) || aobg.d(b4)) {
            throw anyg.j();
        }
        int e = ((((b & 7) << 18) | (aobg.e(b2) << 12)) | (aobg.e(b3) << 6)) | aobg.e(b4);
        cArr[i] = (char) ((e >>> 10) + 55232);
        cArr[i + 1] = (char) ((e & 1023) + 56320);
    }
}
