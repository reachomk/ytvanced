package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import defpackage.bchn;
import defpackage.bcif;
import defpackage.bcju;
import defpackage.bcjv;
import defpackage.bcjw;
import defpackage.bcjy;
import defpackage.bckd;
import defpackage.bcke;
import defpackage.bckf;
import defpackage.bckh;
import java.util.Arrays;

public final class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    public final Handler a = new Handler(this.m);
    public final NetworkConnectivityIntentFilter b;
    public final bckf c;
    public final bcke d;
    public bcjv e;
    public final bcjw f;
    public bcjy g;
    public final NetworkRequest h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    private final Looper m = Looper.myLooper();
    private bckh n;
    private bckd o;

    class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    public NetworkChangeNotifierAutoDetect(bckf bckf, bcke bcke) {
        this.c = bckf;
        this.f = new bcjw(bchn.a);
        if (VERSION.SDK_INT < 23) {
            this.n = new bckh(bchn.a);
        }
        bcjv bcjv = null;
        if (VERSION.SDK_INT >= 21) {
            this.g = new bcjy(this);
            this.h = new Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.g = null;
            this.h = null;
        }
        if (VERSION.SDK_INT >= 28) {
            bcjv = new bcjv(this);
        }
        this.e = bcjv;
        this.o = b();
        this.b = new NetworkConnectivityIntentFilter();
        this.j = false;
        this.k = false;
        this.d = bcke;
        this.d.a(this);
        this.k = true;
    }

    public static int a(int i, int i2) {
        int i3 = 5;
        if (i == 0) {
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 3;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    return 4;
                case 13:
                    return 5;
                default:
                    return 0;
            }
        } else if (i == 1) {
            return 2;
        } else {
            if (i != 6) {
                i3 = 7;
                if (i != 7) {
                    return i != 9 ? 0 : 1;
                }
            }
            return i3;
        }
    }

    public final void a(Runnable runnable) {
        if (this.m == Looper.myLooper()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }

    public final void a() {
        if (this.i) {
            this.i = false;
            NetworkCallback networkCallback = this.g;
            if (networkCallback != null) {
                this.f.a(networkCallback);
            }
            networkCallback = this.e;
            if (networkCallback != null) {
                this.f.a(networkCallback);
                return;
            }
            bchn.a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00fe */
    /* JADX WARNING: Failed to process nested try/catch */
    public final defpackage.bckd b() {
        /*
        r14 = this;
        r0 = r14.f;
        r1 = r14.n;
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 0;
        r4 = 23;
        if (r2 < r4) goto L_0x0019;
    L_0x000b:
        r2 = r0.a();
        r4 = r0.a;
        r4 = defpackage.bcif.a(r4, r2);
        r13 = r4;
        r4 = r2;
        r2 = r13;
        goto L_0x0020;
    L_0x0019:
        r2 = r0.a;
        r2 = r2.getActiveNetworkInfo();
        r4 = r3;
    L_0x0020:
        r5 = 1;
        if (r2 != 0) goto L_0x0025;
    L_0x0023:
        r2 = r3;
        goto L_0x003f;
    L_0x0025:
        r6 = r2.isConnected();
        if (r6 != 0) goto L_0x003f;
    L_0x002b:
        r6 = android.os.Build.VERSION.SDK_INT;
        r7 = 21;
        if (r6 < r7) goto L_0x0023;
    L_0x0031:
        r6 = r2.getDetailedState();
        r7 = android.net.NetworkInfo.DetailedState.BLOCKED;
        if (r6 != r7) goto L_0x0023;
    L_0x0039:
        r6 = org.chromium.base.ApplicationStatus.getStateForApplication();
        if (r6 != r5) goto L_0x0023;
    L_0x003f:
        if (r2 != 0) goto L_0x004e;
    L_0x0041:
        r0 = new bckd;
        r7 = 0;
        r8 = -1;
        r9 = -1;
        r10 = 0;
        r11 = 0;
        r6 = r0;
        r6.<init>(r7, r8, r9, r10, r11);
        goto L_0x0134;
    L_0x004e:
        r6 = 0;
        if (r4 == 0) goto L_0x0081;
    L_0x0051:
        r1 = new bckd;
        r9 = r2.getType();
        r10 = r2.getSubtype();
        r2 = a(r4);
        r11 = java.lang.String.valueOf(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 28;
        if (r2 < r3) goto L_0x0078;
    L_0x0069:
        r0 = r0.a;
        r0 = r0.getLinkProperties(r4);
        r0 = org.chromium.net.AndroidNetworkLibrary.a(r0);
        if (r0 != 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0078;
    L_0x0076:
        r12 = 1;
        goto L_0x0079;
    L_0x0078:
        r12 = 0;
    L_0x0079:
        r8 = 1;
        r7 = r1;
        r7.<init>(r8, r9, r10, r11, r12);
        r0 = r1;
        goto L_0x0134;
    L_0x0081:
        r0 = r2.getType();
        if (r0 != r5) goto L_0x011e;
    L_0x0087:
        r0 = r2.getExtraInfo();
        if (r0 == 0) goto L_0x00af;
    L_0x008d:
        r0 = r2.getExtraInfo();
        r4 = "";
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x00af;
    L_0x0099:
        r0 = new bckd;
        r8 = 1;
        r9 = r2.getType();
        r10 = r2.getSubtype();
        r11 = r2.getExtraInfo();
        r12 = 0;
        r7 = r0;
        r7.<init>(r8, r9, r10, r11, r12);
        goto L_0x0134;
    L_0x00af:
        r0 = new bckd;
        r4 = r2.getType();
        r7 = r2.getSubtype();
        r8 = r1.b;
        monitor-enter(r8);
        r2 = r1.c;	 Catch:{ all -> 0x011b }
        if (r2 == 0) goto L_0x00c3;
    L_0x00c0:
        r2 = r1.d;	 Catch:{ all -> 0x011b }
        goto L_0x00ee;
    L_0x00c3:
        r2 = r1.a;	 Catch:{ all -> 0x011b }
        r2 = r2.getPackageManager();	 Catch:{ all -> 0x011b }
        r9 = "android.permission.ACCESS_WIFI_STATE";
        r10 = r1.a;	 Catch:{ all -> 0x011b }
        r10 = r10.getPackageName();	 Catch:{ all -> 0x011b }
        r2 = r2.checkPermission(r9, r10);	 Catch:{ all -> 0x011b }
        if (r2 != 0) goto L_0x00d8;
    L_0x00d7:
        r6 = 1;
    L_0x00d8:
        r1.d = r6;	 Catch:{ all -> 0x011b }
        if (r6 == 0) goto L_0x00e7;
    L_0x00dc:
        r2 = r1.a;	 Catch:{ all -> 0x011b }
        r6 = "wifi";
        r2 = r2.getSystemService(r6);	 Catch:{ all -> 0x011b }
        r2 = (android.net.wifi.WifiManager) r2;	 Catch:{ all -> 0x011b }
        goto L_0x00e8;
    L_0x00e7:
        r2 = r3;
    L_0x00e8:
        r1.e = r2;	 Catch:{ all -> 0x011b }
        r1.c = r5;	 Catch:{ all -> 0x011b }
        r2 = r1.d;	 Catch:{ all -> 0x011b }
    L_0x00ee:
        if (r2 != 0) goto L_0x00f7;
    L_0x00f0:
        monitor-exit(r8);	 Catch:{ all -> 0x011b }
        r1 = org.chromium.net.AndroidNetworkLibrary.getWifiSSID();
    L_0x00f5:
        r5 = r1;
        goto L_0x0112;
    L_0x00f7:
        r2 = r1.e;	 Catch:{ NullPointerException -> 0x00fe }
        r3 = r2.getConnectionInfo();	 Catch:{ NullPointerException -> 0x00fe }
        goto L_0x0106;
    L_0x00fe:
        r1 = r1.e;	 Catch:{ NullPointerException -> 0x0105 }
        r3 = r1.getConnectionInfo();	 Catch:{ NullPointerException -> 0x0105 }
        goto L_0x0106;
    L_0x0106:
        if (r3 == 0) goto L_0x010e;
    L_0x0108:
        r1 = r3.getSSID();	 Catch:{ all -> 0x011b }
        monitor-exit(r8);	 Catch:{ all -> 0x011b }
        goto L_0x00f5;
    L_0x010e:
        r1 = "";
        monitor-exit(r8);	 Catch:{ all -> 0x011b }
        goto L_0x00f5;
    L_0x0112:
        r2 = 1;
        r6 = 0;
        r1 = r0;
        r3 = r4;
        r4 = r7;
        r1.<init>(r2, r3, r4, r5, r6);
        goto L_0x0134;
    L_0x011b:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x011b }
        throw r0;
    L_0x011e:
        r0 = new bckd;
        r3 = 1;
        r4 = r2.getType();
        r5 = r2.getSubtype();
        r6 = 0;
        r7 = 0;
        r1 = r0;
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r1.<init>(r2, r3, r4, r5, r6);
    L_0x0134:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.NetworkChangeNotifierAutoDetect.b():bckd");
    }

    public static Network[] a(bcjw bcjw, Network network) {
        Object[] allNetworks = bcjw.a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network)) {
                NetworkCapabilities c = bcjw.c(network2);
                if (c != null && c.hasCapability(12)) {
                    if (!c.hasTransport(4)) {
                        int i2 = i + 1;
                        allNetworks[i] = network2;
                        i = i2;
                    } else if (bcjw.b(network2)) {
                        return new Network[]{network2};
                    }
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    public final void onReceive(Context context, Intent intent) {
        a(new bcju(this));
    }

    public final void c() {
        bckd b = b();
        if (!(b.a() == this.o.a() && b.a.equals(this.o.a) && b.b == this.o.b)) {
            this.c.a(b.a());
        }
        if (!(b.a() == this.o.a() && b.b() == this.o.b())) {
            this.c.b(b.b());
        }
        this.o = b;
    }

    public static long a(Network network) {
        if (VERSION.SDK_INT >= 23) {
            return bcif.a(network);
        }
        return (long) Integer.parseInt(network.toString());
    }

    static {
        NetworkChangeNotifierAutoDetect.class.getSimpleName();
    }
}
