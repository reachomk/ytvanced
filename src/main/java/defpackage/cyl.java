package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cyl */
public final class cyl {
    public static final AtomicInteger a = new AtomicInteger(1);
    public static final aaa b = new aaa(8);
    public cyn c;
    public dbz d;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicInteger f = new AtomicInteger(0);
    public int g;
    public cpe h;
    public cpe i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    private int o;
    private ComponentTree p;
    private crg q;
    private cng r;
    private int s = -1;
    private int t = -1;
    private boolean u;
    private boolean v = true;
    private boolean w = false;

    public static cyo a() {
        return new cyo();
    }

    public final synchronized void b() {
        ComponentTree componentTree = this.p;
        if (componentTree != null) {
            this.q = componentTree.h();
        }
        componentTree = this.p;
        if (componentTree != null) {
            this.w = componentTree.s;
        }
        n();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c() {
        this.u = false;
    }

    private final synchronized void m() {
        this.q = null;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(cng cng) {
        ComponentTree componentTree = this.p;
        if (componentTree == null) {
            this.r = cng;
        } else {
            componentTree.p = cng;
        }
    }

    /* JADX WARNING: Missing block: B:12:0x0028, code skipped:
            if (r7 == null) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:13:0x002a, code skipped:
            r9.a(r7, r10, r11, false, r12, r6);
     */
    /* JADX WARNING: Missing block: B:14:0x0033, code skipped:
            monitor-enter(r8);
     */
    /* JADX WARNING: Missing block: B:17:0x0036, code skipped:
            if (r9 != r8.p) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:19:0x003e, code skipped:
            if (r7 != r8.d.d()) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:20:0x0040, code skipped:
            r8.u = true;
     */
    /* JADX WARNING: Missing block: B:21:0x0043, code skipped:
            if (r12 == null) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:22:0x0045, code skipped:
            r8.o = r12.b;
     */
    /* JADX WARNING: Missing block: B:23:0x0049, code skipped:
            monitor-exit(r8);
     */
    /* JADX WARNING: Missing block: B:24:0x004a, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:29:0x0055, code skipped:
            throw new java.lang.IllegalArgumentException("Root component can't be null");
     */
    public final void a(defpackage.cmg r9, int r10, int r11, defpackage.crd r12) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.d;	 Catch:{ all -> 0x0056 }
        r0 = r0.f();	 Catch:{ all -> 0x0056 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        return;
    L_0x000b:
        r8.s = r10;	 Catch:{ all -> 0x0056 }
        r8.t = r11;	 Catch:{ all -> 0x0056 }
        r8.a(r9);	 Catch:{ all -> 0x0056 }
        r9 = r8.p;	 Catch:{ all -> 0x0056 }
        r0 = r8.d;	 Catch:{ all -> 0x0056 }
        r7 = r0.d();	 Catch:{ all -> 0x0056 }
        r0 = r8.d;	 Catch:{ all -> 0x0056 }
        r1 = r0 instanceof defpackage.dcw;	 Catch:{ all -> 0x0056 }
        if (r1 == 0) goto L_0x0025;
    L_0x0020:
        r0 = (defpackage.dcw) r0;	 Catch:{ all -> 0x0056 }
        r0 = r0.a;	 Catch:{ all -> 0x0056 }
        goto L_0x0026;
    L_0x0025:
        r0 = 0;
    L_0x0026:
        r6 = r0;
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        if (r7 == 0) goto L_0x004e;
    L_0x002a:
        r4 = 0;
        r0 = r9;
        r1 = r7;
        r2 = r10;
        r3 = r11;
        r5 = r12;
        r0.a(r1, r2, r3, r4, r5, r6);
        monitor-enter(r8);
        r10 = r8.p;	 Catch:{ all -> 0x004b }
        if (r9 != r10) goto L_0x0049;
    L_0x0038:
        r9 = r8.d;	 Catch:{ all -> 0x004b }
        r9 = r9.d();	 Catch:{ all -> 0x004b }
        if (r7 != r9) goto L_0x0049;
    L_0x0040:
        r9 = 1;
        r8.u = r9;	 Catch:{ all -> 0x004b }
        if (r12 == 0) goto L_0x0049;
    L_0x0045:
        r9 = r12.b;	 Catch:{ all -> 0x004b }
        r8.o = r9;	 Catch:{ all -> 0x004b }
    L_0x0049:
        monitor-exit(r8);	 Catch:{ all -> 0x004b }
        return;
    L_0x004b:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x004b }
        throw r9;
    L_0x004e:
        r9 = new java.lang.IllegalArgumentException;
        r10 = "Root component can't be null";
        r9.<init>(r10);
        throw r9;
    L_0x0056:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0056 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyl.a(cmg, int, int, crd):void");
    }

    public final void a(cmg cmg, int i, int i2) {
        a(cmg, i, i2, null);
    }

    /* JADX WARNING: Missing block: B:12:0x0028, code skipped:
            if (r12 == null) goto L_0x002d;
     */
    /* JADX WARNING: Missing block: B:13:0x002a, code skipped:
            r9.a(r12);
     */
    /* JADX WARNING: Missing block: B:14:0x002d, code skipped:
            if (r7 == null) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:15:0x002f, code skipped:
            r9.a(r7, r10, r11, true, null, r6);
     */
    /* JADX WARNING: Missing block: B:16:0x0038, code skipped:
            monitor-enter(r8);
     */
    /* JADX WARNING: Missing block: B:19:0x003b, code skipped:
            if (r8.p != r9) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:21:0x0043, code skipped:
            if (r7 != r8.d.d()) goto L_0x0048;
     */
    /* JADX WARNING: Missing block: B:22:0x0045, code skipped:
            r8.u = true;
     */
    /* JADX WARNING: Missing block: B:23:0x0048, code skipped:
            monitor-exit(r8);
     */
    /* JADX WARNING: Missing block: B:24:0x0049, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:29:0x0054, code skipped:
            throw new java.lang.IllegalArgumentException("Root component can't be null");
     */
    public final void a(defpackage.cmg r9, int r10, int r11, defpackage.cnd r12) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.d;	 Catch:{ all -> 0x0055 }
        r0 = r0.f();	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r8);	 Catch:{ all -> 0x0055 }
        return;
    L_0x000b:
        r8.s = r10;	 Catch:{ all -> 0x0055 }
        r8.t = r11;	 Catch:{ all -> 0x0055 }
        r8.a(r9);	 Catch:{ all -> 0x0055 }
        r9 = r8.p;	 Catch:{ all -> 0x0055 }
        r0 = r8.d;	 Catch:{ all -> 0x0055 }
        r7 = r0.d();	 Catch:{ all -> 0x0055 }
        r0 = r8.d;	 Catch:{ all -> 0x0055 }
        r1 = r0 instanceof defpackage.dcw;	 Catch:{ all -> 0x0055 }
        if (r1 == 0) goto L_0x0025;
    L_0x0020:
        r0 = (defpackage.dcw) r0;	 Catch:{ all -> 0x0055 }
        r0 = r0.a;	 Catch:{ all -> 0x0055 }
        goto L_0x0026;
    L_0x0025:
        r0 = 0;
    L_0x0026:
        r6 = r0;
        monitor-exit(r8);	 Catch:{ all -> 0x0055 }
        if (r12 == 0) goto L_0x002d;
    L_0x002a:
        r9.a(r12);
    L_0x002d:
        if (r7 == 0) goto L_0x004d;
    L_0x002f:
        r4 = 1;
        r5 = 0;
        r0 = r9;
        r1 = r7;
        r2 = r10;
        r3 = r11;
        r0.a(r1, r2, r3, r4, r5, r6);
        monitor-enter(r8);
        r10 = r8.p;	 Catch:{ all -> 0x004a }
        if (r10 != r9) goto L_0x0048;
    L_0x003d:
        r9 = r8.d;	 Catch:{ all -> 0x004a }
        r9 = r9.d();	 Catch:{ all -> 0x004a }
        if (r7 != r9) goto L_0x0048;
    L_0x0045:
        r9 = 1;
        r8.u = r9;	 Catch:{ all -> 0x004a }
    L_0x0048:
        monitor-exit(r8);	 Catch:{ all -> 0x004a }
        return;
    L_0x004a:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x004a }
        throw r9;
    L_0x004d:
        r9 = new java.lang.IllegalArgumentException;
        r10 = "Root component can't be null";
        r9.<init>(r10);
        throw r9;
    L_0x0055:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0055 }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyl.a(cmg, int, int, cnd):void");
    }

    public final synchronized void d() {
        ComponentTree componentTree = this.p;
        if (componentTree != null) {
            componentTree.a(null);
        }
    }

    public final synchronized dbz e() {
        return this.d;
    }

    public final synchronized boolean f() {
        return this.u;
    }

    public final synchronized boolean a(int i, int i2) {
        boolean z;
        z = f() && this.s == i && this.t == i2;
        return z;
    }

    public final synchronized ComponentTree g() {
        return this.p;
    }

    public final synchronized void a(dbz dbz) {
        c();
        this.d = dbz;
    }

    public final synchronized void a(cpe cpe) {
        this.h = cpe;
        ComponentTree componentTree = this.p;
        if (componentTree != null) {
            synchronized (componentTree.f) {
                cnf cnf = componentTree.g;
                if (cnf != null) {
                    componentTree.o.removeCallbacks(cnf);
                }
            }
            synchronized (componentTree.q) {
                cmx cmx = componentTree.r;
                if (cmx != null) {
                    componentTree.o.removeCallbacks(cmx);
                }
            }
            componentTree.o = cpe;
            componentTree.a();
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized int h() {
        return this.o;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i) {
        this.o = i;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i, int i2, int i3, int i4, int i5) {
        ComponentTree componentTree = this.p;
        if (componentTree != null) {
            componentTree.a(i, i2, i3);
        }
    }

    /* Access modifiers changed, original: final */
    public final int i() {
        return this.f.get();
    }

    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            return r2;
     */
    public final synchronized boolean j() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.d;	 Catch:{ all -> 0x001f }
        r0 = r0.f();	 Catch:{ all -> 0x001f }
        r1 = 0;
        r2 = 1;
        if (r0 != 0) goto L_0x001d;
    L_0x000b:
        r0 = r5.p;	 Catch:{ all -> 0x001f }
        if (r0 == 0) goto L_0x001c;
    L_0x000f:
        r3 = r5.s;	 Catch:{ all -> 0x001f }
        r4 = r5.t;	 Catch:{ all -> 0x001f }
        r0 = r0.a(r3, r4);	 Catch:{ all -> 0x001f }
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x001d;
    L_0x001a:
        monitor-exit(r5);
        return r1;
    L_0x001c:
        r2 = 0;
    L_0x001d:
        monitor-exit(r5);
        return r2;
    L_0x001f:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyl.j():boolean");
    }

    public final synchronized boolean k() {
        return this.v;
    }

    public final synchronized void a(boolean z) {
        this.v = z;
    }

    public final synchronized void l() {
        n();
        m();
        this.d = null;
        this.h = null;
        this.i = null;
        this.k = false;
        this.j = false;
        this.l = false;
        this.r = null;
        this.s = -1;
        this.t = -1;
        this.v = true;
        this.w = false;
        this.f.set(0);
        if (this.e.getAndSet(true)) {
            throw new RuntimeException("Releasing already released ComponentTreeHolder!");
        }
        b.a(this);
    }

    private final void a(cmg cmg) {
        if (this.p == null) {
            Object a = this.d.a("layout_diffing_enabled");
            cmy a2 = ComponentTree.a(cmg, this.d.d());
            if (a != null) {
                a2.d = ((Boolean) a).booleanValue();
            }
            a2.e = this.h;
            a2.g = this.q;
            cnd cnd = null;
            a2.f = null;
            a2.m = false;
            a2.l = false;
            a2.p = this.l;
            cyn cyn = this.c;
            if (cyn != null) {
                cnd = cyn.a(this);
            }
            a2.k = cnd;
            a2.n = this.n;
            a2.j = this.w;
            a2.c = this.m;
            this.p = a2.a();
            cng cng = this.r;
            if (cng != null) {
                this.p.p = cng;
            }
        }
    }

    private final void n() {
        ComponentTree componentTree = this.p;
        if (componentTree != null) {
            componentTree.i();
            this.p = null;
            this.d.k();
        }
        this.u = false;
    }
}
