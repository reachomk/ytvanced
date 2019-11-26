package defpackage;

import java.util.Comparator;

/* renamed from: rxm */
final class rxm implements Comparator {
    rxm() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        rvz rvz = (rvz) obj;
        rvz rvz2 = (rvz) obj2;
        int i = rvz.h;
        int i2 = rvz2.h;
        return i == i2 ? rvz.a.compareTo(rvz2.a) : i - i2;
    }
}
