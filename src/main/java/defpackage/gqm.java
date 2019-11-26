package defpackage;

import android.util.LruCache;

/* renamed from: gqm */
public final class gqm implements gpz {
    private final gqw a;
    private final aajx b;
    private final xsc c;
    private final LruCache d = new LruCache(64);

    public gqm(gqw gqw, gqa gqa, aajx aajx, xsc xsc) {
        this.a = gqw;
        this.b = aajx;
        this.c = xsc;
        ((gqa) amqw.a((Object) gqa)).a(this);
    }

    public final void a() {
        gqm.a(this.d);
    }

    public static void a(LruCache lruCache) {
        synchronized (lruCache) {
            for (gqn gqn : lruCache.snapshot().values()) {
                gql gql = gqn.a;
                if (gql != null) {
                    gql.a = true;
                }
            }
            lruCache.evictAll();
        }
    }

    /* JADX WARNING: Missing block: B:26:0x00c1, code skipped:
            if (r0 == null) goto L_0x00c7;
     */
    /* JADX WARNING: Missing block: B:27:0x00c3, code skipped:
            r2.a(r0);
     */
    /* JADX WARNING: Missing block: B:28:0x00c6, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:29:0x00c7, code skipped:
            r0 = r1.a;
            r0.e.b(r0.b.a(r14, defpackage.ajzq.class, (defpackage.afsw) defpackage.amqw.a(r15), defpackage.gqz.a));
     */
    /* JADX WARNING: Missing block: B:30:0x00de, code skipped:
            return;
     */
    public final void a(defpackage.apxu r17, java.lang.String r18, defpackage.afsw r19) {
        /*
        r16 = this;
        r1 = r16;
        r0 = r17;
        r2 = r19;
        r3 = com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
        r3 = defpackage.anxl.checkIsLite(r3);
        r0.a(r3);
        r4 = r0.h;
        r5 = r3.d;
        r4 = r4.b(r5);
        if (r4 != 0) goto L_0x001c;
    L_0x0019:
        r3 = r3.b;
        goto L_0x0020;
    L_0x001c:
        r3 = r3.a(r4);
    L_0x0020:
        r3 = (com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint) r3;
        r4 = defpackage.ateh.n;
        r4 = r4.createBuilder();
        r4 = (defpackage.atek) r4;
        r5 = r3.b;
        r4.a(r5);
        r5 = r3.c;
        r4.b(r5);
        r5 = r3.d;
        r4.a(r5);
        r5 = r3.e;
        r4.c(r5);
        r5 = r1.a;
        r14 = new gqx;
        r6 = r5.c;
        r5 = r5.d;
        r5 = r5.c();
        r14.<init>(r6, r5);
        r0 = r0.b;
        r14.a(r0);
        r14.a = r4;
        r0 = r3.a;
        r0 = r0 & 1024;
        if (r0 == 0) goto L_0x005e;
    L_0x005a:
        r0 = r3.l;
        r14.b = r0;
    L_0x005e:
        r3 = r1.d;
        monitor-enter(r3);
        r0 = r14.a();	 Catch:{ all -> 0x00df }
        r4 = r1.d;	 Catch:{ all -> 0x00df }
        r4 = r4.get(r0);	 Catch:{ all -> 0x00df }
        r4 = (defpackage.gqn) r4;	 Catch:{ all -> 0x00df }
        r5 = 0;
        if (r4 == 0) goto L_0x008a;
    L_0x0070:
        r6 = r1.c;	 Catch:{ all -> 0x00df }
        r6 = r6.b();	 Catch:{ all -> 0x00df }
        r8 = r4.c;	 Catch:{ all -> 0x00df }
        r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r10 > 0) goto L_0x008a;
    L_0x007c:
        r6 = r4.b;	 Catch:{ all -> 0x00df }
        if (r6 == 0) goto L_0x008a;
    L_0x0080:
        r0 = new gqo;	 Catch:{ all -> 0x00df }
        r4 = r4.d;	 Catch:{ all -> 0x00df }
        r7 = 1;
        r0.<init>(r6, r4, r7);	 Catch:{ all -> 0x00df }
        r15 = r5;
        goto L_0x00c0;
    L_0x008a:
        if (r4 != 0) goto L_0x008d;
    L_0x008c:
        goto L_0x009b;
    L_0x008d:
        r6 = r4.a;	 Catch:{ all -> 0x00df }
        if (r6 == 0) goto L_0x009b;
    L_0x0091:
        r6.a(r2);	 Catch:{ all -> 0x00df }
        r2 = r1.d;	 Catch:{ all -> 0x00df }
        r2.put(r0, r4);	 Catch:{ all -> 0x00df }
        monitor-exit(r3);	 Catch:{ all -> 0x00df }
        return;
    L_0x009b:
        r4 = new gqn;	 Catch:{ all -> 0x00df }
        r4.<init>();	 Catch:{ all -> 0x00df }
        r6 = r1.c;	 Catch:{ all -> 0x00df }
        r9 = r6.b();	 Catch:{ all -> 0x00df }
        r15 = new gql;	 Catch:{ all -> 0x00df }
        r11 = r1.d;	 Catch:{ all -> 0x00df }
        r12 = r1.c;	 Catch:{ all -> 0x00df }
        r13 = r1.b;	 Catch:{ all -> 0x00df }
        r6 = r15;
        r7 = r14;
        r8 = r18;
        r6.<init>(r7, r8, r9, r11, r12, r13);	 Catch:{ all -> 0x00df }
        r15.a(r2);	 Catch:{ all -> 0x00df }
        r4.a = r15;	 Catch:{ all -> 0x00df }
        r6 = r1.d;	 Catch:{ all -> 0x00df }
        r6.put(r0, r4);	 Catch:{ all -> 0x00df }
        r0 = r5;
    L_0x00c0:
        monitor-exit(r3);	 Catch:{ all -> 0x00df }
        if (r0 == 0) goto L_0x00c7;
    L_0x00c3:
        r2.a(r0);
        return;
    L_0x00c7:
        r0 = r1.a;
        r2 = defpackage.amqw.a(r15);
        r2 = (defpackage.afsw) r2;
        r3 = r0.e;
        r0 = r0.b;
        r4 = defpackage.ajzq.class;
        r5 = defpackage.gqz.a;
        r0 = r0.a(r14, r4, r2, r5);
        r3.b(r0);
        return;
    L_0x00df:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00df }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqm.a(apxu, java.lang.String, afsw):void");
    }

    public final void a(asla asla, aslc aslc) {
        a();
    }
}
