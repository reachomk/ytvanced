package defpackage;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build.VERSION;
import android.os.Handler;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bcke */
public abstract class bcke {
    public NetworkChangeNotifierAutoDetect a;

    public void a(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        throw null;
    }

    public abstract void b();

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.a;
        if (!networkChangeNotifierAutoDetect.i) {
            if (networkChangeNotifierAutoDetect.k) {
                networkChangeNotifierAutoDetect.c();
            }
            bcjv bcjv = networkChangeNotifierAutoDetect.e;
            if (bcjv != null) {
                try {
                    networkChangeNotifierAutoDetect.f.a.registerDefaultNetworkCallback(bcjv, networkChangeNotifierAutoDetect.a);
                } catch (RuntimeException unused) {
                    networkChangeNotifierAutoDetect.e = null;
                }
            }
            int i = 0;
            if (networkChangeNotifierAutoDetect.e == null) {
                networkChangeNotifierAutoDetect.j = bchn.a.registerReceiver(networkChangeNotifierAutoDetect, networkChangeNotifierAutoDetect.b) != null;
            }
            networkChangeNotifierAutoDetect.i = true;
            bcjy bcjy = networkChangeNotifierAutoDetect.g;
            if (bcjy != null) {
                Network[] a = NetworkChangeNotifierAutoDetect.a(bcjy.b.f, null);
                bcjy.a = null;
                if (a.length == 1) {
                    NetworkCapabilities c = bcjy.b.f.c(a[0]);
                    if (c != null && c.hasTransport(4)) {
                        bcjy.a = a[0];
                    }
                }
                try {
                    bcjw bcjw = networkChangeNotifierAutoDetect.f;
                    NetworkRequest networkRequest = networkChangeNotifierAutoDetect.h;
                    bcjy bcjy2 = networkChangeNotifierAutoDetect.g;
                    Handler handler = networkChangeNotifierAutoDetect.a;
                    if (VERSION.SDK_INT >= 26) {
                        bcjw.a.registerNetworkCallback(networkRequest, bcjy2, handler);
                    } else {
                        bcjw.a.registerNetworkCallback(networkRequest, bcjy2);
                    }
                } catch (RuntimeException unused2) {
                    networkChangeNotifierAutoDetect.l = true;
                    networkChangeNotifierAutoDetect.g = null;
                }
                if (!networkChangeNotifierAutoDetect.l && networkChangeNotifierAutoDetect.k) {
                    Network[] a2 = NetworkChangeNotifierAutoDetect.a(networkChangeNotifierAutoDetect.f, null);
                    long[] jArr = new long[a2.length];
                    while (i < a2.length) {
                        jArr[i] = NetworkChangeNotifierAutoDetect.a(a2[i]);
                        i++;
                    }
                    networkChangeNotifierAutoDetect.c.a(jArr);
                }
            }
        }
    }
}
