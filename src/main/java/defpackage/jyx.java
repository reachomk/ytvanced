package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: jyx */
final class jyx {
    public long a;
    private final xsc b;
    private final ScheduledExecutorService c;
    private long d;
    private ScheduledFuture e;
    private final /* synthetic */ jyi f;

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ajry ajry = this.f.l;
        if (ajry != null) {
            ajry.setExtension(ajrx.b, Boolean.valueOf(true));
        }
    }

    public final synchronized void a(long j, long j2) {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if (j > 0) {
            this.a = j2;
            this.d = this.b.b() + j;
            ScheduledExecutorService scheduledExecutorService = this.c;
            jyi jyi = this.f;
            if (jyi.o == null) {
                jyi.o = new jyq(jyi);
            }
            this.e = scheduledExecutorService.schedule(jyi.o, j, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x001a, code skipped:
            return;
     */
    public final synchronized void b() {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.d;	 Catch:{ all -> 0x001d }
        r2 = r7.b;	 Catch:{ all -> 0x001d }
        r2 = r2.b();	 Catch:{ all -> 0x001d }
        r0 = r0 - r2;
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x001b;
    L_0x0010:
        r4 = r7.a;	 Catch:{ all -> 0x001d }
        r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r6 <= 0) goto L_0x0019;
    L_0x0016:
        r7.a(r4, r2);	 Catch:{ all -> 0x001d }
    L_0x0019:
        monitor-exit(r7);
        return;
    L_0x001b:
        monitor-exit(r7);
        return;
    L_0x001d:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jyx.b():void");
    }

    /* synthetic */ jyx(jyi jyi, xsc xsc, ScheduledExecutorService scheduledExecutorService) {
        this.f = jyi;
        this.b = xsc;
        this.c = scheduledExecutorService;
    }
}
