package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: bbic */
public final class bbic {
    public static volatile anxa a = anxa.b();

    public static bauy a(anze anze) {
        return new bbib(anze);
    }

    static long a(InputStream inputStream, OutputStream outputStream) {
        amqw.a((Object) inputStream);
        amqw.a((Object) outputStream);
        byte[] bArr = new byte[8192];
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
