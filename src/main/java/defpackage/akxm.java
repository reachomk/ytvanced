package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: akxm */
public final class akxm {
    public final akxt a = new akxq();
    public final List b = new CopyOnWriteArrayList();

    public final void a(akxt akxt) {
        if (akxt != null) {
            this.b.add(0, akxt);
        }
    }

    public final List a(Object[] objArr) {
        int length;
        List list = (List) bbmi.a(objArr).c(new akxo(this)).d().a();
        Iterable arrayList = new ArrayList();
        int i = 0;
        while (true) {
            length = objArr.length;
            if (i >= length) {
                break;
            }
            ((akxt) list.get(i)).b();
            i++;
        }
        if (length > 0) {
            arrayList.add(bbmi.a(new akxp(length, list, objArr)));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        bbmi bbmi;
        if (arrayList.size() == 1) {
            bbmi = (bbmi) arrayList.get(0);
        } else {
            int i2 = bbmc.a;
            int i3 = bbmc.a;
            bbmi a = bbmi.a(arrayList);
            Object obj = bbod.a;
            bbow.a(obj, "mapper is null");
            bbow.a(i2, "maxConcurrency");
            bbow.a(i3, "prefetch");
            bbmi = new bbtd(a, obj, i2, i3);
        }
        return (List) bbmi.d().a();
    }
}
