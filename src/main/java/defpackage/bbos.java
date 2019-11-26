package defpackage;

import java.util.Comparator;

/* renamed from: bbos */
final class bbos implements Comparator {
    bbos() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }
}
