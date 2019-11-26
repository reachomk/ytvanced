package defpackage;

import java.util.Map;

/* renamed from: oel */
public final class oel {
    public static long a(Map map, String str) {
        try {
            String str2 = (String) map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
        } catch (NumberFormatException unused) {
        }
        return -9223372036854775807L;
    }
}
