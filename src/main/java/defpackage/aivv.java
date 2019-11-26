package defpackage;

import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Locale;

/* renamed from: aivv */
final class aivv extends InputStream {
    private final RandomAccessFile a;
    private long b;

    aivv(File file, long j, long j2) {
        amqw.a((Object) file);
        amqw.a(j <= j2, (Object) "begin must be less than or equal to end");
        this.b = (j2 - j) + 1;
        this.a = new RandomAccessFile(file, "r");
        this.a.seek(j);
    }

    public final int read() {
        if (this.b > 0) {
            int read = this.a.read();
            if (read != -1) {
                this.b--;
                return read;
            }
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.b;
        if (j <= 0) {
            return -1;
        }
        int read = this.a.read(bArr, 0, (int) Math.min((long) i2, j));
        if (read > 0) {
            this.b -= (long) read;
        }
        return read;
    }

    public final void close() {
        String.format(Locale.getDefault(), "Stream closed with %d bytes left unread", new Object[]{Long.valueOf(this.b)});
        this.a.close();
    }
}
