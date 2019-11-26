package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: xml */
public final class xml {
    public final Map a = new HashMap();
    public final xbr b;
    public final ScheduledExecutorService c;
    public final xsc d;
    public final Executor e;

    public xml(xbr xbr, ScheduledExecutorService scheduledExecutorService, xsc xsc, Executor executor) {
        this.b = (xbr) amqw.a((Object) xbr);
        this.c = scheduledExecutorService;
        this.d = (xsc) amqw.a((Object) xsc);
        this.e = (Executor) amqw.a((Object) executor);
    }

    public final synchronized void a(nkp nkp) {
        xak.b();
        this.b.a(nkp.b, nkp);
        b(nkp);
    }

    public final void b(nkp nkp) {
        long max = Math.max(nkp.c - this.d.a(), 0);
        xmq xmq = new xmq(this);
        if (nkp.d <= 0) {
            String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for one time execution.", new Object[]{nkp.b});
            this.c.schedule(xmq, max, TimeUnit.MILLISECONDS);
            return;
        }
        String.format(Locale.US, "Scheduling task %s with ScheduledExecutorService for repeating execution.", new Object[]{nkp.b});
        this.c.scheduleAtFixedRate(xmq, max, nkp.d, TimeUnit.MILLISECONDS);
    }
}
