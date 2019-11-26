package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: bbcx */
public final class bbcx {
    public static long a(InputStream inputStream, OutputStream outputStream) {
        amqw.a((Object) inputStream);
        amqw.a((Object) outputStream);
        byte[] bArr = new byte[16384];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }
}
