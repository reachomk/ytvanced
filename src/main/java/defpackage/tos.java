package defpackage;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: tos */
final class tos {
    public static final Map a = new EnumMap(bre.class);
    public static final amro b = amrn.a(new tov());
    public final toy c = new toy(this);
    public final Map d = new HashMap();
    public final tph e;
    public final tpg f;

    tos(tph tph) {
        this.e = tph;
        this.f = null;
    }

    static {
        a.put(bre.IMMEDIATE, Integer.valueOf(4));
        a.put(bre.HIGH, Integer.valueOf(3));
        a.put(bre.NORMAL, Integer.valueOf(2));
        a.put(bre.LOW, Integer.valueOf(1));
    }
}
