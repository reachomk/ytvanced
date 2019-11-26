package defpackage;

import java.io.OutputStream;

/* renamed from: anax */
public abstract class anax {
    protected anax() {
    }

    public abstract OutputStream a();

    public final void a(byte[] bArr) {
        amqw.a((Object) bArr);
        anbe a = anbe.a();
        try {
            OutputStream outputStream = (OutputStream) a.a(a());
            outputStream.write(bArr);
            outputStream.flush();
            a.close();
        } catch (Throwable th) {
            a.close();
        }
    }
}
