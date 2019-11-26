package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import defpackage.mzk;

public class RemoteDataBus {
    private mzk a;

    public RemoteDataBus(mzk mzk) {
        this.a = mzk;
    }

    /* JADX WARNING: Missing block: B:13:0x0014, code skipped:
            return;
     */
    public final synchronized void a(defpackage.ngn r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.a;	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0013;
    L_0x0005:
        if (r3 == 0) goto L_0x0013;
    L_0x0007:
        r1 = new ngp;	 Catch:{ RemoteException -> 0x0011 }
        r1.<init>(r3);	 Catch:{ RemoteException -> 0x0011 }
        r0.a(r1);	 Catch:{ RemoteException -> 0x0011 }
        monitor-exit(r2);
        return;
    L_0x0011:
        monitor-exit(r2);
        return;
    L_0x0013:
        monitor-exit(r2);
        return;
    L_0x0015:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.RemoteDataBus.a(ngn):void");
    }

    public final synchronized void a() {
        this.a = null;
    }
}
