package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: bben */
final class bben extends FilterInputStream {
    private final int a;
    private final bbho b;
    private long c;
    private long d;
    private long e = -1;

    bben(InputStream inputStream, int i, bbho bbho) {
        super(inputStream);
        this.a = i;
        this.b = bbho;
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            this.d++;
        }
        b();
        a();
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            this.d += (long) read;
        }
        b();
        a();
        return read;
    }

    public final long skip(long j) {
        j = this.in.skip(j);
        this.d += j;
        b();
        a();
        return j;
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.e = this.d;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.e != -1) {
            this.in.reset();
            this.d = this.e;
        } else {
            throw new IOException("Mark not set");
        }
    }

    private final void a() {
        long j = this.d;
        long j2 = this.c;
        if (j > j2) {
            this.b.c(j - j2);
            this.c = this.d;
        }
    }

    private final void b() {
        if (this.d > ((long) this.a)) {
            throw bavx.g.a(String.format("Compressed gRPC message exceeds maximum size %d: %d bytes read", new Object[]{Integer.valueOf(this.a), Long.valueOf(this.d)})).b();
        }
    }
}
