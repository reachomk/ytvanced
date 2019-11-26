package defpackage;

import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: bcpo */
public final class bcpo {
    public static volatile Map a;
    private static volatile bcpr b = new bcpq();

    private static void a(Map map, String str, String str2) {
        try {
            map.put(str, bcpt.a(str2));
        } catch (RuntimeException unused) {
        }
    }

    public static final long a() {
        return b.a();
    }

    public static final long a(bcqe bcqe) {
        return bcqe.a();
    }

    public static final bcpl b(bcqe bcqe) {
        bcpl b = bcqe.b();
        return b == null ? bcrf.L() : b;
    }

    public static final bcpl a(bcpl bcpl) {
        return bcpl == null ? bcrf.L() : bcpl;
    }

    public static final DateFormatSymbols a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", new Class[]{Locale.class}).invoke(null, new Object[]{locale});
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", bcpt.a);
        linkedHashMap.put("UTC", bcpt.a);
        linkedHashMap.put("GMT", bcpt.a);
        String str = "America/New_York";
        bcpo.a(linkedHashMap, "EST", str);
        bcpo.a(linkedHashMap, "EDT", str);
        str = "America/Chicago";
        bcpo.a(linkedHashMap, "CST", str);
        bcpo.a(linkedHashMap, "CDT", str);
        str = "America/Denver";
        bcpo.a(linkedHashMap, "MST", str);
        bcpo.a(linkedHashMap, "MDT", str);
        str = "America/Los_Angeles";
        bcpo.a(linkedHashMap, "PST", str);
        bcpo.a(linkedHashMap, "PDT", str);
        a = Collections.unmodifiableMap(linkedHashMap);
    }
}
