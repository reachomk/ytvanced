package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: amnb */
public final class amnb {
    private final long a = 24;
    private final TimeUnit b;
    private final ScheduledExecutorService c;

    public static amnb a(TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return new amnb(timeUnit, scheduledExecutorService);
    }

    private amnb(TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        this.b = timeUnit;
        this.c = scheduledExecutorService;
    }

    public final anjv a(amng amng) {
        amne amne = new amne();
        amnf amnf = new amnf(amne);
        amne.b = amnf;
        amne.a = amng.getClass();
        anjv a = anjf.a(amnf, this.a, this.b, this.c);
        try {
            Object a2 = amng.a(amne);
            if (a2 != null) {
                amne.a = a2;
            }
        } catch (Exception e) {
            amnf.a(e);
        }
        return a;
    }
}
