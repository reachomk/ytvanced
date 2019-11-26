package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: ozd */
public final class ozd extends BufferedOutputStream {
    private boolean a;

    public ozd(OutputStream outputStream) {
        super(outputStream);
    }

    public ozd(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public final void close() {
        Throwable th;
        this.a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final void a(OutputStream outputStream) {
        oxz.b(this.a);
        this.out = outputStream;
        this.count = 0;
        this.a = false;
    }
}
