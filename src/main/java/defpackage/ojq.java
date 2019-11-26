package defpackage;

/* renamed from: ojq */
final class ojq extends ofa {
    public ojq(ozo ozo, long j, long j2) {
        super(new ofc(), new ojt(ozo), j, j + 1, j2, 1000);
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16)) | ((bArr[i + 2] & 255) << 8));
    }
}
