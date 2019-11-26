package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* renamed from: batj */
public final class batj {
    public String a;
    public String b;
    private SocketAddress c;
    private InetSocketAddress d;

    private batj() {
    }

    public final batj a(SocketAddress socketAddress) {
        this.c = (SocketAddress) amqw.a((Object) socketAddress, (Object) "proxyAddress");
        return this;
    }

    public final batj a(InetSocketAddress inetSocketAddress) {
        this.d = (InetSocketAddress) amqw.a((Object) inetSocketAddress, (Object) "targetAddress");
        return this;
    }

    public final batk a() {
        return new batk(this.c, this.d, this.a, this.b);
    }

    /* synthetic */ batj(byte b) {
    }
}
