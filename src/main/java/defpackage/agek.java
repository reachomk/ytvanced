package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: agek */
public final class agek implements agej {
    public static final long a = TimeUnit.MINUTES.toSeconds(7);
    public static final long b = TimeUnit.MINUTES.toSeconds(30);
    public final xti c;
    private final zyw d;

    public agek(xti xti, zyw zyw) {
        this.c = (xti) amqw.a((Object) xti);
        this.d = (zyw) amqw.a((Object) zyw);
    }

    public final int a() {
        return this.c.a("offline_resync_continuation_deferred_service_threshold_seconds", 5);
    }

    public final boolean b() {
        return this.c.a("attempt_offline_resync_on_expired_continuation", true);
    }

    public final boolean c() {
        avno avno;
        apxn a = this.d.a();
        if (a == null) {
            avno = avno.c;
        } else {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            avno = auya.D;
            if (avno == null) {
                avno = avno.c;
            }
        }
        return avno.b;
    }

    static {
        TimeUnit.HOURS.toSeconds(72);
    }
}
