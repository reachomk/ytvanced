package defpackage;

import java.util.Map;

/* renamed from: aesz */
final class aesz {
    public final long a;

    aesz(Map map) {
        "Offline".equals(map.get("LicenseType"));
        String str = "True";
        str.equals(map.get("PersistAllowed"));
        String str2 = "LicenseDurationRemaining";
        this.a = aesz.a((String) map.get(str2), 0);
        str.equals(map.get("RenewAllowed"));
        aesz.a((String) map.get(str2), Integer.MAX_VALUE);
    }

    private static long a(String str, int i) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return (long) i;
        }
    }
}
