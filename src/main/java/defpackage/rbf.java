package defpackage;

/* renamed from: rbf */
public final class rbf {
    private final byte[] a;

    public static rbf a(byte[] bArr) {
        return bArr != null ? new rbf(bArr, bArr.length) : null;
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private rbf(byte[] bArr, int i) {
        this.a = new byte[i];
        System.arraycopy(bArr, 0, this.a, 0, i);
    }
}
