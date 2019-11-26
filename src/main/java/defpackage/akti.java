package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: akti */
public final class akti {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public Pattern c;

    public final boolean a() {
        return this.c != null;
    }

    public final Pattern b() {
        return !this.b.isEmpty() ? this.c : null;
    }

    public final aygk a(String str) {
        if (!this.a.containsKey(str)) {
            return null;
        }
        aygk aygk = ((ardw) this.a.get(str)).d;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return aygk;
    }

    public final String b(String str) {
        return this.b.containsKey(str.toLowerCase(Locale.ROOT)) ? (String) this.b.get(str.toLowerCase(Locale.ROOT)) : null;
    }
}
