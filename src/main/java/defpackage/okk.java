package defpackage;

/* renamed from: okk */
public final class okk {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != (byte) 71) {
            i++;
        }
        return i;
    }

    public static long a(oza oza, int i, int i2) {
        oza.c(i);
        if (oza.b() >= 5) {
            i = oza.k();
            if ((8388608 & i) == 0 && ((i >> 8) & 8191) == i2 && (i & 32) != 0 && oza.d() >= 7 && oza.b() >= 7 && (oza.d() & 16) == 16) {
                byte[] bArr = new byte[6];
                oza.a(bArr, 0, 6);
                byte b = bArr[0];
                byte b2 = bArr[1];
                long j = ((long) bArr[3]) & 255;
                return (((((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25)) | ((((long) bArr[2]) & 255) << 9)) | (j + j)) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
