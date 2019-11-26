package defpackage;

import java.util.Comparator;

/* renamed from: hlf */
final /* synthetic */ class hlf implements Comparator {
    public static final Comparator a = new hlf();

    private hlf() {
    }

    public final int compare(Object obj, Object obj2) {
        return -Long.valueOf(((agqy) obj).i).compareTo(Long.valueOf(((agqy) obj2).i));
    }
}
