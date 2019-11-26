package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: chk */
final class chk extends InputStream {
    private final ByteBuffer a;
    private int b = -1;

    chk(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int available() {
        return this.a.remaining();
    }

    public final int read() {
        return this.a.hasRemaining() ? this.a.get() : -1;
    }

    public final synchronized void mark(int i) {
        this.b = this.a.position();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        i2 = Math.min(i2, available());
        this.a.get(bArr, i, i2);
        return i2;
    }

    public final synchronized void reset() {
        int i = this.b;
        if (i != -1) {
            this.a.position(i);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        j = Math.min(j, (long) available());
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j));
        return j;
    }
}
