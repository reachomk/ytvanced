package defpackage;

import java.util.Comparator;

/* renamed from: hoj */
final /* synthetic */ class hoj implements Comparator {
    public static final Comparator a = new hoj();

    private hoj() {
    }

    public final int compare(Object obj, Object obj2) {
        return -((Long) ((zz) obj).b).compareTo((Long) ((zz) obj2).b);
    }
}
