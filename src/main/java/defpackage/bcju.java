package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bcju */
public final class bcju implements Runnable {
    private final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public bcju(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    public final void run() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (networkChangeNotifierAutoDetect.i) {
            if (networkChangeNotifierAutoDetect.j) {
                networkChangeNotifierAutoDetect.j = false;
                return;
            }
            networkChangeNotifierAutoDetect.c();
        }
    }
}
