package defpackage;

import java.util.Comparator;

/* renamed from: cpi */
final class cpi implements Comparator {
    cpi() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cpd cpd = (cpd) obj;
        cpd cpd2 = (cpd) obj2;
        int i = cpd.e.bottom;
        int i2 = cpd2.e.bottom;
        return i == i2 ? cpd2.j - cpd.j : i - i2;
    }
}
