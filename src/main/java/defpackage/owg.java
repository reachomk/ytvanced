package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: owg */
public final class owg {
    private final Map a = new HashMap();
    private Map b;

    public final synchronized void a(String str, String str2) {
        this.b = null;
        this.a.put(str, str2);
    }

    public final synchronized void a() {
        this.b = null;
        this.a.clear();
    }

    public final synchronized Map b() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }
}
