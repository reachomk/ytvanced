package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cyg */
public class cyg {
    public Map a;
    public Map b;

    public final Object a(boolean z) {
        return a("is_sticky", Boolean.valueOf(z));
    }

    public final Object a(int i) {
        return a("span_size", Integer.valueOf(i));
    }

    public final Object b(boolean z) {
        return a("is_full_span", Boolean.valueOf(z));
    }

    public final Object a(String str, Object obj) {
        if (this.a == null) {
            this.a = Collections.synchronizedMap(new HashMap());
        }
        this.a.put(str, obj);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a = null;
        this.b = null;
    }
}
