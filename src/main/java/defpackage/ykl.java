package defpackage;

import java.util.Comparator;

/* renamed from: ykl */
final /* synthetic */ class ykl implements Comparator {
    public static final Comparator a = new ykl();

    private ykl() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((yki) obj).g() > ((yki) obj2).g() ? 1 : (((yki) obj).g() == ((yki) obj2).g() ? 0 : -1));
    }
}
