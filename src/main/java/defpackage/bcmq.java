package defpackage;

import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bcmq */
public final class bcmq extends bclr {
    private final String a;
    private final ExecutorService b;

    public bcmq(bclq bclq) {
        int a = bclq.a(9);
        this.a = bclq.e;
        this.b = new ThreadPoolExecutor(10, 20, 50, TimeUnit.SECONDS, new LinkedBlockingQueue(), new bcmt(a));
    }

    public final void a(bckr bckr) {
    }

    public final bcom a(String str, bckz bckz, Executor executor, int i, Collection collection, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, bckr bckr) {
        return new bcmw(bckz, this.b, executor, str, this.a, z2, false, 0, false, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final bcjf a(String str, bcix bcix, Executor executor, String str2, List list, int i, boolean z, Collection collection, boolean z2, int i2, boolean z3, int i3) {
        throw new UnsupportedOperationException("Can't create a bidi stream - httpurlconnection doesn't have those APIs");
    }

    public final bcji a(String str, bcix bcix, Executor executor) {
        throw new UnsupportedOperationException("The bidirectional stream API is not supported by the Java implementation of Cronet Engine");
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CronetHttpURLConnection/");
        stringBuilder.append(bcmo.a());
        return stringBuilder.toString();
    }

    public final URLConnection a(URL url) {
        return url.openConnection();
    }

    public final URLConnection a(URL url, Proxy proxy) {
        return url.openConnection(proxy);
    }

    public final URLStreamHandlerFactory b() {
        return new bcmv();
    }
}
