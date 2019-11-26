package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* renamed from: pgk */
public final class pgk implements ServiceConnection {
    public volatile pfi a;
    public volatile boolean b;
    public final /* synthetic */ pgi c;

    protected pgk(pgi pgi) {
        this.c = pgi;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0047 */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:9|10|11|(4:13|(1:15)(1:17)|16|18)(1:19)|(2:24|25)(3:26|27|(1:29)(1:30))|31|32|33|34) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            r2.c.c("Service connect failed to get IAnalyticsService");
     */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
        r2 = this;
        r3 = "AnalyticsServiceConnection.onServiceConnected";
        defpackage.pzr.b(r3);
        monitor-enter(r2);
        if (r4 != 0) goto L_0x0014;
    L_0x0008:
        r3 = r2.c;	 Catch:{ all -> 0x0045 }
        r4 = "Service connected with null binder";
        r3.c(r4);	 Catch:{ all -> 0x0045 }
        r2.notifyAll();	 Catch:{ all -> 0x0086 }
        monitor-exit(r2);	 Catch:{ all -> 0x0086 }
        return;
    L_0x0014:
        r3 = 0;
        r0 = r4.getInterfaceDescriptor();	 Catch:{ RemoteException -> 0x0047 }
        r1 = "com.google.android.gms.analytics.internal.IAnalyticsService";
        r1 = r1.equals(r0);	 Catch:{ RemoteException -> 0x0047 }
        if (r1 == 0) goto L_0x003d;
    L_0x0021:
        r0 = "com.google.android.gms.analytics.internal.IAnalyticsService";
        r0 = r4.queryLocalInterface(r0);	 Catch:{ RemoteException -> 0x0047 }
        r1 = r0 instanceof defpackage.pfi;	 Catch:{ RemoteException -> 0x0047 }
        if (r1 == 0) goto L_0x002f;
    L_0x002b:
        r0 = (defpackage.pfi) r0;	 Catch:{ RemoteException -> 0x0047 }
    L_0x002d:
        r3 = r0;
        goto L_0x0035;
    L_0x002f:
        r0 = new pfk;	 Catch:{ RemoteException -> 0x0047 }
        r0.<init>(r4);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x002d;
    L_0x0035:
        r4 = r2.c;	 Catch:{ RemoteException -> 0x0047 }
        r0 = "Bound to IAnalyticsService interface";
        r4.a(r0);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x004e;
    L_0x003d:
        r4 = r2.c;	 Catch:{ RemoteException -> 0x0047 }
        r1 = "Got binder with a wrong descriptor";
        r4.d(r1, r0);	 Catch:{ RemoteException -> 0x0047 }
        goto L_0x004e;
    L_0x0045:
        r3 = move-exception;
        goto L_0x0082;
    L_0x0047:
        r4 = r2.c;	 Catch:{ all -> 0x0045 }
        r0 = "Service connect failed to get IAnalyticsService";
        r4.c(r0);	 Catch:{ all -> 0x0045 }
    L_0x004e:
        if (r3 != 0) goto L_0x0061;
    L_0x0050:
        defpackage.qar.a();	 Catch:{ IllegalArgumentException -> 0x007d }
        r3 = r2.c;	 Catch:{ IllegalArgumentException -> 0x007d }
        r3 = r3.i();	 Catch:{ IllegalArgumentException -> 0x007d }
        r4 = r2.c;	 Catch:{ IllegalArgumentException -> 0x007d }
        r4 = r4.a;	 Catch:{ IllegalArgumentException -> 0x007d }
        r3.unbindService(r4);	 Catch:{ IllegalArgumentException -> 0x007d }
        goto L_0x007d;
    L_0x0061:
        r4 = r2.b;	 Catch:{ all -> 0x0045 }
        if (r4 != 0) goto L_0x007b;
    L_0x0065:
        r4 = r2.c;	 Catch:{ all -> 0x0045 }
        r0 = "onServiceConnected received after the timeout limit";
        r4.b(r0);	 Catch:{ all -> 0x0045 }
        r4 = r2.c;	 Catch:{ all -> 0x0045 }
        r4 = r4.l();	 Catch:{ all -> 0x0045 }
        r0 = new pgj;	 Catch:{ all -> 0x0045 }
        r0.<init>(r2, r3);	 Catch:{ all -> 0x0045 }
        r4.a(r0);	 Catch:{ all -> 0x0045 }
        goto L_0x007d;
    L_0x007b:
        r2.a = r3;	 Catch:{ all -> 0x0045 }
    L_0x007d:
        r2.notifyAll();	 Catch:{ all -> 0x0086 }
        monitor-exit(r2);	 Catch:{ all -> 0x0086 }
        return;
    L_0x0082:
        r2.notifyAll();	 Catch:{ all -> 0x0086 }
        throw r3;	 Catch:{ all -> 0x0086 }
    L_0x0086:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0086 }
        goto L_0x008a;
    L_0x0089:
        throw r3;
    L_0x008a:
        goto L_0x0089;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pgk.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        pzr.b("AnalyticsServiceConnection.onServiceDisconnected");
        this.c.l().a(new pgm(this, componentName));
    }
}
