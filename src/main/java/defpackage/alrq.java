package defpackage;

import android.net.nsd.NsdManager.DiscoveryListener;
import android.net.nsd.NsdServiceInfo;
import java.util.Locale;

/* renamed from: alrq */
final class alrq implements DiscoveryListener {
    private final /* synthetic */ alrp a;

    public final void onStartDiscoveryFailed(String str, int i) {
        xtl.d(String.format(Locale.US, "Discovery failed to start in state %s: Error code: %d: %s", new Object[]{this.a.g, Integer.valueOf(i), alrp.a(i)}));
        this.a.e();
    }

    public final void onStopDiscoveryFailed(String str, int i) {
        alrp alrp = this.a;
        alrp.b.stopServiceDiscovery(alrp.h);
    }

    public final void onDiscoveryStarted(String str) {
        String.format(Locale.US, "Discovery started in state %s for %s", new Object[]{this.a.g, str});
        this.a.c();
    }

    public final void onDiscoveryStopped(String str) {
        String.format("Discovery stopped in state %s: %s", new Object[]{this.a.g, str});
        this.a.d();
    }

    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        alrp alrp = this.a;
        if (nsdServiceInfo.getServiceType().equals(alrp.c.a)) {
            String.valueOf(nsdServiceInfo).length();
            alrp.b.resolveService(nsdServiceInfo, new alrt(alrp));
            return;
        }
        xtl.d(String.format(Locale.US, "Unexpected Service Type: %s wanted %s", new Object[]{nsdServiceInfo.getServiceType(), alrp.c.a}));
    }

    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        String.format(Locale.US, "Service lost: %s", new Object[]{nsdServiceInfo});
    }

    /* synthetic */ alrq(alrp alrp) {
        this.a = alrp;
    }
}
