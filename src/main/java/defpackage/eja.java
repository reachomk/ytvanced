package defpackage;

import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

/* renamed from: eja */
public final class eja {
    private apxu a;

    public eja(apxu apxu) {
        this.a = (apxu) amqw.a((Object) apxu);
    }

    public final synchronized apxu a() {
        return this.a;
    }

    public final synchronized String b() {
        return aiqx.b(this.a);
    }

    public final synchronized String c() {
        return aiqx.c(this.a);
    }

    public final synchronized boolean d() {
        apxu apxu;
        anxr access$000;
        apxu = this.a;
        access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
        apxu.a(access$000);
        return apxu.h.a(access$000.d);
    }

    /* JADX WARNING: Missing block: B:10:0x0013, code skipped:
            return;
     */
    public final synchronized void a(defpackage.apxu r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        defpackage.amqw.a(r2);	 Catch:{ all -> 0x0014 }
        r0 = r1.a;	 Catch:{ all -> 0x0014 }
        if (r0 == r2) goto L_0x0012;
    L_0x0008:
        r0 = r1.b(r2);	 Catch:{ all -> 0x0014 }
        if (r0 == 0) goto L_0x0012;
    L_0x000e:
        r1.a = r2;	 Catch:{ all -> 0x0014 }
        monitor-exit(r1);
        return;
    L_0x0012:
        monitor-exit(r1);
        return;
    L_0x0014:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eja.a(apxu):void");
    }

    public final synchronized boolean b(apxu apxu) {
        return aiqx.a(this.a, apxu);
    }
}
