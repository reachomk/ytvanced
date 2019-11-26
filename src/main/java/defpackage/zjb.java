package defpackage;

import java.util.Comparator;

/* renamed from: zjb */
final /* synthetic */ class zjb implements Comparator {
    public static final Comparator a = new zjb();

    private zjb() {
    }

    public final int compare(Object obj, Object obj2) {
        return -Long.valueOf(((zix) obj).g()).compareTo(Long.valueOf(((zix) obj2).g()));
    }
}
