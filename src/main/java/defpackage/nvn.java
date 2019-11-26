package defpackage;

import java.io.InputStream;

/* renamed from: nvn */
public final class nvn extends InputStream {
    private final nvo a;
    private final nvq b;
    private final byte[] c;
    private boolean d = false;
    private boolean e = false;

    public nvn(nvo nvo, nvq nvq) {
        this.a = nvo;
        this.b = nvq;
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
        nwf.b(this.e ^ 1);
        a();
        return this.a.a(bArr, i, i2);
    }

    public final long skip(long j) {
        nwf.b(this.e ^ 1);
        a();
        return super.skip(j);
    }

    public final void close() {
        if (!this.e) {
            this.a.b();
            this.e = true;
        }
    }

    public final void a() {
        if (!this.d) {
            this.a.a(this.b);
            this.d = true;
        }
    }
}
