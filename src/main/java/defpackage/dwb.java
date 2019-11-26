package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: dwb */
final class dwb implements exv {
    private final /* synthetic */ dwc a;

    dwb(dwc dwc) {
        this.a = dwc;
    }

    public final void b() {
    }

    public final void a() {
        dwc dwc = this.a;
        List list = (List) dwc.a.get(dwe.a);
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dwd dwd = (dwd) it.next();
                aabd.a(dwc.b, dwd.a, dwd.b);
                it.remove();
            }
        }
    }
}
