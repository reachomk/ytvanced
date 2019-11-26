package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: yup */
final /* synthetic */ class yup implements bbnv {
    private final yuh a;
    private final Collection b;
    private final ykp c;

    yup(yuh yuh, Collection collection, ykp ykp) {
        this.a = yuh;
        this.b = collection;
        this.c = ykp;
    }

    public final Object a(Object obj) {
        yuh yuh = this.a;
        Collection collection = this.b;
        ykp ykp = this.c;
        apsy e = ((apsz) ((ykk) obj).getEntity()).e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            e.a(((yie) it.next()).a);
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.add(ykk.a((apsz) e.a(yuh.a)));
        yks f = ykp.f();
        f.a = null;
        f.b = null;
        arrayList.add(f.a());
        return arrayList;
    }
}
