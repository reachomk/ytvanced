package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: anpw */
public final class anpw implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d = new ArrayDeque();
    private anpu e;
    private boolean f = false;

    public anpw(Context context, String str) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0);
        this.a = context.getApplicationContext();
        this.b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a(Intent intent, PendingResult pendingResult) {
        this.d.add(new anps(intent, pendingResult, this.c));
        a();
    }

    /* JADX WARNING: Missing block: B:33:0x0087, code skipped:
            return;
     */
    private final synchronized void a() {
        /*
        r4 = this;
        monitor-enter(r4);
    L_0x0001:
        r0 = r4.d;	 Catch:{ all -> 0x008a }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x008a }
        if (r0 != 0) goto L_0x0088;
    L_0x0009:
        r0 = r4.e;	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x004a;
    L_0x000d:
        r0 = r0.isBinderAlive();	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x004a;
    L_0x0013:
        r0 = r4.d;	 Catch:{ all -> 0x008a }
        r0 = r0.poll();	 Catch:{ all -> 0x008a }
        r0 = (defpackage.anps) r0;	 Catch:{ all -> 0x008a }
        r1 = r4.e;	 Catch:{ all -> 0x008a }
        r2 = android.os.Binder.getCallingUid();	 Catch:{ all -> 0x008a }
        r3 = android.os.Process.myUid();	 Catch:{ all -> 0x008a }
        if (r2 != r3) goto L_0x0042;
    L_0x0027:
        r2 = r1.a;	 Catch:{ all -> 0x008a }
        r3 = r0.a;	 Catch:{ all -> 0x008a }
        r2 = r2.c(r3);	 Catch:{ all -> 0x008a }
        if (r2 == 0) goto L_0x0035;
    L_0x0031:
        r0.a();	 Catch:{ all -> 0x008a }
        goto L_0x0001;
    L_0x0035:
        r2 = r1.a;	 Catch:{ all -> 0x008a }
        r2 = r2.d;	 Catch:{ all -> 0x008a }
        r3 = new anpt;	 Catch:{ all -> 0x008a }
        r3.<init>(r1, r0);	 Catch:{ all -> 0x008a }
        r2.execute(r3);	 Catch:{ all -> 0x008a }
        goto L_0x0001;
    L_0x0042:
        r0 = new java.lang.SecurityException;	 Catch:{ all -> 0x008a }
        r1 = "Binding only allowed within app";
        r0.<init>(r1);	 Catch:{ all -> 0x008a }
        throw r0;	 Catch:{ all -> 0x008a }
    L_0x004a:
        r0 = r4.f;	 Catch:{ all -> 0x008a }
        if (r0 != 0) goto L_0x0086;
    L_0x004e:
        r0 = 1;
        r4.f = r0;	 Catch:{ all -> 0x008a }
        defpackage.qar.a();	 Catch:{ SecurityException -> 0x006a }
        r0 = r4.a;	 Catch:{ SecurityException -> 0x006a }
        r1 = r4.b;	 Catch:{ SecurityException -> 0x006a }
        r2 = 65;
        r0 = defpackage.qar.b(r0, r1, r4, r2);	 Catch:{ SecurityException -> 0x006a }
        if (r0 != 0) goto L_0x0068;
    L_0x0060:
        r0 = "EnhancedIntentService";
        r1 = "binding to the service failed";
        android.util.Log.e(r0, r1);	 Catch:{ SecurityException -> 0x006a }
        goto L_0x0072;
    L_0x0068:
        monitor-exit(r4);
        return;
    L_0x006a:
        r0 = move-exception;
        r1 = "EnhancedIntentService";
        r2 = "Exception while binding the service";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x008a }
    L_0x0072:
        r0 = r4.d;	 Catch:{ all -> 0x008a }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x008a }
        if (r0 != 0) goto L_0x0086;
    L_0x007a:
        r0 = r4.d;	 Catch:{ all -> 0x008a }
        r0 = r0.poll();	 Catch:{ all -> 0x008a }
        r0 = (defpackage.anps) r0;	 Catch:{ all -> 0x008a }
        r0.a();	 Catch:{ all -> 0x008a }
        goto L_0x0072;
    L_0x0086:
        monitor-exit(r4);
        return;
    L_0x0088:
        monitor-exit(r4);
        return;
    L_0x008a:
        r0 = move-exception;
        monitor-exit(r4);
        goto L_0x008e;
    L_0x008d:
        throw r0;
    L_0x008e:
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anpw.a():void");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f = false;
            this.e = (anpu) iBinder;
            a();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a();
    }
}
