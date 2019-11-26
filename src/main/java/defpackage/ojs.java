package defpackage;

/* renamed from: ojs */
final class ojs {
    public final ozo a = new ozo(0);
    public final oza b = new oza();
    public boolean c;
    public boolean d;
    public boolean e;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    ojs() {
    }

    public static long a(oza oza) {
        oza oza2 = oza;
        int i = oza2.b;
        if (oza.b() >= 9) {
            byte[] bArr = new byte[9];
            oza2.a(bArr, 0, 9);
            oza2.c(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = (long) b;
                        long j2 = (long) b2;
                        return ((((j2 & 3) << 13) | (((((j & 3) << 28) | (((56 & j) >> 3) << 30)) | ((((long) bArr[1]) & 255) << 20)) | (((j2 & 248) >> 3) << 15))) | ((((long) bArr[3]) & 255) << 5)) | ((((long) b3) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int a(ofp ofp) {
        this.b.a(ozp.f);
        this.c = true;
        ofp.a();
        return 0;
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }
}
