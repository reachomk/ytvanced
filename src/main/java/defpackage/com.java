package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com */
public final class com {
    private final Map a = new HashMap();

    public final synchronized void a(cmg cmg, cor cor, String str) {
        if (str != null) {
            col col = (col) this.a.get(str);
            if (col != null) {
                col.b = true;
                int c = col.a.c();
                for (int i = 0; i < c; i++) {
                    coj coj = (coj) col.a.e(i);
                    coj.a = cor;
                    Object[] objArr = coj.c;
                    if (objArr != null) {
                        objArr[0] = cmg;
                    }
                }
            }
        }
    }

    public final synchronized void a() {
        Iterator it = this.a.keySet().iterator();
        while (it.hasNext()) {
            col col = (col) this.a.get(it.next());
            if (col != null) {
                if (col.b) {
                    col.b = false;
                }
            }
            it.remove();
        }
    }

    public final synchronized void a(String str, coj coj) {
        if (str != null) {
            col col = (col) this.a.get(str);
            if (col == null) {
                col = new col();
                this.a.put(str, col);
            }
            col.a.b(coj.b, coj);
        }
    }
}
