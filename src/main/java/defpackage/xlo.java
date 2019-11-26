package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* renamed from: xlo */
public final class xlo extends InputStream implements xll {
    private final ByteBuffer a;

    public xlo(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final void close() {
    }

    public final boolean markSupported() {
        return true;
    }

    public final int available() {
        return this.a.remaining();
    }

    public final void mark(int i) {
        this.a.mark();
    }

    public final int read() {
        return this.a.hasRemaining() ? this.a.get() & 255 : -1;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (!this.a.hasRemaining()) {
            return -1;
        } else {
            if (i2 <= 0) {
                return 0;
            }
            i2 = Math.min(i2, this.a.remaining());
            this.a.get(bArr, i, i2);
            return i2;
        }
    }

    public final int a(ByteBuffer byteBuffer, int i) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        if (i <= 0) {
            return 0;
        }
        int remaining = this.a.remaining();
        if (i >= remaining) {
            byteBuffer.put(this.a);
            return remaining;
        }
        remaining = this.a.limit();
        ByteBuffer byteBuffer2 = this.a;
        byteBuffer2.limit(byteBuffer2.position() + i);
        byteBuffer.put(this.a);
        this.a.limit(remaining);
        return i;
    }

    public final synchronized void reset() {
        try {
            this.a.reset();
        } catch (InvalidMarkException e) {
            throw new IOException(e);
        }
    }

    public final long skip(long j) {
        if (j <= 0) {
            return 0;
        }
        int min = (int) Math.min((long) this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }
}
