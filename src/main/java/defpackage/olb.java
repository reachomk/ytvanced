package defpackage;

import java.util.Comparator;

/* renamed from: olb */
final /* synthetic */ class olb implements Comparator {
    private final olh a;

    olb(olh olh) {
        this.a = olh;
    }

    public final int compare(Object obj, Object obj2) {
        olh olh = this.a;
        return olh.a(obj2) - olh.a(obj);
    }
}
