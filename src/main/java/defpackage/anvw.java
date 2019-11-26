package defpackage;

import java.util.Comparator;

/* renamed from: anvw */
final class anvw implements Comparator {
    anvw() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        anvu anvu = (anvu) obj;
        anvu anvu2 = (anvu) obj2;
        anvz anvz = (anvz) anvu.iterator();
        anvz anvz2 = (anvz) anvu2.iterator();
        while (anvz.hasNext() && anvz2.hasNext()) {
            int compare = Integer.compare(anvu.a(anvz.a()), anvu.a(anvz2.a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(anvu.b(), anvu2.b());
    }
}
