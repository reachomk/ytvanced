package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bte */
public final class bte extends FilterInputStream {
    private static final byte[] a = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
    private final byte b;
    private int c;

    public bte(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("Cannot add invalid orientation: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.b = (byte) i;
    }

    public final boolean markSupported() {
        return false;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final int read() {
        int i = this.c;
        if (i < 2 || i > 31) {
            i = super.read();
        } else if (i != 31) {
            i = a[i - 2] & 255;
        } else {
            i = this.b;
        }
        if (i != -1) {
            this.c++;
        }
        return i;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read;
        int i3 = this.c;
        if (i3 > 31) {
            read = super.read(bArr, i, i2);
        } else if (i3 == 31) {
            bArr[i] = this.b;
            read = 1;
        } else if (i3 >= 2) {
            i2 = Math.min(31 - i3, i2);
            System.arraycopy(a, this.c - 2, bArr, i, i2);
            read = i2;
        } else {
            read = super.read(bArr, i, 2 - i3);
        }
        if (read > 0) {
            this.c += read;
        }
        return read;
    }

    public final long skip(long j) {
        j = super.skip(j);
        if (j > 0) {
            this.c = (int) (((long) this.c) + j);
        }
        return j;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }
}
