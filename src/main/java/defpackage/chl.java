package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: chl */
public final class chl extends FilterInputStream {
    private final long a;
    private int b;

    public chl(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public final synchronized int available() {
        return (int) Math.max(this.a - ((long) this.b), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return a(super.read(bArr, i, i2));
    }

    private final int a(int i) {
        if (i < 0) {
            long j = this.a;
            int i2 = this.b;
            if (j - ((long) i2) > 0) {
                StringBuilder stringBuilder = new StringBuilder(87);
                stringBuilder.append("Failed to read all expected data, expected: ");
                stringBuilder.append(j);
                stringBuilder.append(", but read: ");
                stringBuilder.append(i2);
                throw new IOException(stringBuilder.toString());
            }
        }
        this.b += i;
        return i;
    }
}
