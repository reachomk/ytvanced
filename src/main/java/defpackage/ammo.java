package defpackage;

/* renamed from: ammo */
public final class ammo {
    public int a;
    private final byte[] b;

    ammo(byte[] bArr) {
        this.b = bArr;
    }

    public final void a(int i) {
        this.a += i;
    }

    public final int a() {
        byte[] bArr = this.b;
        int i = this.a;
        int i2 = i + 1;
        byte b = bArr[i];
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        byte b3 = bArr[i3];
        byte b4 = bArr[i3 + 1];
        this.a = i + 4;
        return ((b4 & 255) << 24) | (((b & 255) | ((b2 & 255) << 8)) | ((b3 & 255) << 16));
    }

    public final short b() {
        byte[] bArr = this.b;
        int i = this.a;
        byte b = bArr[i + 1];
        byte b2 = bArr[i];
        this.a = i + 2;
        return (short) ((b2 & 255) | (b << 8));
    }
}
