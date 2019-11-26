package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* renamed from: batk */
public final class batk extends bavp {
    public static final long serialVersionUID = 0;
    public final InetSocketAddress a;
    private final SocketAddress b;
    private final String c;
    private final String d;

    public final boolean equals(Object obj) {
        if (obj instanceof batk) {
            batk batk = (batk) obj;
            if (amqq.a(this.b, batk.b) && amqq.a(this.a, batk.a) && amqq.a(this.c, batk.c) && amqq.a(this.d, batk.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d});
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("proxyAddr", this.b);
        a.a("targetAddr", this.a);
        a.a(utl.USERNAME, this.c);
        a.a("hasPassword", this.d != null);
        return a.toString();
    }

    public static batj a() {
        return new batj();
    }

    /* synthetic */ batk(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        amqw.a((Object) socketAddress, (Object) "proxyAddress");
        amqw.a((Object) inetSocketAddress, (Object) "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            amqw.b(((InetSocketAddress) socketAddress).isUnresolved() ^ 1, "The proxy address %s is not resolved", (Object) socketAddress);
        }
        this.b = socketAddress;
        this.a = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }
}
