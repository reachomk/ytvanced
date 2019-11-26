package defpackage;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: xhz */
public final class xhz extends SSLSocketFactory {
    private final SSLSocketFactory a;

    public xhz(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    private static Socket a(Socket socket) {
        socket.setTcpNoDelay(true);
        return socket;
    }

    public final String[] getDefaultCipherSuites() {
        return this.a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.a.getSupportedCipherSuites();
    }

    public final Socket createSocket() {
        return xhz.a(this.a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return xhz.a(this.a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return xhz.a(this.a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return xhz.a(this.a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return xhz.a(this.a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return xhz.a(this.a.createSocket(socket, str, i, z));
    }
}
