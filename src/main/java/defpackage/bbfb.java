package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbfb */
final class bbfb implements bavs {
    public static final Logger a = Logger.getLogger(bbfb.class.getName());
    private static final bbfg b = new bbfe();
    private static final amro c = new bbfd();
    private final amro d;
    private final bbfg e;
    private final InetSocketAddress f;

    public bbfb() {
        Object obj = c;
        Object obj2 = b;
        String str = System.getenv("GRPC_PROXY_EXP");
        this.d = (amro) amqw.a(obj);
        this.e = (bbfg) amqw.a(obj2);
        if (str != null) {
            String[] split = str.split(":", 2);
            int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "overrideProxy", "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
            this.f = new InetSocketAddress(split[0], parseInt);
            return;
        }
        this.f = null;
    }

    public final bavp a(SocketAddress socketAddress) {
        if (!(socketAddress instanceof InetSocketAddress)) {
            return null;
        }
        if (this.f == null) {
            return a((InetSocketAddress) socketAddress);
        }
        batj a = batk.a();
        a.a(this.f);
        a.a((InetSocketAddress) socketAddress);
        return a.a();
    }

    private final bavp a(InetSocketAddress inetSocketAddress) {
        String str = null;
        try {
            try {
                URI uri = new URI("https", null, bbby.a(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.d.get();
                String str2 = "detectProxy";
                String str3 = "io.grpc.internal.ProxyDetectorImpl";
                if (proxySelector == null) {
                    a.logp(Level.FINE, str3, str2, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List select = proxySelector.select(uri);
                if (select.size() > 1) {
                    a.logp(Level.WARNING, str3, str2, "More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = (Proxy) select.get(0);
                if (proxy.type() == Type.DIRECT) {
                    return null;
                }
                SocketAddress socketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = this.e.a(bbby.a((InetSocketAddress) socketAddress), socketAddress.getAddress(), socketAddress.getPort(), "https", "");
                if (socketAddress.isUnresolved()) {
                    socketAddress = new InetSocketAddress(InetAddress.getByName(socketAddress.getHostName()), socketAddress.getPort());
                }
                batj a2 = batk.a();
                a2.a(inetSocketAddress);
                a2.a(socketAddress);
                if (a == null) {
                    return a2.a();
                }
                a2.a = a.getUserName();
                if (a.getPassword() != null) {
                    str = new String(a.getPassword());
                }
                a2.b = str;
                return a2.a();
            } catch (URISyntaxException e) {
                a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", e);
                return null;
            }
        } catch (Throwable th) {
            a.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }
}
