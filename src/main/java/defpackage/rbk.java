package defpackage;

/* renamed from: rbk */
final class rbk {
    public static long a(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16)))) & 4294967295L;
    }

    public static long a(byte[] bArr, int i, int i2) {
        return (rbk.a(bArr, i) >> i2) & 67108863;
    }

    public static void a(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }
}
