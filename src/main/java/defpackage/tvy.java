package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tvy */
final class tvy extends ttj {
    public final boolean d = false;
    public final tvp e;
    public final boolean f;
    public final boolean g;
    private tvs h;

    tvy(udc udc, Application application, tzu tzu, tzu tzu2, int i, tvp tvp, boolean z) {
        super(udc, application, tzu, tzu2, 1, i);
        AtomicReference atomicReference = new AtomicReference(null);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = tvp;
        this.f = false;
        this.g = z;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:14:0x0041, code skipped:
            return;
     */
    public final synchronized void e() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0042 }
        if (r0 == 0) goto L_0x0006;
    L_0x0005:
        goto L_0x0040;
    L_0x0006:
        r0 = r4.h;	 Catch:{ all -> 0x0042 }
        if (r0 != 0) goto L_0x0040;
    L_0x000a:
        r0 = new twa;	 Catch:{ all -> 0x0042 }
        r0.<init>(r4);	 Catch:{ all -> 0x0042 }
        r1 = new tvs;	 Catch:{ all -> 0x0042 }
        r2 = r4.a;	 Catch:{ all -> 0x0042 }
        r3 = r4.b;	 Catch:{ all -> 0x0042 }
        r1.<init>(r0, r2, r3);	 Catch:{ all -> 0x0042 }
        r4.h = r1;	 Catch:{ all -> 0x0042 }
        r0 = r4.h;	 Catch:{ all -> 0x0042 }
        r1 = r0.a;	 Catch:{ all -> 0x0042 }
        r2 = 1;
        r1 = r1.getAndSet(r2);	 Catch:{ all -> 0x0042 }
        if (r1 == 0) goto L_0x0030;
    L_0x0025:
        r0 = "MemoryMetricMonitor";
        r1 = "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored.";
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0042 }
        defpackage.tyv.d(r0, r1, r2);	 Catch:{ all -> 0x0042 }
        goto L_0x0040;
    L_0x0030:
        r1 = r0.f;	 Catch:{ all -> 0x0042 }
        r2 = r0.g;	 Catch:{ all -> 0x0042 }
        r1.a(r2);	 Catch:{ all -> 0x0042 }
        r1 = r0.f;	 Catch:{ all -> 0x0042 }
        r0 = r0.h;	 Catch:{ all -> 0x0042 }
        r1.a(r0);	 Catch:{ all -> 0x0042 }
        monitor-exit(r4);
        return;
    L_0x0040:
        monitor-exit(r4);
        return;
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvy.e():void");
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        tvs tvs = this.h;
        if (tvs != null) {
            tvs.f.b(tvs.g);
            tvs.f.b(tvs.h);
            this.h = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, int i, String str2) {
        if (b()) {
            c().submit(new tvz(this, str, i, str2));
        }
    }
}
