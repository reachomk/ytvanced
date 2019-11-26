package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/* renamed from: bcpg */
final class bcpg extends URLStreamHandler {
    private final bcjh a;

    public bcpg(bcjh bcjh) {
        this.a = bcjh;
    }

    public final URLConnection openConnection(URL url) {
        return this.a.a(url);
    }

    public final URLConnection openConnection(URL url, Proxy proxy) {
        return this.a.a(url, proxy);
    }
}
