package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: chu */
public final class chu extends FilterInputStream {
    private int a = aocf.UNSET_ENUM_VALUE;

    public chu(InputStream inputStream) {
        super(inputStream);
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    public final int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        i2 = (int) a((long) i2);
        if (i2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, i2);
        b((long) read);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.a = aocf.UNSET_ENUM_VALUE;
    }

    public final long skip(long j) {
        j = a(j);
        if (j == -1) {
            return 0;
        }
        j = super.skip(j);
        b(j);
        return j;
    }

    public final int available() {
        int i = this.a;
        if (i == aocf.UNSET_ENUM_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    private final long a(long j) {
        int i = this.a;
        if (i == 0) {
            return -1;
        }
        if (i != aocf.UNSET_ENUM_VALUE) {
            long j2 = (long) i;
            if (j > j2) {
                return j2;
            }
        }
        return j;
    }

    private final void b(long j) {
        int i = this.a;
        if (i != aocf.UNSET_ENUM_VALUE && j != -1) {
            this.a = (int) (((long) i) - j);
        }
    }
}
