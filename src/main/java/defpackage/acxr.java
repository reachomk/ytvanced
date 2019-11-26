package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: acxr */
final class acxr {
    public final boolean a;
    public final xsc b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public static String a(long j, long j2) {
        return String.valueOf(Long.toString(j - j2)).concat(" ms");
    }

    public final void a(String str) {
        if (this.a) {
            String str2 = "[DefaultLatencyLogger] ";
            str = String.valueOf(str);
            xtl.e(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }

    public final void a(String str, String str2) {
        if (this.a) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
            stringBuilder.append("<");
            stringBuilder.append(str);
            stringBuilder.append("> ");
            stringBuilder.append(str2);
            a(stringBuilder.toString());
        }
    }

    public final void b(String str) {
        if (this.a) {
            str = String.valueOf(str);
            String str2 = "Client Action Nonce is empty when calling ";
            a(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }

    public final long a(atyw atyw, String str) {
        Long l = (Long) this.c.get(new zz(atyw, str));
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    /* synthetic */ acxr(boolean z, xsc xsc) {
        this.a = z;
        this.b = (xsc) amqw.a((Object) xsc);
    }
}
