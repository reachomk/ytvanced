package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbjg */
public final class bbjg {
    public static final bbjf a;
    private static final Logger b = Logger.getLogger(bbjg.class.getName());

    private bbjg() {
    }

    static {
        bbjf bbjf;
        ClassLoader classLoader = bbjf.class.getClassLoader();
        try {
            bbjf = (bbjf) bbir.a(Class.forName("io.opencensus.impl.stats.StatsComponentImpl", true, classLoader), bbjf.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load full implementation for StatsComponent, now trying to load lite implementation.", e);
            try {
                bbjf = (bbjf) bbir.a(Class.forName("io.opencensus.impllite.stats.StatsComponentImplLite", true, classLoader), bbjf.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.stats.Stats", "loadStatsComponent", "Couldn't load lite implementation for StatsComponent, now using default implementation for StatsComponent.", e2);
                bbjf = new bbjb();
            }
        }
        a = bbjf;
    }
}
