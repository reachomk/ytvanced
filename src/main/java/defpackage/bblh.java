package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bblh */
public final class bblh {
    public static final bbkz a;
    private static final Logger b = Logger.getLogger(bblh.class.getName());

    private bblh() {
    }

    static {
        bbkz bbkz;
        ClassLoader classLoader = bbkz.class.getClassLoader();
        try {
            bbkz = (bbkz) bbir.a(Class.forName("io.opencensus.impl.trace.TraceComponentImpl", true, classLoader), bbkz.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load full implementation for TraceComponent, now trying to load lite implementation.", e);
            try {
                bbkz = (bbkz) bbir.a(Class.forName("io.opencensus.impllite.trace.TraceComponentImplLite", true, classLoader), bbkz.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.trace.Tracing", "loadTraceComponent", "Couldn't load lite implementation for TraceComponent, now using default implementation for TraceComponent.", e2);
                bbkz = new bblc();
            }
        }
        a = bbkz;
    }
}
