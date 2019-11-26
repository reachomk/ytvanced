package defpackage;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/* renamed from: xtg */
final /* synthetic */ class xtg implements URLStreamHandlerFactory {
    private final amro a;

    xtg(amro amro) {
        this.a = amro;
    }

    public final URLStreamHandler createURLStreamHandler(String str) {
        return ((URLStreamHandlerFactory) this.a.get()).createURLStreamHandler(str);
    }
}
