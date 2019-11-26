package defpackage;

import java.util.Map;

/* renamed from: afho */
public class afho {
    private final Map a;

    public afho(Map map) {
        this.a = map;
    }

    public final String a(String str) {
        return (String) this.a.get(str);
    }

    public final Integer b(String str) {
        try {
            return this.a.containsKey(str) ? Integer.valueOf((String) this.a.get(str)) : null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Long c(String str) {
        try {
            return this.a.containsKey(str) ? Long.valueOf((String) this.a.get(str)) : null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Double d(String str) {
        try {
            return this.a.containsKey(str) ? Double.valueOf(Double.parseDouble((String) this.a.get(str))) : null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
