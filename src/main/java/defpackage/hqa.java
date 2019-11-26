package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: hqa */
public final class hqa {
    public static final long a = TimeUnit.DAYS.toSeconds(30);
    public final zyw b;
    public final agwu c;
    private final xhv d;
    private final xsc e;
    private final SharedPreferences f;

    public hqa(zyw zyw, xhv xhv, xsc xsc, SharedPreferences sharedPreferences, agwu agwu) {
        this.b = zyw;
        this.d = xhv;
        this.e = xsc;
        this.f = sharedPreferences;
        this.c = agwu;
    }

    public final void a(long j) {
        if (foh.M(this.b) && this.d.c() && !b(j)) {
            agwu agwu = this.c;
            anjv anjv = agwu.f;
            if (anjv == null || anjv.isCancelled() || agwu.f.isDone()) {
                agwu.f = anja.c(anja.c(anjf.a(((agwc) agwu.d.get()).b())).a(agxd.a, agwu.a).a(new agwv(agwu), aniv.a)).a(new agwt(agwu), aniv.a);
                xan.a(agwu.f, aniv.a, new agww(), new agwy(agwu));
            }
            this.f.edit().putLong(ebn.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, this.e.a()).apply();
        }
    }

    public final boolean b(long j) {
        return this.e.a() - this.f.getLong(ebn.OFFLINE_LAST_CLIENT_VIDEO_PLAYBACK_POSITION_SYNC_TIME_MILLIS, 0) < TimeUnit.SECONDS.toMillis(j);
    }
}
