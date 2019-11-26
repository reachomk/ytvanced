package defpackage;

import java.util.Comparator;

/* renamed from: lis */
final /* synthetic */ class lis implements Comparator {
    public static final Comparator a = new lis();

    private lis() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Integer) obj2).intValue() - ((Integer) obj).intValue();
    }
}
