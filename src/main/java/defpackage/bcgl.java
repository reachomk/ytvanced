package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcgl */
public final class bcgl {
    public final AtomicReference a = new AtomicReference();
    public final CountDownLatch b = new CountDownLatch(1);
    private final WeakReference c;
    private auf d;

    public bcgl(Context context) {
        this.c = new WeakReference(context);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (r0.bindService(r2, r1, 33) == false) goto L_0x0030;
     */
    /* JADX WARNING: Missing block: B:13:0x003e, code skipped:
            return;
     */
    public final synchronized void a(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.d;	 Catch:{ all -> 0x0041 }
        if (r0 != 0) goto L_0x003f;
    L_0x0005:
        r0 = new bcgo;	 Catch:{ all -> 0x0041 }
        r0.<init>(r4);	 Catch:{ all -> 0x0041 }
        r4.d = r0;	 Catch:{ all -> 0x0041 }
        r0 = r4.c;	 Catch:{ all -> 0x0041 }
        r0 = r0.get();	 Catch:{ all -> 0x0041 }
        r0 = (android.content.Context) r0;	 Catch:{ all -> 0x0041 }
        if (r0 == 0) goto L_0x0030;
    L_0x0016:
        r1 = r4.d;	 Catch:{ all -> 0x0041 }
        r2 = new android.content.Intent;	 Catch:{ all -> 0x0041 }
        r3 = "android.support.customtabs.action.CustomTabsService";
        r2.<init>(r3);	 Catch:{ all -> 0x0041 }
        r3 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x0041 }
        if (r3 != 0) goto L_0x0028;
    L_0x0025:
        r2.setPackage(r5);	 Catch:{ all -> 0x0041 }
    L_0x0028:
        r5 = 33;
        r5 = r0.bindService(r2, r1, r5);	 Catch:{ all -> 0x0041 }
        if (r5 != 0) goto L_0x003d;
    L_0x0030:
        r5 = "Unable to bind custom tabs service";
        r0 = 0;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0041 }
        defpackage.bcgn.b(r5, r0);	 Catch:{ all -> 0x0041 }
        r5 = r4.b;	 Catch:{ all -> 0x0041 }
        r5.countDown();	 Catch:{ all -> 0x0041 }
    L_0x003d:
        monitor-exit(r4);
        return;
    L_0x003f:
        monitor-exit(r4);
        return;
    L_0x0041:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcgl.a(java.lang.String):void");
    }

    public final synchronized void a() {
        if (this.d != null) {
            Context context = (Context) this.c.get();
            if (context != null) {
                context.unbindService(this.d);
            }
            this.a.set(null);
            bcgn.a("CustomTabsService is disconnected", new Object[0]);
        }
    }
}
