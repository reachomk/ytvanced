package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Locale;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: aivm */
final class aivm extends InputStream {
    private final RandomAccessFile a;
    private long b;
    private long c;
    private final byte[] d;
    private final Key e;
    private final IvParameterSpec f;

    aivm(File file, long j, long j2, Key key) {
        amqw.a((Object) file);
        amqw.a(j <= j2, (Object) "begin must be less than or equal to end");
        amqw.a((Object) key);
        this.c = (j2 - j) + 1;
        this.b = j;
        this.a = new RandomAccessFile(file, "r");
        this.a.seek(j);
        this.e = key;
        this.f = xsf.a(file.getName());
        this.d = new byte[1];
    }

    public final int read() {
        if (this.c > 0) {
            int read = this.a.read();
            if (read != -1) {
                byte[] bArr = this.d;
                bArr[0] = (byte) read;
                try {
                    xsf.a(bArr, 0, 1, this.e, this.f, this.b);
                    this.b++;
                    this.c--;
                    return this.d[0] & 255;
                } catch (GeneralSecurityException e) {
                    throw new IOException(e.toString());
                }
            }
        }
        return -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j <= 0) {
            return -1;
        }
        i2 = this.a.read(bArr, i, (int) Math.min((long) i2, j));
        if (i2 > 0) {
            try {
                xsf.a(bArr, i, i2, this.e, this.f, this.b);
                long j2 = (long) i2;
                this.c -= j2;
                this.b += j2;
            } catch (GeneralSecurityException e) {
                throw new IOException(e.toString());
            }
        }
        return i2;
    }

    public final void close() {
        String.format(Locale.US, "Stream closed with %d bytes left unread", new Object[]{Long.valueOf(this.c)});
        this.a.close();
    }
}
