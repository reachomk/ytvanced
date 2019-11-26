package defpackage;

import java.util.Comparator;

/* renamed from: aerh */
final class aerh implements Comparator {
    aerh() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aerj aerj = (aerj) obj2;
        int i = ((aerj) obj).a;
        int i2 = aerj.a;
        if (i > i2) {
            i = 1;
        } else if (i < i2) {
            return -1;
        } else {
            i = 0;
        }
        return i;
    }
}
