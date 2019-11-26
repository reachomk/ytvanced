package org.chromium.net;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build.VERSION;
import defpackage.bchn;
import defpackage.bchv;
import defpackage.bcif;
import defpackage.bcjs;
import defpackage.bcjt;
import defpackage.bckd;
import defpackage.bcke;
import defpackage.bckp;
import java.util.ArrayList;
import java.util.Iterator;

public class NetworkChangeNotifier {
    public static NetworkChangeNotifier a;
    private final ArrayList b = new ArrayList();
    private final bchv c = new bchv();
    private final ConnectivityManager d = ((ConnectivityManager) bchn.a.getSystemService("connectivity"));
    private NetworkChangeNotifierAutoDetect e;
    private int f = 0;

    protected NetworkChangeNotifier() {
    }

    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    public static NetworkChangeNotifier init() {
        if (a == null) {
            a = new NetworkChangeNotifier();
        }
        return a;
    }

    public int getCurrentConnectionType() {
        return this.f;
    }

    public int getCurrentConnectionSubtype() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
        return networkChangeNotifierAutoDetect != null ? networkChangeNotifierAutoDetect.b().b() : 0;
    }

    public long getCurrentDefaultNetId() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
        if (networkChangeNotifierAutoDetect != null && VERSION.SDK_INT >= 21) {
            Network a = networkChangeNotifierAutoDetect.f.a();
            if (a != null) {
                return NetworkChangeNotifierAutoDetect.a(a);
            }
        }
        return -1;
    }

    public long[] getCurrentNetworksAndTypes() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
        int i = 0;
        if (networkChangeNotifierAutoDetect == null) {
            return new long[0];
        }
        if (VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] a = NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.f, null);
        int length = a.length;
        long[] jArr = new long[(length + length)];
        int i2 = 0;
        while (i < length) {
            Network network = a[i];
            int i3 = i2 + 1;
            jArr[i2] = NetworkChangeNotifierAutoDetect.a(network);
            i2 = i3 + 1;
            jArr[i3] = (long) networkChangeNotifierAutoDetect.f.a(network);
            i++;
        }
        return jArr;
    }

    public void addNativeObserver(long j) {
        this.b.add(Long.valueOf(j));
    }

    public void removeNativeObserver(long j) {
        this.b.remove(Long.valueOf(j));
    }

    public boolean registerNetworkCallbackFailed() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
        if (networkChangeNotifierAutoDetect == null) {
            return false;
        }
        return networkChangeNotifierAutoDetect.l;
    }

    private static void a() {
        a.a(false, new bckp());
    }

    public final void a(boolean z, bcke bcke) {
        if (!z) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.e;
            if (networkChangeNotifierAutoDetect != null) {
                networkChangeNotifierAutoDetect.d.b();
                networkChangeNotifierAutoDetect.a();
                this.e = null;
            }
        } else if (this.e == null) {
            this.e = new NetworkChangeNotifierAutoDetect(new bcjt(this), bcke);
            bckd b = this.e.b();
            a(b.a());
            b(b.b());
        }
    }

    public static void forceConnectivityState(boolean z) {
        a();
        NetworkChangeNotifier networkChangeNotifier = a;
        int i = 0;
        if ((networkChangeNotifier.f != 6) != z) {
            if (!z) {
                i = 6;
            }
            networkChangeNotifier.a(i);
            networkChangeNotifier.b(z ^ 1);
        }
    }

    public static void fakeNetworkConnected(long j, int i) {
        a();
        a.a(j, i);
    }

    public static void fakeNetworkSoonToBeDisconnected(long j) {
        a();
        a.a(j);
    }

    public static void fakeNetworkDisconnected(long j) {
        a();
        a.b(j);
    }

    public static void fakePurgeActiveNetworkList(long[] jArr) {
        a();
        a.a(jArr);
    }

    public static void fakeDefaultNetwork(long j, int i) {
        a();
        a.a(i, j);
    }

    public static void fakeConnectionSubtypeChanged(int i) {
        a();
        a.b(i);
    }

    public final void a(int i) {
        this.f = i;
        a(i, getCurrentDefaultNetId());
    }

    private final void a(int i, long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nativeNotifyConnectionTypeChanged(((Long) arrayList.get(i2)).longValue(), i, j);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((bcjs) it.next()).a();
        }
    }

    public final void b(int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nativeNotifyMaxBandwidthChanged(((Long) arrayList.get(i2)).longValue(), i);
        }
    }

    public final void a(long j, int i) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            nativeNotifyOfNetworkConnect(((Long) arrayList.get(i2)).longValue(), j, i);
        }
    }

    public final void a(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nativeNotifyOfNetworkSoonToDisconnect(((Long) arrayList.get(i)).longValue(), j);
        }
    }

    public final void b(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nativeNotifyOfNetworkDisconnect(((Long) arrayList.get(i)).longValue(), j);
        }
    }

    public final void a(long[] jArr) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nativeNotifyPurgeActiveNetworkList(((Long) arrayList.get(i)).longValue(), jArr);
        }
    }

    public static boolean isProcessBoundToNetwork() {
        NetworkChangeNotifier networkChangeNotifier = a;
        if (VERSION.SDK_INT >= 21) {
            if (VERSION.SDK_INT < 23) {
                if (ConnectivityManager.getProcessDefaultNetwork() != null) {
                    return true;
                }
            } else if (bcif.a(networkChangeNotifier.d) != null) {
                return true;
            }
        }
        return false;
    }
}
