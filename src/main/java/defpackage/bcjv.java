package defpackage;

import android.net.ConnectivityManager.NetworkCallback;
import android.net.LinkProperties;
import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bcjv */
public final class bcjv extends NetworkCallback {
    private final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public final void onAvailable(Network network) {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (networkChangeNotifierAutoDetect.i) {
            networkChangeNotifierAutoDetect.c();
        }
    }

    public final void onLost(Network network) {
        onAvailable(null);
    }

    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        onAvailable(null);
    }

    public /* synthetic */ bcjv(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }
}
