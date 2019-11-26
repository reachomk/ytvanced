package defpackage;

import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* renamed from: baqm */
public final class baqm implements Runnable {
    public final InputStream a;
    public final Socket b;
    private final /* synthetic */ baqk c;

    public final void run() {
        try {
            Object outputStream = this.b.getOutputStream();
            baqt baqt = new baqt(this.c, this.c.k.a(), this.a, outputStream, this.b.getInetAddress());
            while (!this.b.isClosed()) {
                baqt.a();
            }
            baqk.a(outputStream);
            baqk.a(this.a);
            baqk.a(this.b);
            this.c.j.a(this);
        } catch (Exception e) {
            if (!((e instanceof SocketException) && "NanoHttpd Shutdown".equals(e.getMessage()))) {
                if (!(e instanceof SocketTimeoutException)) {
                    baqk.d.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", e);
                }
            }
            baqk.a(null);
            baqk.a(this.a);
            baqk.a(this.b);
            this.c.j.a(this);
        } catch (Throwable th) {
            baqk.a(null);
            baqk.a(this.a);
            baqk.a(this.b);
            this.c.j.a(this);
            throw th;
        }
    }

    /* synthetic */ baqm(baqk baqk, InputStream inputStream, Socket socket) {
        this.c = baqk;
        this.a = inputStream;
        this.b = socket;
    }
}
