package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: nph */
public final class nph implements Comparator {
    public ArrayList a;
    public ArrayList b;
    public boolean c;

    protected nph() {
    }

    public final void a(npd npd) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        nph.a(this.a, npd);
    }

    public static void a(List list, npd npd) {
        if (!list.contains(npd)) {
            for (int i = 0; i < list.size(); i++) {
                nwf.b(((npd) list.get(i)).a.equals(npd.a) ^ 1);
            }
            list.add(npd);
        }
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((npd) obj).a.compareTo(((npd) obj2).a);
    }
}
