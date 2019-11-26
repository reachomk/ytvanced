package defpackage;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: agze */
final class agze implements Comparator {
    private agze() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        Pair pair2 = (Pair) obj2;
        if (((Integer) pair2.first).intValue() == ((Integer) pair.first).intValue()) {
            return ((Long) pair.second).compareTo((Long) pair2.second);
        }
        return ((Integer) pair2.first).compareTo((Integer) pair.first);
    }

    /* synthetic */ agze(byte b) {
    }
}
