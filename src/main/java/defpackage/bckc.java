package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bckc */
final class bckc implements Runnable {
    private final /* synthetic */ Network a;
    private final /* synthetic */ bcjy b;

    bckc(bcjy bcjy, Network network) {
        this.b = bcjy;
        this.a = network;
    }

    public final void run() {
        this.b.b.c.b(NetworkChangeNotifierAutoDetect.a(this.a));
    }
}
