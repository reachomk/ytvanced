package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: bsz */
public final class bsz {
    private static final bta b = new btc();
    private final Map a = new HashMap();

    public final synchronized void a(bta bta) {
        this.a.put(bta.a(), bta);
    }

    public final synchronized bsx a(Object obj) {
        bta bta;
        chw.a(obj);
        bta = (bta) this.a.get(obj.getClass());
        if (bta == null) {
            for (bta bta2 : this.a.values()) {
                if (bta2.a().isAssignableFrom(obj.getClass())) {
                    bta = bta2;
                    break;
                }
            }
        }
        if (bta == null) {
            bta = b;
        }
        return bta.a(obj);
    }
}
