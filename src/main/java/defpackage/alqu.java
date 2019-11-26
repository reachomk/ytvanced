package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: alqu */
final class alqu implements afsw {
    private final /* synthetic */ alqv a;

    alqu(alqv alqv) {
        this.a = alqv;
    }

    public final void a(bqn bqn) {
        xtl.a(String.format("Failed to obtain summary for name: %s", new Object[]{this.a.a}), (Throwable) bqn);
        acum acum = this.a.h.d;
        alta alta = new alta();
        alta.b(5);
        alta.a(this.a.b);
        alta.a(bqn);
        alta.a(this.a.c);
        acum.a(alta.a());
        ((alqo) this.a.h.a.get()).b(this.a.a);
        alqv alqv = this.a;
        if (!alqv.f && (((bqn instanceof bqo) || ((alsa) alqv.h.c.get()).i) && alqv.c < ((alsa) alqv.h.c.get()).h)) {
            alqv = this.a;
            alqt alqt = alqv.h;
            ScheduledExecutorService scheduledExecutorService = alqt.e;
            double d = (double) ((alsa) alqt.c.get()).f;
            double pow = Math.pow((double) ((alsa) alqv.h.c.get()).g, (double) alqv.c);
            Double.isNaN(d);
            alqv.g = scheduledExecutorService.schedule(alqv, (long) ((int) (d * pow)), TimeUnit.SECONDS);
        }
        if (bqn instanceof bqo) {
            this.a.d = 2;
        } else {
            this.a.d = 1;
        }
    }
}
