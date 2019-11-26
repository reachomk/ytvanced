package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: afyq */
public final class afyq implements afym {
    private static final long a = TimeUnit.HOURS.toSeconds(4);
    private final xsc b;
    private final agvs c;
    private final wya d;

    public afyq(xsc xsc, wya wya, agvs agvs) {
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = (agvs) amqw.a((Object) agvs);
        this.d = (wya) amqw.a((Object) wya);
    }

    public final void a(String str) {
        this.d.a("offline_auto_offline", 0, 1, true, 1, false, afyv.a(str), afyv.a, true, false);
    }

    public final void a(String str, long j, long j2) {
        String str2 = str;
        this.d.a("offline_auto_offline", j, j2, true, 1, false, afyv.a(str), afyv.a, true, false);
        this.c.c(str2, this.b.a() + TimeUnit.SECONDS.toMillis(j));
        this.c.d(str2, j2);
    }

    public final void b(String str) {
        String str2 = str;
        long c = this.c.c(str2);
        long d = this.c.d(str2);
        if (c > 0) {
            long toSeconds = TimeUnit.MILLISECONDS.toSeconds(Math.max(0, c - this.b.a()));
            if (d == 0) {
                d = a;
            }
            String str3 = "offline_auto_offline";
            this.d.a(str3, toSeconds, d, false, 1, false, afyv.a(str), afyv.a, true, false);
        }
    }

    public final void a() {
        this.d.a("offline_auto_offline");
    }

    public final void c(String str) {
        a();
        this.c.c(str, 0);
    }

    public final boolean d(String str) {
        return this.c.c(str) > 0;
    }
}
