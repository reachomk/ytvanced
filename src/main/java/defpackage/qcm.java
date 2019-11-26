package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qcm */
public final class qcm {
    public final Map a = Collections.synchronizedMap(new HashMap());

    qcm() {
    }

    public final Object a(Object obj) {
        return this.a.get(obj);
    }
}
