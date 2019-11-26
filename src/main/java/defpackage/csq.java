package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csq */
public final class csq {
    private final Map a = Collections.synchronizedMap(new HashMap());

    public final void a(Class cls, Object obj) {
        this.a.put(cls, obj);
    }

    public final Object a(Class cls) {
        return this.a.get(cls);
    }

    public static csq a(csq csq) {
        return csq != null ? csq.b(csq) : null;
    }

    public static csq b(csq csq) {
        csq csq2 = new csq();
        if (csq != null) {
            synchronized (csq.a) {
                csq2.a.putAll(csq.a);
            }
        }
        return csq2;
    }
}
