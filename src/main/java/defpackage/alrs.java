package defpackage;

import android.net.nsd.NsdServiceInfo;

/* renamed from: alrs */
final /* synthetic */ class alrs implements Runnable {
    private final alrt a;
    private final NsdServiceInfo b;

    alrs(alrt alrt, NsdServiceInfo nsdServiceInfo) {
        this.a = alrt;
        this.b = nsdServiceInfo;
    }

    public final void run() {
        alrt alrt = this.a;
        alrt.a.b.resolveService(this.b, alrt);
    }
}
