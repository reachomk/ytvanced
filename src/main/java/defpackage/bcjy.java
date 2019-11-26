package defpackage;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bcjy */
public final class bcjy extends NetworkCallback {
    public Network a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect b;

    private final boolean a(Network network) {
        Network network2 = this.a;
        return (network2 == null || network2.equals(network)) ? false : true;
    }

    /* JADX WARNING: Missing block: B:8:0x0022, code skipped:
            if (defpackage.bcjw.b(r2) != false) goto L_0x0024;
     */
    private final boolean a(android.net.Network r2, android.net.NetworkCapabilities r3) {
        /*
        r1 = this;
        r0 = r1.a(r2);
        if (r0 == 0) goto L_0x0007;
    L_0x0006:
        goto L_0x0026;
    L_0x0007:
        if (r3 != 0) goto L_0x0011;
    L_0x0009:
        r3 = r1.b;
        r3 = r3.f;
        r3 = r3.c(r2);
    L_0x0011:
        if (r3 == 0) goto L_0x0026;
    L_0x0013:
        r0 = 4;
        r3 = r3.hasTransport(r0);
        if (r3 == 0) goto L_0x0024;
    L_0x001a:
        r3 = r1.b;
        r3 = r3.f;
        r2 = defpackage.bcjw.b(r2);
        if (r2 == 0) goto L_0x0026;
    L_0x0024:
        r2 = 0;
        return r2;
    L_0x0026:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcjy.a(android.net.Network, android.net.NetworkCapabilities):boolean");
    }

    public final void onAvailable(Network network) {
        NetworkCapabilities c = this.b.f.c(network);
        if (!a(network, c)) {
            boolean hasTransport = c.hasTransport(4);
            if (hasTransport) {
                this.a = network;
            }
            this.b.a(new bcjx(this, NetworkChangeNotifierAutoDetect.a(network), this.b.f.a(network), hasTransport));
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        if (!a(network, networkCapabilities)) {
            this.b.a(new bcka(this, NetworkChangeNotifierAutoDetect.a(network), this.b.f.a(network)));
        }
    }

    public final void onLosing(Network network, int i) {
        if (!a(network, null)) {
            this.b.a(new bcjz(this, NetworkChangeNotifierAutoDetect.a(network)));
        }
    }

    public final void onLost(Network network) {
        if (!a(network)) {
            this.b.a(new bckc(this, network));
            if (this.a != null) {
                this.a = null;
                for (Network onAvailable : NetworkChangeNotifierAutoDetect.a(this.b.f, network)) {
                    onAvailable(onAvailable);
                }
                this.b.a(new bckb(this, this.b.b().a()));
            }
        }
    }

    public /* synthetic */ bcjy(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.b = networkChangeNotifierAutoDetect;
    }
}
