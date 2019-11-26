package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: csg */
public final class csg {
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    public final Map c = new LinkedHashMap();
    public final Map d = new HashMap();

    csg() {
    }

    public final Object a(csd csd) {
        return this.d.get(csd);
    }

    /* Access modifiers changed, original: final */
    public final void b(csd csd) {
        if (this.d.remove(csd) != null) {
            int i = csd.a;
            if (i == 1) {
                this.a.remove(csd.b);
            } else if (i == 2) {
                String str = csd.c;
                Map map = (Map) this.b.get(str);
                map.remove(csd.b);
                if (map.isEmpty()) {
                    this.b.remove(str);
                }
            } else if (i == 3) {
                this.c.remove(csd.b);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final csd a(String str) {
        return (csd) this.a.get(str);
    }

    public final Set a() {
        return this.d.keySet();
    }
}
