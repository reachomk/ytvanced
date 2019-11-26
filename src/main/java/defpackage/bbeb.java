package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: bbeb */
final class bbeb extends baxk {
    public bbcm a;
    private final Object b = new Object();
    private boolean c;
    private ScheduledFuture d;
    private final /* synthetic */ bbde e;

    bbeb(bbde bbde, barq barq) {
        this.e = bbde;
        amqw.a((Object) barq, (Object) "attrs");
    }

    /* Access modifiers changed, original: final */
    public final bazq c() {
        return this.a.a();
    }

    /* JADX WARNING: Missing block: B:11:0x0021, code skipped:
            return;
     */
    public final void a() {
        /*
        r6 = this;
        r0 = r6.e;
        r1 = "Subchannel.shutdown()";
        r0.a(r1);
        r0 = r6.b;
        monitor-enter(r0);
        r1 = r6.c;	 Catch:{ all -> 0x0052 }
        if (r1 == 0) goto L_0x0022;
    L_0x000e:
        r1 = r6.e;	 Catch:{ all -> 0x0052 }
        r1 = r1.x;	 Catch:{ all -> 0x0052 }
        if (r1 == 0) goto L_0x0020;
    L_0x0014:
        r1 = r6.d;	 Catch:{ all -> 0x0052 }
        if (r1 == 0) goto L_0x0020;
    L_0x0018:
        r2 = 0;
        r1.cancel(r2);	 Catch:{ all -> 0x0052 }
        r1 = 0;
        r6.d = r1;	 Catch:{ all -> 0x0052 }
        goto L_0x0025;
    L_0x0020:
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        return;
    L_0x0022:
        r1 = 1;
        r6.c = r1;	 Catch:{ all -> 0x0052 }
    L_0x0025:
        r1 = r6.e;	 Catch:{ all -> 0x0052 }
        r1 = r1.x;	 Catch:{ all -> 0x0052 }
        if (r1 != 0) goto L_0x0049;
    L_0x002b:
        r1 = r6.e;	 Catch:{ all -> 0x0052 }
        r1 = r1.e;	 Catch:{ all -> 0x0052 }
        r1 = r1.a();	 Catch:{ all -> 0x0052 }
        r2 = new bbcz;	 Catch:{ all -> 0x0052 }
        r3 = new bbee;	 Catch:{ all -> 0x0052 }
        r3.<init>(r6);	 Catch:{ all -> 0x0052 }
        r2.<init>(r3);	 Catch:{ all -> 0x0052 }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ all -> 0x0052 }
        r4 = 5;
        r1 = r1.schedule(r2, r4, r3);	 Catch:{ all -> 0x0052 }
        r6.d = r1;	 Catch:{ all -> 0x0052 }
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        return;
    L_0x0049:
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        r0 = r6.a;
        r1 = defpackage.bbde.b;
        r0.a(r1);
        return;
    L_0x0052:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0052 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbeb.a():void");
    }

    public final void b() {
        this.a.a();
    }

    public final String toString() {
        return this.a.b.toString();
    }
}
