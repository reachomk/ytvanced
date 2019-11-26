package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* renamed from: bclj */
public final class bclj implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ CronetBidirectionalStream b;

    public bclj(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.b = cronetBidirectionalStream;
        this.a = z;
    }

    /* JADX WARNING: Missing block: B:15:?, code skipped:
            r0 = r3.b;
            r0.a.a(r0);
     */
    /* JADX WARNING: Missing block: B:16:0x0039, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:17:0x003a, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:0x003b, code skipped:
            r3.b.a(r0);
     */
    /* JADX WARNING: Missing block: B:19:0x0040, code skipped:
            return;
     */
    public final void run() {
        /*
        r3 = this;
        r0 = r3.b;
        r0 = r0.c;
        monitor-enter(r0);
        r1 = r3.b;	 Catch:{ all -> 0x0041 }
        r1 = r1.d();	 Catch:{ all -> 0x0041 }
        if (r1 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        return;
    L_0x000f:
        r1 = r3.b;	 Catch:{ all -> 0x0041 }
        r2 = r3.a;	 Catch:{ all -> 0x0041 }
        r1.d = r2;	 Catch:{ all -> 0x0041 }
        r2 = 2;
        r1.e = r2;	 Catch:{ all -> 0x0041 }
        r1 = r1.b;	 Catch:{ all -> 0x0041 }
        r1 = org.chromium.net.impl.CronetBidirectionalStream.a(r1);	 Catch:{ all -> 0x0041 }
        if (r1 != 0) goto L_0x002b;
    L_0x0020:
        r1 = r3.b;	 Catch:{ all -> 0x0041 }
        r2 = r1.d;	 Catch:{ all -> 0x0041 }
        if (r2 == 0) goto L_0x002b;
    L_0x0026:
        r2 = 10;
        r1.f = r2;	 Catch:{ all -> 0x0041 }
        goto L_0x0031;
    L_0x002b:
        r1 = r3.b;	 Catch:{ all -> 0x0041 }
        r2 = 8;
        r1.f = r2;	 Catch:{ all -> 0x0041 }
    L_0x0031:
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        r0 = r3.b;	 Catch:{ Exception -> 0x003a }
        r1 = r0.a;	 Catch:{ Exception -> 0x003a }
        r1.a(r0);	 Catch:{ Exception -> 0x003a }
        return;
    L_0x003a:
        r0 = move-exception;
        r1 = r3.b;
        r1.a(r0);
        return;
    L_0x0041:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0041 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bclj.run():void");
    }
}
