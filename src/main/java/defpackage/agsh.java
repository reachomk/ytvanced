package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: agsh */
final /* synthetic */ class agsh implements anim {
    private final amul a;
    private final ScheduledExecutorService b;
    private final amuw c;
    private final anjv d;

    agsh(amul amul, ScheduledExecutorService scheduledExecutorService, amuw amuw, anjv anjv) {
        this.a = amul;
        this.b = scheduledExecutorService;
        this.c = amuw;
        this.d = anjv;
    }

    public final anjv a(Object obj) {
        amul amul = this.a;
        ScheduledExecutorService scheduledExecutorService = this.b;
        amuw amuw = this.c;
        return agsi.a(agsi.a((anjv) amul.get(0), !(((Exception) obj) instanceof TimeoutException) ? 2 : 1, scheduledExecutorService), amuw, new agsl(amul, scheduledExecutorService, amuw, this.d), scheduledExecutorService);
    }
}
