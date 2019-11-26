package defpackage;

import android.os.Handler;

/* renamed from: aevs */
final class aevs extends aevz {
    private final /* synthetic */ aevp a;

    aevs(aevp aevp) {
        this.a = aevp;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(afhr afhr) {
        aevp aevp = this.a;
        Handler handler = aevp.b;
        if (handler != null && aevp.c != null) {
            handler.post(new aevq(aevp));
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A:{SYNTHETIC} */
    /* JADX WARNING: Missing block: B:31:0x0086, code skipped:
            if (r7.equals(java.lang.Long.valueOf(r4.longValue())) != false) goto L_0x0088;
     */
    public final void b(defpackage.afhr r7) {
        /*
        r6 = this;
        r0 = "Sequence-Number";
        r0 = r7.b(r0);
        if (r0 == 0) goto L_0x0090;
    L_0x0008:
        r1 = r6.a;
        r2 = r1.f;
        if (r2 != 0) goto L_0x0046;
    L_0x000e:
        r2 = r1.e;
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0046;
    L_0x0013:
        r1 = r2.exchange(r0);	 Catch:{ InterruptedException -> 0x003f }
        r1 = (java.lang.Integer) r1;	 Catch:{ InterruptedException -> 0x003f }
        r1 = r1.intValue();	 Catch:{ InterruptedException -> 0x003f }
        r2 = r0.intValue();	 Catch:{ InterruptedException -> 0x003f }
        r1 = java.lang.Math.max(r2, r1);	 Catch:{ InterruptedException -> 0x003f }
        r2 = r6.a;	 Catch:{ InterruptedException -> 0x003f }
        r3 = java.lang.Integer.valueOf(r1);	 Catch:{ InterruptedException -> 0x003f }
        r2.f = r3;	 Catch:{ InterruptedException -> 0x003f }
        r0 = r0.intValue();	 Catch:{ InterruptedException -> 0x003f }
        if (r1 != r0) goto L_0x0034;
    L_0x0033:
        goto L_0x0048;
    L_0x0034:
        r7 = new nnc;	 Catch:{ InterruptedException -> 0x003f }
        r0 = new aevu;	 Catch:{ InterruptedException -> 0x003f }
        r0.<init>();	 Catch:{ InterruptedException -> 0x003f }
        r7.<init>(r0);	 Catch:{ InterruptedException -> 0x003f }
        throw r7;	 Catch:{ InterruptedException -> 0x003f }
    L_0x003f:
        r7 = move-exception;
        r0 = new nnc;
        r0.<init>(r7);
        throw r0;
    L_0x0046:
        r1.f = r0;
    L_0x0048:
        r0 = "Ingestion-Walltime-Us";
        r0 = r7.c(r0);
        r1 = r6.a;
        r2 = r1.h;
        if (r2 == 0) goto L_0x0055;
    L_0x0054:
        goto L_0x0059;
    L_0x0055:
        if (r0 == 0) goto L_0x0059;
    L_0x0057:
        r1.h = r0;
    L_0x0059:
        monitor-enter(r1);
        r0 = r6.a;	 Catch:{ all -> 0x008d }
        r2 = "T";
        r3 = "Stream-Finished";
        r7 = r7.a(r3);	 Catch:{ all -> 0x008d }
        r7 = r2.equals(r7);	 Catch:{ all -> 0x008d }
        r2 = 1;
        r3 = 0;
        if (r7 != 0) goto L_0x0088;
    L_0x006c:
        r7 = r6.a;	 Catch:{ all -> 0x008d }
        r4 = r7.a;	 Catch:{ all -> 0x008d }
        if (r4 == 0) goto L_0x0089;
    L_0x0072:
        r4 = r7.f;	 Catch:{ all -> 0x008d }
        if (r4 == 0) goto L_0x0089;
    L_0x0076:
        r7 = r7.j;	 Catch:{ all -> 0x008d }
        if (r7 == 0) goto L_0x0089;
    L_0x007a:
        r4 = r4.longValue();	 Catch:{ all -> 0x008d }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ all -> 0x008d }
        r7 = r7.equals(r4);	 Catch:{ all -> 0x008d }
        if (r7 == 0) goto L_0x0089;
    L_0x0088:
        r3 = 1;
    L_0x0089:
        r0.g = r3;	 Catch:{ all -> 0x008d }
        monitor-exit(r1);	 Catch:{ all -> 0x008d }
        return;
    L_0x008d:
        r7 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008d }
        throw r7;
    L_0x0090:
        r7 = new nnc;
        r0 = "Invalid manifestless sequence number";
        r7.<init>(r0);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aevs.b(afhr):void");
    }
}
