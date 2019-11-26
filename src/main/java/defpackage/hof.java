package defpackage;

import java.util.Locale;
import java.util.Map;

/* renamed from: hof */
public final class hof {
    public final Map a;

    public hof(Map map) {
        this.a = map;
    }

    public static String a(Class cls, Class cls2) {
        return String.format(Locale.ROOT, "(%s, %s)", new Object[]{cls.getSimpleName(), cls2.getSimpleName()});
    }
}
