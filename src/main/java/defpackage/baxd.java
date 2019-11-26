package defpackage;

import java.net.SocketAddress;
import java.net.URI;

/* renamed from: baxd */
final class baxd extends bave {
    public final SocketAddress a;
    public final String b;

    baxd(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
    }

    public final String a() {
        return "directaddress";
    }

    public final bava a(URI uri, bauz bauz) {
        return new baxg(this);
    }
}
