package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: banf */
public final class banf extends bang {
    private final Logger a;

    public banf(String str) {
        this.a = Logger.getLogger(str);
    }

    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
