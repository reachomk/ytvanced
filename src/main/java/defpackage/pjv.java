package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: pjv */
final class pjv {
    public final Map a = new HashMap();
    private final Map b = new HashMap();
    private final Map c = new HashMap();

    public final pjv a(String str, String str2, int i) {
        this.b.put(str, str2);
        this.a.put(str2, str);
        this.c.put(str, Integer.valueOf(i));
        return this;
    }

    public final String a(String str) {
        return (String) this.b.get(str);
    }

    public final int b(String str) {
        Integer num = (Integer) this.c.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
