package defpackage;

import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import java.io.File;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: tul */
final class tul extends ttj implements tzh {
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final int e;
    public final int f;
    public final int g;
    public final double h;
    public final int i;
    public final IntentFilter j = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    public final sdp k;
    public ScheduledFuture l;
    private final tum m;
    private WifiManager n;

    tul(udc udc, Application application, tzu tzu, tzu tzu2, int i, int i2, int i3, int i4, double d, sdp sdp) {
        super(udc, application, tzu, tzu2, 2);
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.i = i4;
        this.h = d;
        this.k = sdp;
        this.m = new tum(sdp, d, i3, ucv.a(), this.a);
    }

    public final void f() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:16:0x005a, code skipped:
            return;
     */
    public final synchronized void g() {
        /*
        r9 = this;
        monitor-enter(r9);
        r0 = r9.d;	 Catch:{ all -> 0x005d }
        r0 = r0.get();	 Catch:{ all -> 0x005d }
        if (r0 != 0) goto L_0x005b;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        r1 = 5;
        if (r0 >= r1) goto L_0x0059;
    L_0x000d:
        r1 = r9.m;	 Catch:{ all -> 0x005d }
        r2 = r1.a;	 Catch:{ all -> 0x005d }
        r2 = r2.a();	 Catch:{ all -> 0x005d }
        r4 = 31557600000; // 0x758fac300 float:2.2057234E15 double:1.5591526025E-313;
        r4 = r2 % r4;
        r2 = r2 - r4;
        r1 = r1.a(r2);	 Catch:{ all -> 0x005d }
        if (r1 == 0) goto L_0x0057;
    L_0x0023:
        r2 = r1.longValue();	 Catch:{ all -> 0x005d }
        r4 = r9.k;	 Catch:{ all -> 0x005d }
        r4 = r4.a();	 Catch:{ all -> 0x005d }
        r2 = r2 - r4;
        r4 = 0;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 <= 0) goto L_0x0054;
    L_0x0034:
        r0 = r1.longValue();	 Catch:{ all -> 0x005d }
        r4 = r9.g;	 Catch:{ all -> 0x005d }
        r5 = r9.d;	 Catch:{ all -> 0x005d }
        r6 = 1;
        r5.set(r6);	 Catch:{ all -> 0x005d }
        r5 = r9.c();	 Catch:{ all -> 0x005d }
        r6 = new tun;	 Catch:{ all -> 0x005d }
        r7 = (long) r4;	 Catch:{ all -> 0x005d }
        r0 = r0 + r7;
        r6.<init>(r9, r0);	 Catch:{ all -> 0x005d }
        r0 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x005d }
        r0 = r5.schedule(r6, r2, r0);	 Catch:{ all -> 0x005d }
        r9.l = r0;	 Catch:{ all -> 0x005d }
        goto L_0x0059;
    L_0x0054:
        r0 = r0 + 1;
        goto L_0x000a;
    L_0x0057:
        monitor-exit(r9);
        return;
    L_0x0059:
        monitor-exit(r9);
        return;
    L_0x005b:
        monitor-exit(r9);
        return;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r9);
        goto L_0x0061;
    L_0x0060:
        throw r0;
    L_0x0061:
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tul.g():void");
    }

    public final bcaz a(Intent intent) {
        bcaz bcaz;
        bcbc bcbc = (bcbc) bcaz.f.createBuilder();
        if (this.n == null) {
            this.n = (WifiManager) this.a.getSystemService("wifi");
        }
        boolean isWifiEnabled = this.n.isWifiEnabled();
        bcbc.copyOnWrite();
        bcaz bcaz2 = (bcaz) bcbc.instance;
        bcaz2.a |= 4;
        bcaz2.d = isWifiEnabled;
        boolean z = true;
        if (ra.a(this.a, "android.permission.BLUETOOTH") == 0) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            isWifiEnabled = defaultAdapter != null && defaultAdapter.isEnabled();
            bcbc.copyOnWrite();
            bcaz = (bcaz) bcbc.instance;
            bcaz.a |= 8;
            bcaz.e = isWifiEnabled;
        }
        isWifiEnabled = ucv.c(this.a);
        bcbc.copyOnWrite();
        bcaz = (bcaz) bcbc.instance;
        bcaz.a |= 1;
        bcaz.b = isWifiEnabled;
        int intExtra = intent.getIntExtra("status", -1);
        if (!(intExtra == 2 || intExtra == 5)) {
            z = false;
        }
        bcbc.copyOnWrite();
        bcaz bcaz3 = (bcaz) bcbc.instance;
        bcaz3.a = 2 | bcaz3.a;
        bcaz3.c = z;
        return (bcaz) ((anxl) bcbc.build());
    }

    public static float b(Intent intent) {
        return ((float) intent.getIntExtra("level", -1)) / ((float) intent.getIntExtra("scale", -1));
    }

    private final synchronized void j() {
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.l = null;
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        j();
    }

    public final void e() {
        i();
        g();
    }

    public final synchronized File h() {
        String a = ucv.a();
        String concat = String.valueOf(a).concat(".trace");
        File filesDir = this.a.getFilesDir();
        String str = "primes_profiling_";
        a = String.valueOf(a);
        if (a.length() == 0) {
            a = new String(str);
        } else {
            a = str.concat(a);
        }
        File file = new File(filesDir, a);
        if (!file.exists() && !file.mkdir()) {
            return null;
        }
        return new File(file, concat);
    }

    public final void i() {
        File h = h();
        try {
            if (h.exists()) {
                h.delete();
            }
        } catch (Exception unused) {
        }
    }
}
