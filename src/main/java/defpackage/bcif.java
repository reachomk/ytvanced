package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

/* renamed from: bcif */
public final class bcif {
    public static Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getBoundNetworkForProcess();
    }

    public static long a(Network network) {
        return network.getNetworkHandle();
    }

    public static Network b(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }

    public static NetworkInfo a(ConnectivityManager connectivityManager, Network network) {
        return connectivityManager.getNetworkInfo(network);
    }
}
