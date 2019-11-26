package defpackage;

import java.util.Comparator;

/* renamed from: afwl */
final /* synthetic */ class afwl implements Comparator {
    public static final Comparator a = new afwl();

    private afwl() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((afwd) obj).b.compareTo(((afwd) obj2).b);
    }
}
