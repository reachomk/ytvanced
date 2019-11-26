package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: alxk */
public final class alxk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private alxk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static alxk a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new alxk(bcaa, bcaa2, bcaa3);
    }

    public static alwu a(zyw zyw, uil uil, bcaa bcaa) {
        aord aord;
        aord aord2;
        aycu aycu = zyw.a().r;
        if (aycu == null) {
            aycu = aycu.f;
        }
        Object alwu = new alwu((ScheduledExecutorService) bcaa.get(), uil, "youtube_android");
        if (aycu != null) {
            aord = aycu.c;
            if (aord == null) {
                aord = aord.e;
            }
            if (!aord.b) {
                alwu.a(false);
                return (alwu) baqd.a(alwu, "Cannot return null from a non-@Nullable @Provides method");
            }
        }
        alwu.a(true);
        long j = 100;
        if (aycu != null) {
            aord2 = aycu.c;
            if (aord2 == null) {
                aord2 = aord.e;
            }
            if (((long) aord2.d) > 20) {
                aord = aycu.c;
                if (aord == null) {
                    aord = aord.e;
                }
                j = (long) aord.d;
            }
        }
        alwu.b.a(j);
        j = 60000;
        if (aycu != null) {
            aord2 = aycu.c;
            if (aord2 == null) {
                aord2 = aord.e;
            }
            if (((long) aord2.c) > 10000) {
                aord aord3 = aycu.c;
                if (aord3 == null) {
                    aord3 = aord.e;
                }
                j = (long) aord3.c;
            }
        }
        alwu.b.b(j);
        return (alwu) baqd.a(alwu, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return alxk.a((zyw) this.a.get(), (uil) this.b.get(), this.c);
    }
}
