package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: uht */
public final class uht extends InputStream {
    private final ByteBuffer a;
    private int b = 0;

    public uht(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        return this.a.hasRemaining() ? this.a.get() & 255 : -1;
    }

    public final void mark(int i) {
        this.b = this.a.position();
    }

    public final int available() {
        return this.a.remaining();
    }

    public final long skip(long j) {
        int min = (int) Math.min(j, (long) this.a.remaining());
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    public final void reset() {
        this.a.position(this.b);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        i2 = Math.min(this.a.remaining(), i2);
        this.a.get(bArr, i, i2);
        return i2;
    }
}
