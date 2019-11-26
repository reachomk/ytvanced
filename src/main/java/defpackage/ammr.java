package defpackage;

import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: ammr */
public final class ammr extends InputStream {
    public long a;
    public long b;
    private final RandomAccessFile c;

    public ammr(RandomAccessFile randomAccessFile, long j) {
        long length = randomAccessFile.length();
        this.c = randomAccessFile;
        this.b = j;
        this.a = length;
    }

    public final int available() {
        return this.b < this.a ? 1 : 0;
    }

    public final int read() {
        int read;
        synchronized (this.c) {
            this.c.seek(this.b);
            read = this.c.read();
            if (read != -1) {
                this.b++;
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        synchronized (this.c) {
            long j = this.a;
            long j2 = this.b;
            j -= j2;
            if (((long) i2) > j) {
                i2 = (int) j;
            }
            this.c.seek(j2);
            int read = this.c.read(bArr, i, i2);
            if (read > 0) {
                this.b += (long) read;
                return read;
            }
            return -1;
        }
    }

    public final long skip(long j) {
        long j2 = this.a;
        long j3 = this.b;
        j2 -= j3;
        if (j > j2) {
            j = j2;
        }
        this.b = j3 + j;
        return j;
    }
}
