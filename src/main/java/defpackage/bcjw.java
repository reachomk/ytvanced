package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* renamed from: bcjw */
public final class bcjw {
    public final ConnectivityManager a;

    public bcjw(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    bcjw() {
        this.a = null;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Missing block: B:5:0x000d, code skipped:
            return r1.a.getNetworkInfo(r2);
     */
    /* JADX WARNING: Missing block: B:8:0x000f, code skipped:
            return null;
     */
    private final android.net.NetworkInfo d(android.net.Network r2) {
        /*
        r1 = this;
        r0 = r1.a;	 Catch:{ NullPointerException -> 0x0007 }
        r2 = r0.getNetworkInfo(r2);	 Catch:{ NullPointerException -> 0x0007 }
        return r2;
    L_0x0007:
        r0 = r1.a;	 Catch:{ NullPointerException -> 0x000e }
        r2 = r0.getNetworkInfo(r2);	 Catch:{ NullPointerException -> 0x000e }
        return r2;
    L_0x000e:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcjw.d(android.net.Network):android.net.NetworkInfo");
    }

    public final int a(Network network) {
        NetworkInfo d = d(network);
        if (d != null && d.getType() == 17) {
            d = this.a.getActiveNetworkInfo();
        }
        return (d == null || !d.isConnected()) ? 6 : NetworkChangeNotifierAutoDetect.a(d.getType(), d.getSubtype());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x002f */
    /* JADX WARNING: Missing block: B:17:?, code skipped:
            r2.close();
     */
    public static boolean b(android.net.Network r3) {
        /*
        r0 = new java.net.Socket;
        r0.<init>();
        r1 = android.os.StrictMode.getVmPolicy();	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r2 = android.os.StrictMode.VmPolicy.LAX;	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        android.os.StrictMode.setVmPolicy(r2);	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r2 = new bchz;	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r2.<init>(r1);	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r3.bindSocket(r0);	 Catch:{ all -> 0x001e }
        r2.close();	 Catch:{ IOException -> 0x002f, all -> 0x002a }
        r0.close();	 Catch:{ IOException -> 0x001c }
    L_0x001c:
        r3 = 1;
        return r3;
    L_0x001e:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x0020 }
    L_0x0020:
        r1 = move-exception;
        r2.close();	 Catch:{ all -> 0x0025 }
        goto L_0x0029;
    L_0x0025:
        r2 = move-exception;
        defpackage.ankx.a(r3, r2);	 Catch:{ IOException -> 0x002f, all -> 0x002a }
    L_0x0029:
        throw r1;	 Catch:{ IOException -> 0x002f, all -> 0x002a }
    L_0x002a:
        r3 = move-exception;
        r0.close();	 Catch:{ IOException -> 0x002e }
    L_0x002e:
        throw r3;
    L_0x002f:
        r0.close();	 Catch:{ IOException -> 0x0032 }
    L_0x0032:
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcjw.b(android.net.Network):boolean");
    }

    public final NetworkCapabilities c(Network network) {
        return this.a.getNetworkCapabilities(network);
    }

    public final void a(NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    public final Network a() {
        Network b;
        if (VERSION.SDK_INT >= 23) {
            b = bcif.b(this.a);
            if (b != null) {
                return b;
            }
        }
        b = null;
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        for (Network network : NetworkChangeNotifierAutoDetect.a(this, null)) {
            NetworkInfo d = d(network);
            if (d != null && (d.getType() == activeNetworkInfo.getType() || d.getType() == 17)) {
                b = network;
            }
        }
        return b;
    }
}
