package defpackage;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/* renamed from: bcph */
public final class bcph implements URLStreamHandlerFactory {
    private final bcjh a;

    public bcph(bcjh bcjh) {
        this.a = bcjh;
    }

    public final URLStreamHandler createURLStreamHandler(String str) {
        if ("http".equals(str) || "https".equals(str)) {
            return new bcpg(this.a);
        }
        return null;
    }
}
