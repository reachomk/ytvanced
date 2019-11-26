package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: aekj */
public final class aekj {
    public final ovx a;
    public final ovm b;
    public final ozb c;
    public final aeko d;
    public final aekp e = new aekp(new aekm(this));
    public int f;
    public StringBuilder g;
    public byte[] h;
    public int i;
    public int j;
    public int k;
    public byte[] l;
    public aeks m = new aeks();
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public int q = 1;
    private final ScheduledExecutorService r;
    private Future s;

    public aekj(ovx ovx, ovm ovm, ScheduledExecutorService scheduledExecutorService, ozb ozb, aeko aeko) {
        this.a = (ovx) amqw.a((Object) ovx);
        this.b = (ovm) amqw.a((Object) ovm);
        this.r = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.c = ozb;
        this.d = (aeko) amqw.a((Object) aeko);
    }

    /* JADX WARNING: Missing block: B:11:0x002e, code skipped:
            return;
     */
    public final synchronized void a(long r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.s;	 Catch:{ all -> 0x002f }
        if (r0 != 0) goto L_0x002d;
    L_0x0005:
        r0 = 0;
        r3.p = r0;	 Catch:{ all -> 0x002f }
        r0 = 0;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 > 0) goto L_0x001c;
    L_0x000e:
        r4 = r3.r;	 Catch:{ all -> 0x002f }
        r5 = new aekn;	 Catch:{ all -> 0x002f }
        r5.<init>(r3);	 Catch:{ all -> 0x002f }
        r4 = r4.submit(r5);	 Catch:{ all -> 0x002f }
        r3.s = r4;	 Catch:{ all -> 0x002f }
        goto L_0x002d;
    L_0x001c:
        r0 = r3.r;	 Catch:{ all -> 0x002f }
        r1 = new aekn;	 Catch:{ all -> 0x002f }
        r1.<init>(r3);	 Catch:{ all -> 0x002f }
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x002f }
        r4 = r0.schedule(r1, r4, r2);	 Catch:{ all -> 0x002f }
        r3.s = r4;	 Catch:{ all -> 0x002f }
        monitor-exit(r3);
        return;
    L_0x002d:
        monitor-exit(r3);
        return;
    L_0x002f:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekj.a(long):void");
    }

    public final synchronized void a() {
        this.p = true;
        Future future = this.s;
        if (future != null) {
            future.cancel(true);
            this.s = null;
        }
    }

    public final void a(int i) {
        int i2 = this.k + 1;
        if (i2 >= i) {
            this.n = true;
        } else {
            this.k = i2;
        }
    }
}
