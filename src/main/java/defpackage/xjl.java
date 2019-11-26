package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: xjl */
public final class xjl extends InputStream {
    public volatile ByteBuffer a;
    private final bckx b;
    private final xip c;

    public xjl(bckx bckx, xip xip) {
        this.b = bckx;
        this.c = xip;
    }

    public final int read() {
        a();
        return (this.a == null || !this.a.hasRemaining()) ? -1 : this.a.get() & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            int length = bArr.length;
            StringBuilder stringBuilder = new StringBuilder(91);
            stringBuilder.append("Tried to read ");
            stringBuilder.append(i2);
            stringBuilder.append(" bytes starting at ");
            stringBuilder.append(i);
            stringBuilder.append(" from a buffer of length ");
            stringBuilder.append(length);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        a();
        if (this.a == null || !this.a.hasRemaining()) {
            return -1;
        }
        i2 = Math.min(this.a.remaining(), i2);
        this.a.get(bArr, i, i2);
        return i2;
    }

    public final void close() {
        xip xip = this.c;
        if (xip.d) {
            xip.a();
            return;
        }
        bckx bckx = this.b;
        xip.e = true;
        bckx.c();
        xip.a.a(bckx);
        xip.a();
    }

    private final void a() {
        xip xip = this.c;
        if (xip.d) {
            xip.a();
            return;
        }
        if (this.a == null) {
            this.a = ByteBuffer.allocateDirect(32768);
            this.a.flip();
        }
        if (!this.a.hasRemaining()) {
            this.a.clear();
            xip = this.c;
            bckx bckx = this.b;
            bckx.a(this.a);
            xip.a.a(bckx);
            xip.a();
            if (this.a != null) {
                this.a.flip();
            }
        }
    }

    public final int available() {
        return this.a != null ? this.a.remaining() : 0;
    }
}
