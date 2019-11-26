package defpackage;

import java.util.ArrayDeque;

/* renamed from: odl */
public abstract class odl implements odh {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final odj[] e;
    private final odm[] f;
    private int g;
    private int h;
    private odj i;
    private Exception j;
    private boolean k;
    private boolean l;
    private int m;

    public odl(odj[] odjArr, odm[] odmArr) {
        this.e = odjArr;
        this.g = odjArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = i();
        }
        this.f = odmArr;
        this.h = odmArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = j();
        }
        this.a = new odn(this);
        this.a.start();
    }

    public abstract Exception a(Throwable th);

    public abstract Exception a(odj odj, odm odm, boolean z);

    public abstract odj i();

    public abstract odm j();

    public final void a(int i) {
        oxz.b(this.g == this.e.length);
        for (odj a : this.e) {
            a.a(i);
        }
    }

    /* renamed from: f */
    public final odj b() {
        odj odj;
        synchronized (this.b) {
            k();
            oxz.b(this.i == null);
            int i = this.g;
            if (i != 0) {
                odj[] odjArr = this.e;
                i--;
                this.g = i;
                odj = odjArr[i];
            } else {
                odj = null;
            }
            this.i = odj;
            odj = this.i;
        }
        return odj;
    }

    public final void a(odj odj) {
        synchronized (this.b) {
            k();
            oxz.a(odj == this.i);
            this.c.addLast(odj);
            l();
            this.i = null;
        }
    }

    /* renamed from: g */
    public final odm c() {
        synchronized (this.b) {
            k();
            if (this.d.isEmpty()) {
                return null;
            }
            odm odm = (odm) this.d.removeFirst();
            return odm;
        }
    }

    public void a(odm odm) {
        synchronized (this.b) {
            odm.clear();
            odm[] odmArr = this.f;
            int i = this.h;
            this.h = i + 1;
            odmArr[i] = odm;
            l();
        }
    }

    public final void d() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            odj odj = this.i;
            if (odj != null) {
                b(odj);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                b((odj) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((odm) this.d.removeFirst()).release();
            }
        }
    }

    public void e() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private final void k() {
        Exception exception = this.j;
        if (exception != null) {
            throw exception;
        }
    }

    private final void l() {
        if (m()) {
            this.b.notify();
        }
    }

    /* JADX WARNING: Missing block: B:15:0x0035, code skipped:
            if (r1.isEndOfStream() == false) goto L_0x003c;
     */
    /* JADX WARNING: Missing block: B:16:0x0037, code skipped:
            r3.addFlag(4);
     */
    /* JADX WARNING: Missing block: B:18:0x0040, code skipped:
            if (r1.isDecodeOnly() == false) goto L_0x0047;
     */
    /* JADX WARNING: Missing block: B:19:0x0042, code skipped:
            r3.addFlag(defpackage.aocf.UNSET_ENUM_VALUE);
     */
    /* JADX WARNING: Missing block: B:21:?, code skipped:
            r6.j = a(r1, r3, r4);
     */
    /* JADX WARNING: Missing block: B:22:0x004e, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:23:0x004f, code skipped:
            r6.j = a(r0);
     */
    /* JADX WARNING: Missing block: B:24:0x0056, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:25:0x0057, code skipped:
            r6.j = a(r0);
     */
    public final boolean h() {
        /*
        r6 = this;
        r0 = r6.b;
        monitor-enter(r0);
    L_0x0003:
        r1 = r6.l;	 Catch:{ all -> 0x0097 }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = r6.m();	 Catch:{ all -> 0x0097 }
        if (r1 != 0) goto L_0x0013;
    L_0x000d:
        r1 = r6.b;	 Catch:{ all -> 0x0097 }
        r1.wait();	 Catch:{ all -> 0x0097 }
        goto L_0x0003;
    L_0x0013:
        r1 = r6.l;	 Catch:{ all -> 0x0097 }
        r2 = 0;
        if (r1 == 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        return r2;
    L_0x001a:
        r1 = r6.c;	 Catch:{ all -> 0x0097 }
        r1 = r1.removeFirst();	 Catch:{ all -> 0x0097 }
        r1 = (defpackage.odj) r1;	 Catch:{ all -> 0x0097 }
        r3 = r6.f;	 Catch:{ all -> 0x0097 }
        r4 = r6.h;	 Catch:{ all -> 0x0097 }
        r4 = r4 + -1;
        r6.h = r4;	 Catch:{ all -> 0x0097 }
        r3 = r3[r4];	 Catch:{ all -> 0x0097 }
        r4 = r6.k;	 Catch:{ all -> 0x0097 }
        r6.k = r2;	 Catch:{ all -> 0x0097 }
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        r0 = r1.isEndOfStream();
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r0 = 4;
        r3.addFlag(r0);
        goto L_0x0069;
    L_0x003c:
        r0 = r1.isDecodeOnly();
        if (r0 == 0) goto L_0x0047;
    L_0x0042:
        r0 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3.addFlag(r0);
    L_0x0047:
        r0 = r6.a(r1, r3, r4);	 Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
        r6.j = r0;	 Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
        goto L_0x005d;
    L_0x004e:
        r0 = move-exception;
        r0 = r6.a(r0);
        r6.j = r0;
        goto L_0x005d;
    L_0x0056:
        r0 = move-exception;
        r0 = r6.a(r0);
        r6.j = r0;
    L_0x005d:
        r0 = r6.j;
        if (r0 == 0) goto L_0x0069;
    L_0x0061:
        r0 = r6.b;
        monitor-enter(r0);
        monitor-exit(r0);	 Catch:{ all -> 0x0066 }
        return r2;
    L_0x0066:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0066 }
        throw r1;
    L_0x0069:
        r4 = r6.b;
        monitor-enter(r4);
        r0 = r6.k;	 Catch:{ all -> 0x0094 }
        r5 = 1;
        if (r0 == 0) goto L_0x0075;
    L_0x0071:
        r3.release();	 Catch:{ all -> 0x0094 }
        goto L_0x008f;
    L_0x0075:
        r0 = r3.isDecodeOnly();	 Catch:{ all -> 0x0094 }
        if (r0 == 0) goto L_0x0084;
    L_0x007b:
        r0 = r6.m;	 Catch:{ all -> 0x0094 }
        r0 = r0 + r5;
        r6.m = r0;	 Catch:{ all -> 0x0094 }
        r3.release();	 Catch:{ all -> 0x0094 }
        goto L_0x008f;
    L_0x0084:
        r0 = r6.m;	 Catch:{ all -> 0x0094 }
        r3.skippedOutputBufferCount = r0;	 Catch:{ all -> 0x0094 }
        r6.m = r2;	 Catch:{ all -> 0x0094 }
        r0 = r6.d;	 Catch:{ all -> 0x0094 }
        r0.addLast(r3);	 Catch:{ all -> 0x0094 }
    L_0x008f:
        r6.b(r1);	 Catch:{ all -> 0x0094 }
        monitor-exit(r4);	 Catch:{ all -> 0x0094 }
        return r5;
    L_0x0094:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0094 }
        throw r0;
    L_0x0097:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0097 }
        goto L_0x009b;
    L_0x009a:
        throw r1;
    L_0x009b:
        goto L_0x009a;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odl.h():boolean");
    }

    private final boolean m() {
        return !this.c.isEmpty() && this.h > 0;
    }

    private final void b(odj odj) {
        odj.clear();
        odj[] odjArr = this.e;
        int i = this.g;
        this.g = i + 1;
        odjArr[i] = odj;
    }
}
