package defpackage;

import java.util.Comparator;

/* renamed from: rdi */
final class rdi implements Comparator {
    rdi() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        rdg rdg = (rdg) obj;
        rdg rdg2 = (rdg) obj2;
        rdm rdm = (rdm) rdg.iterator();
        rdm rdm2 = (rdm) rdg2.iterator();
        while (rdm.hasNext() && rdm2.hasNext()) {
            int compare = Integer.compare(rdg.a(rdm.a()), rdg.a(rdm2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(rdg.a(), rdg2.a());
    }
}
