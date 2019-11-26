package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: dwc */
public final class dwc {
    public final Map a = new HashMap();
    public final aaas b;

    public dwc(exu exu, aaas aaas) {
        this.b = (aaas) amqw.a((Object) aaas);
        exu.a(new dwb(this));
    }

    public final void a(dwe dwe, List list, Map map) {
        amqw.a((Object) dwe);
        amqw.a((Object) map);
        if (list != null && !list.isEmpty()) {
            List list2 = (List) this.a.get(dwe);
            if (list2 == null) {
                list2 = new ArrayList();
                this.a.put(dwe, list2);
            }
            list2.add(new dwd(list, map));
        }
    }
}
