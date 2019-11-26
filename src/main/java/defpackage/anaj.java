package defpackage;

import java.io.Serializable;

/* renamed from: anaj */
final class anaj extends anak implements Serializable {
    public static final long serialVersionUID = 0;
    private final byte[] a;

    anaj(byte[] bArr) {
        this.a = (byte[]) amqw.a((Object) bArr);
    }

    public final int a() {
        return this.a.length << 3;
    }

    public final byte[] b() {
        return (byte[]) this.a.clone();
    }

    public final int c() {
        int length = this.a.length;
        amqw.b(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.a;
        return ((bArr[3] & 255) << 24) | ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) | ((bArr[2] & 255) << 16));
    }

    /* Access modifiers changed, original: final */
    public final byte[] d() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(anak anak) {
        if (this.a.length != anak.d().length) {
            return false;
        }
        int i = 0;
        int i2 = 1;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return i2;
            }
            i2 &= bArr[i] == anak.d()[i] ? 1 : 0;
            i++;
        }
    }
}
