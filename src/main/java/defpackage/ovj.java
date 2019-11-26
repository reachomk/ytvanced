package defpackage;

import java.io.InputStream;

/* renamed from: ovj */
public final class ovj extends InputStream {
    private final ovi a;
    private final ovm b;
    private final byte[] c;
    private boolean d = false;
    private boolean e = false;
    private long f;

    public ovj(ovi ovi, ovm ovm) {
        this.a = ovi;
        this.b = ovm;
        this.c = new byte[1];
    }

    public final int read() {
        if (read(this.c) != -1) {
            return this.c[0] & 255;
        }
        return -1;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        oxz.b(this.e ^ 1);
        if (!this.d) {
            this.a.a(this.b);
            this.d = true;
        }
        int a = this.a.a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f += (long) a;
        return a;
    }

    public final void close() {
        if (!this.e) {
            this.a.a();
            this.e = true;
        }
    }
}
