package defpackage;

/* renamed from: rcq */
public final class rcq {
    public final byte[] a = new byte[256];
    public int b;
    public int c;

    public rcq(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.a[i] = (byte) i;
        }
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            byte[] bArr2 = this.a;
            byte b = bArr2[i];
            i2 = ((i2 + b) + bArr[i % bArr.length]) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b;
        }
        this.b = 0;
        this.c = 0;
    }
}
