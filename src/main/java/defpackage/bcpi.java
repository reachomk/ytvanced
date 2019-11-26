package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: bcpi */
abstract class bcpi extends OutputStream {
    private boolean a;
    public IOException d;
    public boolean e;

    bcpi() {
    }

    public abstract void a();

    public abstract void b();

    public abstract bcks c();

    public void close() {
        this.a = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        if (this.e) {
            e();
            throw new IOException("Writing after request completed.");
        } else if (this.a) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        IOException iOException = this.d;
        if (iOException != null) {
            throw iOException;
        }
    }
}
