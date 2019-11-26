package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: btw */
final class btw {
    public final ReferenceQueue a = new ReferenceQueue();
    public bvo b;
    public volatile boolean c;
    public volatile bua d;
    private final boolean e = false;
    private final Map f = new HashMap();

    btw() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new btv());
        newSingleThreadExecutor.execute(new btx(this));
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(bsm bsm, bvl bvl) {
        btz btz = (btz) this.f.put(bsm, new btz(bsm, bvl, this.a, false));
        if (btz != null) {
            btz.a();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(bsm bsm) {
        btz btz = (btz) this.f.remove(bsm);
        if (btz != null) {
            btz.a();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    /* JADX WARNING: Missing block: B:8:0x0017, code skipped:
            return r0;
     */
    public final synchronized defpackage.bvl b(defpackage.bsm r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.f;	 Catch:{ all -> 0x001b }
        r2 = r0.get(r2);	 Catch:{ all -> 0x001b }
        r2 = (defpackage.btz) r2;	 Catch:{ all -> 0x001b }
        if (r2 == 0) goto L_0x0018;
    L_0x000b:
        r0 = r2.get();	 Catch:{ all -> 0x001b }
        r0 = (defpackage.bvl) r0;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x0016;
    L_0x0013:
        r1.a(r2);	 Catch:{ all -> 0x001b }
    L_0x0016:
        monitor-exit(r1);
        return r0;
    L_0x0018:
        r2 = 0;
        monitor-exit(r1);
        return r2;
    L_0x001b:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btw.b(bsm):bvl");
    }

    /* Access modifiers changed, original: final */
    public final void a(btz btz) {
        synchronized (this.b) {
            synchronized (this) {
                this.f.remove(btz.a);
                if (btz.b) {
                    bvw bvw = btz.c;
                    if (bvw != null) {
                        this.b.a(btz.a, new bvl(bvw, true, false, btz.a, this.b));
                        return;
                    }
                }
            }
        }
    }
}
