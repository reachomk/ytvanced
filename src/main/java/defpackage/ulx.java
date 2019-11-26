package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ulx */
public final class ulx extends FilterInputStream {
    private long a = 0;
    private final long b;
    private final byte[] c;

    public ulx(InputStream inputStream, long j, byte[] bArr) {
        super(inputStream);
        amqw.a(j >= 0);
        this.b = j;
        this.c = bArr;
    }

    public final boolean markSupported() {
        return false;
    }

    public final int available() {
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            if (j > j2) {
                long length = (long) this.c.length;
                if (j < j2 + length) {
                    return (int) ((length - (j - j2)) + ((long) this.in.available()));
                }
            }
            return this.in.available();
        } else if (j + ((long) this.in.available()) >= this.b) {
            return this.in.available() + this.c.length;
        } else {
            return this.in.available();
        }
    }

    public final synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final int read() {
        long j = this.a;
        long j2 = this.b;
        if (j >= j2) {
            byte[] bArr = this.c;
            if (j < ((long) bArr.length) + j2) {
                this.a = 1 + j;
                return bArr[(int) (j - j2)];
            }
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
            int read;
            long j = this.a;
            long j2 = this.b;
            if (j >= j2) {
                byte[] bArr2 = this.c;
                long length = ((long) bArr2.length) + j2;
                if (j >= length) {
                    read = this.in.read(bArr, i, i2);
                } else {
                    int i3 = (int) (length - j);
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    System.arraycopy(bArr2, (int) (j - j2), bArr, i, i2);
                    read = i2;
                }
            } else {
                j2 -= j;
                if (((long) i2) > j2) {
                    i2 = (int) j2;
                }
                read = this.in.read(bArr, i, i2);
            }
            this.a += (long) read;
            return read;
        }
    }

    public final synchronized void reset() {
        throw new IOException("Mark not supported");
    }

    public final long skip(long j) {
        amqw.a(j >= 0);
        long j2 = this.a;
        long j3 = this.b;
        if (j2 < j3) {
            j2 = j3 - j2;
            if (j > j2) {
                j = j2;
            }
            j = this.in.skip(j);
        } else {
            j3 += (long) this.c.length;
            if (j2 >= j3) {
                j = this.in.skip(j);
            } else {
                j2 = j3 - j2;
                if (j > j2) {
                    j = j2;
                }
            }
        }
        this.a += j;
        return j;
    }
}
