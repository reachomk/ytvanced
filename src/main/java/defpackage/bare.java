package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.logging.Level;

/* renamed from: bare */
public final class bare implements Runnable {
    public IOException a;
    public boolean b = false;
    private final int c = 0;
    private final /* synthetic */ baqk d;

    public final void run() {
        try {
            SocketAddress inetSocketAddress;
            ServerSocket serverSocket = this.d.g;
            baqk baqk = this.d;
            String str = baqk.e;
            int i;
            if (str == null) {
                i = baqk.f;
                inetSocketAddress = new InetSocketAddress(0);
            } else {
                i = baqk.f;
                inetSocketAddress = new InetSocketAddress(str, 0);
            }
            serverSocket.bind(inetSocketAddress);
            this.b = true;
            do {
                try {
                    Socket accept = this.d.g.accept();
                    InputStream inputStream = accept.getInputStream();
                    baqk baqk2 = this.d;
                    baqk2.j.b(new baqm(baqk2, inputStream, accept));
                } catch (IOException e) {
                    baqk.d.log(Level.FINE, "Communication with the client broken", e);
                }
            } while (!this.d.g.isClosed());
        } catch (IOException e2) {
            this.a = e2;
        }
    }

    public /* synthetic */ bare(baqk baqk) {
        this.d = baqk;
    }
}
