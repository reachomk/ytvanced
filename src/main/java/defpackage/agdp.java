package defpackage;

import java.util.Comparator;
import java.util.Map.Entry;

/* renamed from: agdp */
final /* synthetic */ class agdp implements Comparator {
    public static final Comparator a = new agdp();

    private agdp() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Long) ((Entry) obj2).getValue()).compareTo((Long) ((Entry) obj).getValue());
    }
}
