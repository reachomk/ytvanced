package defpackage;

import android.net.Uri;
import android.net.nsd.NsdManager.ResolveListener;
import android.net.nsd.NsdServiceInfo;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: alrt */
final class alrt implements ResolveListener {
    public final /* synthetic */ alrp a;
    private final long b = SystemClock.elapsedRealtime();
    private final AtomicInteger c = new AtomicInteger();

    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        int incrementAndGet = this.c.incrementAndGet();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        alrp alrp = this.a;
        if (alrp.g.e && incrementAndGet < alrp.c.d) {
            xtl.d(String.format(Locale.US, "Resolve of %s failed %d times after %d ms, but will retry, code: %d: %s", new Object[]{nsdServiceInfo, Integer.valueOf(incrementAndGet), Long.valueOf(elapsedRealtime), Integer.valueOf(i), alrp.a(i)}));
            ScheduledExecutorService scheduledExecutorService = this.a.d;
            alrs alrs = new alrs(this, nsdServiceInfo);
            alrp alrp2 = this.a;
            int i2 = alrp2.c.c;
            scheduledExecutorService.schedule(alrs, (long) (i2 + alrp2.f.nextInt(i2)), TimeUnit.MILLISECONDS);
            return;
        }
        String format = String.format(Locale.US, "Resolve of %s failed %d times after %d ms, code: %d: %s", new Object[]{nsdServiceInfo, Integer.valueOf(incrementAndGet), Long.valueOf(elapsedRealtime), Integer.valueOf(i), alrp.a(i)});
        afpc.a(2, afpf.spacecast, format);
        xtl.c(format);
    }

    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        String format = String.format(Locale.US, "http://%s:%d", new Object[]{nsdServiceInfo.getHost().getHostAddress(), Integer.valueOf(nsdServiceInfo.getPort())});
        String.format(Locale.US, "Resolved %s to %s", new Object[]{nsdServiceInfo.getServiceName(), format});
        alrp alrp = this.a;
        String serviceName = nsdServiceInfo.getServiceName();
        Uri parse = Uri.parse(format);
        alqb alqb = alrp.a;
        alqb.a(alqb.f, parse, new alrr(alrp, serviceName), alqb.a.a);
    }

    /* synthetic */ alrt(alrp alrp) {
        this.a = alrp;
    }
}
