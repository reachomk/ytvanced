package defpackage;

import java.util.Comparator;

/* renamed from: amze */
final class amze implements Comparator {
    amze() {
    }

    public final int compare(Object obj, Object obj2) {
        amzd a = amzd.a(obj);
        amzd a2 = amzd.a(obj2);
        if (a != a2) {
            return a.compareTo(a2);
        }
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (ordinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (ordinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (ordinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
