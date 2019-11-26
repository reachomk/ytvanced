package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: afja */
public final class afja {
    private final Map a;

    public afja(Map map) {
        this.a = map;
    }

    public final Long a() {
        String b = b("x-head-time-millis");
        if (b != null) {
            try {
                return Long.valueOf(TimeUnit.MILLISECONDS.toMicros(Long.parseLong(b)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final Long b() {
        return a("x-head-seqnum");
    }

    public final Long c() {
        return a("x-segment-lmt");
    }

    public final Long a(String str) {
        str = b(str);
        if (str != null) {
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    private final String b(String str) {
        List list = (List) this.a.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }
}
