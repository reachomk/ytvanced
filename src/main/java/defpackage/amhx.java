package defpackage;

/* renamed from: amhx */
final class amhx implements amfk {
    private final amfh a;
    private volatile amfj b = null;

    amhx(amfh amfh) {
        this.a = amfh;
    }

    public final synchronized void a(amfj amfj) {
        if (this.b == null) {
            this.b = amfj;
        } else {
            throw new IllegalStateException("Only one MediaTranscoder can be set per monitor");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001e */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|8|9|10) */
    public final synchronized void a(boolean r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.b;	 Catch:{ all -> 0x0025 }
        if (r0 == 0) goto L_0x0023;
    L_0x0005:
        r0 = r3.b;	 Catch:{ all -> 0x0025 }
        r0 = r0.a;	 Catch:{ all -> 0x0025 }
        r0.a();	 Catch:{ all -> 0x0025 }
        if (r4 == 0) goto L_0x0023;
    L_0x000e:
        r4 = r3.b;	 Catch:{ all -> 0x0025 }
        r0 = r4.b;	 Catch:{ all -> 0x0025 }
        r0.shutdownNow();	 Catch:{ all -> 0x0025 }
        r4 = r4.b;	 Catch:{ InterruptedException -> 0x001e }
        r0 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x001e }
        r1 = 4;
        r4.awaitTermination(r1, r0);	 Catch:{ InterruptedException -> 0x001e }
    L_0x001e:
        r4 = r3.a;	 Catch:{ all -> 0x0025 }
        r4.a();	 Catch:{ all -> 0x0025 }
    L_0x0023:
        monitor-exit(r3);
        return;
    L_0x0025:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amhx.a(boolean):void");
    }
}
