package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbka */
public final class bbka {
    public static final bbjz a;
    private static final Logger b = Logger.getLogger(bbka.class.getName());

    private bbka() {
    }

    static {
        bbjz bbjz;
        ClassLoader classLoader = bbjz.class.getClassLoader();
        try {
            bbjz = (bbjz) bbir.a(Class.forName("io.opencensus.impl.tags.TagsComponentImpl", true, classLoader), bbjz.class);
        } catch (ClassNotFoundException e) {
            b.logp(Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load full implementation for TagsComponent, now trying to load lite implementation.", e);
            try {
                bbjz = (bbjz) bbir.a(Class.forName("io.opencensus.impllite.tags.TagsComponentImplLite", true, classLoader), bbjz.class);
            } catch (ClassNotFoundException e2) {
                b.logp(Level.FINE, "io.opencensus.tags.Tags", "loadTagsComponent", "Couldn't load lite implementation for TagsComponent, now using default implementation for TagsComponent.", e2);
                bbjz = new bbjs();
            }
        }
        a = bbjz;
    }
}
