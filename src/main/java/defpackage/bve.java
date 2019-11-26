package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bve */
public final class bve implements buk, cid {
    private static final bvf d = new bvf();
    public final bvh a = new bvh();
    public boolean b;
    public bvl c;
    private final cif e = cif.a();
    private final bvo f;
    private final zy g;
    private final bvk h;
    private final bxr i;
    private final bxr j;
    private final bxr k;
    private final bxr l;
    private final AtomicInteger m = new AtomicInteger();
    private bsm n;
    private boolean o;
    private boolean p;
    private boolean q;
    private bvw r;
    private boolean s;
    private bvn t;
    private boolean u;
    private buh v;
    private volatile boolean w;
    private int x;

    bve(bxr bxr, bxr bxr2, bxr bxr3, bxr bxr4, bvk bvk, bvo bvo, zy zyVar) {
        this.i = bxr;
        this.j = bxr2;
        this.k = bxr3;
        this.l = bxr4;
        this.h = bvk;
        this.f = bvo;
        this.g = zyVar;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized bve a(bsm bsm, boolean z, boolean z2, boolean z3, boolean z4) {
        this.n = bsm;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.b = z4;
        return this;
    }

    public final synchronized void b(buh buh) {
        bxr bxr;
        this.v = buh;
        int a = buh.a(1);
        if (a == 2 || a == 3) {
            bxr = this.i;
        } else {
            bxr = c();
        }
        bxr.execute(buh);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(cgf cgf, Executor executor) {
        this.e.b();
        this.a.a.add(new bvi(cgf, executor));
        if (this.s) {
            a(1);
            executor.execute(new bvg(this, cgf));
        } else if (this.u) {
            a(1);
            executor.execute(new bvd(this, cgf));
        } else {
            chw.a(this.w ^ 1, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(cgf cgf) {
        try {
            cgf.a(this.c, this.x);
        } catch (Throwable th) {
            buc buc = new buc(th);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(cgf cgf) {
        try {
            cgf.a(this.t);
        } catch (Throwable th) {
            buc buc = new buc(th);
        }
    }

    public final synchronized void c(cgf cgf) {
        this.e.b();
        this.a.a.remove(bvh.b(cgf));
        if (this.a.a()) {
            if (!d()) {
                this.w = true;
                buh buh = this.v;
                buh.q = true;
                bug bug = buh.p;
                if (bug != null) {
                    bug.b();
                }
                this.h.a(this, this.n);
            }
            if ((this.s || this.u) && this.m.get() == 0) {
                e();
            }
        }
    }

    private final bxr c() {
        if (this.p) {
            return this.k;
        }
        return !this.q ? this.j : this.l;
    }

    private final boolean d() {
        return this.u || this.s || this.w;
    }

    private final synchronized void a(int i) {
        chw.a(d(), "Not yet complete!");
        if (this.m.getAndAdd(i) == 0) {
            bvl bvl = this.c;
            if (bvl != null) {
                bvl.e();
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        this.e.b();
        chw.a(d(), "Not yet complete!");
        int decrementAndGet = this.m.decrementAndGet();
        chw.a(decrementAndGet >= 0, "Can't decrement below 0");
        if (decrementAndGet == 0) {
            bvl bvl = this.c;
            if (bvl != null) {
                bvl.f();
            }
            e();
        }
    }

    private final synchronized void e() {
        if (this.n != null) {
            this.a.a.clear();
            this.n = null;
            this.c = null;
            this.r = null;
            this.u = false;
            this.w = false;
            this.s = false;
            buh buh = this.v;
            if (buh.c.a()) {
                buh.a();
            }
            this.v = null;
            this.t = null;
            this.x = 0;
            this.g.a(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0033, code skipped:
            r3.h.a(r3, r0, null);
            r4 = r1.iterator();
     */
    /* JADX WARNING: Missing block: B:19:0x0041, code skipped:
            if (r4.hasNext() == false) goto L_0x0056;
     */
    /* JADX WARNING: Missing block: B:20:0x0043, code skipped:
            r0 = (defpackage.bvi) r4.next();
            r0.b.execute(new defpackage.bvd(r3, r0.a));
     */
    /* JADX WARNING: Missing block: B:21:0x0056, code skipped:
            a();
     */
    /* JADX WARNING: Missing block: B:22:0x0059, code skipped:
            return;
     */
    public final void a(defpackage.bvn r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r3.t = r4;	 Catch:{ all -> 0x006d }
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        monitor-enter(r3);
        r4 = r3.e;	 Catch:{ all -> 0x006a }
        r4.b();	 Catch:{ all -> 0x006a }
        r4 = r3.w;	 Catch:{ all -> 0x006a }
        if (r4 == 0) goto L_0x0013;
    L_0x000e:
        r3.e();	 Catch:{ all -> 0x006a }
        monitor-exit(r3);	 Catch:{ all -> 0x006a }
        return;
    L_0x0013:
        r4 = r3.a;	 Catch:{ all -> 0x006a }
        r4 = r4.a();	 Catch:{ all -> 0x006a }
        if (r4 != 0) goto L_0x0062;
    L_0x001b:
        r4 = r3.u;	 Catch:{ all -> 0x006a }
        if (r4 != 0) goto L_0x005a;
    L_0x001f:
        r4 = 1;
        r3.u = r4;	 Catch:{ all -> 0x006a }
        r0 = r3.n;	 Catch:{ all -> 0x006a }
        r1 = r3.a;	 Catch:{ all -> 0x006a }
        r1 = r1.c();	 Catch:{ all -> 0x006a }
        r2 = r1.b();	 Catch:{ all -> 0x006a }
        r2 = r2 + r4;
        r3.a(r2);	 Catch:{ all -> 0x006a }
        monitor-exit(r3);	 Catch:{ all -> 0x006a }
        r4 = r3.h;
        r2 = 0;
        r4.a(r3, r0, r2);
        r4 = r1.iterator();
    L_0x003d:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0056;
    L_0x0043:
        r0 = r4.next();
        r0 = (defpackage.bvi) r0;
        r1 = r0.b;
        r2 = new bvd;
        r0 = r0.a;
        r2.<init>(r3, r0);
        r1.execute(r2);
        goto L_0x003d;
    L_0x0056:
        r3.a();
        return;
    L_0x005a:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006a }
        r0 = "Already failed once";
        r4.<init>(r0);	 Catch:{ all -> 0x006a }
        throw r4;	 Catch:{ all -> 0x006a }
    L_0x0062:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x006a }
        r0 = "Received an exception without any callbacks to notify";
        r4.<init>(r0);	 Catch:{ all -> 0x006a }
        throw r4;	 Catch:{ all -> 0x006a }
    L_0x006a:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x006a }
        throw r4;
    L_0x006d:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x006d }
        goto L_0x0071;
    L_0x0070:
        throw r4;
    L_0x0071:
        goto L_0x0070;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bve.a(bvn):void");
    }

    public final void a(buh buh) {
        c().execute(buh);
    }

    public final cif h_() {
        return this.e;
    }

    /* JADX WARNING: Missing block: B:17:0x004d, code skipped:
            r6.h.a(r6, r7, r0);
            r7 = r8.iterator();
     */
    /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            if (r7.hasNext() == false) goto L_0x006f;
     */
    /* JADX WARNING: Missing block: B:20:0x005c, code skipped:
            r8 = (defpackage.bvi) r7.next();
            r8.b.execute(new defpackage.bvg(r6, r8.a));
     */
    /* JADX WARNING: Missing block: B:21:0x006f, code skipped:
            a();
     */
    /* JADX WARNING: Missing block: B:22:0x0072, code skipped:
            return;
     */
    public final void a(defpackage.bvw r7, int r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r6.r = r7;	 Catch:{ all -> 0x0086 }
        r6.x = r8;	 Catch:{ all -> 0x0086 }
        monitor-exit(r6);	 Catch:{ all -> 0x0086 }
        monitor-enter(r6);
        r7 = r6.e;	 Catch:{ all -> 0x0083 }
        r7.b();	 Catch:{ all -> 0x0083 }
        r7 = r6.w;	 Catch:{ all -> 0x0083 }
        if (r7 == 0) goto L_0x001a;
    L_0x0010:
        r7 = r6.r;	 Catch:{ all -> 0x0083 }
        r7.d();	 Catch:{ all -> 0x0083 }
        r6.e();	 Catch:{ all -> 0x0083 }
        monitor-exit(r6);	 Catch:{ all -> 0x0083 }
        return;
    L_0x001a:
        r7 = r6.a;	 Catch:{ all -> 0x0083 }
        r7 = r7.a();	 Catch:{ all -> 0x0083 }
        if (r7 != 0) goto L_0x007b;
    L_0x0022:
        r7 = r6.s;	 Catch:{ all -> 0x0083 }
        if (r7 != 0) goto L_0x0073;
    L_0x0026:
        r1 = r6.r;	 Catch:{ all -> 0x0083 }
        r2 = r6.o;	 Catch:{ all -> 0x0083 }
        r4 = r6.n;	 Catch:{ all -> 0x0083 }
        r5 = r6.f;	 Catch:{ all -> 0x0083 }
        r7 = new bvl;	 Catch:{ all -> 0x0083 }
        r3 = 1;
        r0 = r7;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x0083 }
        r6.c = r7;	 Catch:{ all -> 0x0083 }
        r7 = 1;
        r6.s = r7;	 Catch:{ all -> 0x0083 }
        r8 = r6.a;	 Catch:{ all -> 0x0083 }
        r8 = r8.c();	 Catch:{ all -> 0x0083 }
        r0 = r8.b();	 Catch:{ all -> 0x0083 }
        r0 = r0 + r7;
        r6.a(r0);	 Catch:{ all -> 0x0083 }
        r7 = r6.n;	 Catch:{ all -> 0x0083 }
        r0 = r6.c;	 Catch:{ all -> 0x0083 }
        monitor-exit(r6);	 Catch:{ all -> 0x0083 }
        r1 = r6.h;
        r1.a(r6, r7, r0);
        r7 = r8.iterator();
    L_0x0056:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x006f;
    L_0x005c:
        r8 = r7.next();
        r8 = (defpackage.bvi) r8;
        r0 = r8.b;
        r1 = new bvg;
        r8 = r8.a;
        r1.<init>(r6, r8);
        r0.execute(r1);
        goto L_0x0056;
    L_0x006f:
        r6.a();
        return;
    L_0x0073:
        r7 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0083 }
        r8 = "Already have resource";
        r7.<init>(r8);	 Catch:{ all -> 0x0083 }
        throw r7;	 Catch:{ all -> 0x0083 }
    L_0x007b:
        r7 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0083 }
        r8 = "Received a resource without any callbacks to notify";
        r7.<init>(r8);	 Catch:{ all -> 0x0083 }
        throw r7;	 Catch:{ all -> 0x0083 }
    L_0x0083:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0083 }
        throw r7;
    L_0x0086:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0086 }
        goto L_0x008a;
    L_0x0089:
        throw r7;
    L_0x008a:
        goto L_0x0089;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bve.a(bvw, int):void");
    }
}
