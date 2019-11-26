package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: uma */
public final class uma extends FilterInputStream {
    private long a = 0;
    private final long b;
    private final long c;

    public uma(InputStream inputStream, long j, long j2) {
        super(inputStream);
        amqw.a(j >= 0);
        amqw.a(true);
        this.b = j;
        this.c = j2;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int available() {
        long min;
        int available = this.in.available();
        long j = this.a;
        long j2 = this.b;
        if (j <= j2) {
            long j3 = (long) available;
            min = Math.min(Math.max(j3 - this.c, Math.min(j3, j2 - j)), 2147483647L);
        } else {
            j2 += this.c;
            if (j >= j2) {
                return available;
            }
            min = Math.max(0, ((long) available) - (j2 - j));
        }
        return (int) min;
    }

    public final synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final int read() {
        if (this.a == this.b) {
            anaz.b(this.in, this.c);
            this.a += this.c;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a++;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i < 0 || i2 < 0 || bArr.length - i < i2) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int read = this.in.read(bArr, i, (int) a((long) i2));
            this.a += (long) read;
            return read;
        }
    }

    public final synchronized void reset() {
        throw new IOException("Mark not supported");
    }

    public final long skip(long j) {
        j = this.in.skip(a(j));
        this.a += j;
        return j;
    }

    private final long a(long j) {
        amqw.a(j > 0);
        long j2 = this.a;
        long j3 = this.b;
        if (j2 == j3) {
            anaz.b(this.in, this.c);
            this.a += this.c;
        } else if (j2 < j3) {
            j3 -= j2;
            if (j > j3) {
                return j3;
            }
        }
        return j;
    }
}
