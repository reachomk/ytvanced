package defpackage;

import java.util.LinkedList;

/* renamed from: nxm */
public abstract class nxm extends Thread {
    private final Object a = new Object();
    private final LinkedList b = new LinkedList();
    private final LinkedList c = new LinkedList();
    private final nxk[] d;
    private final nxj[] e;
    private int f;
    private int g;
    private nxk h;
    private Exception i;
    private boolean j;
    private boolean k;

    public nxm(nxk[] nxkArr, nxj[] nxjArr) {
        this.d = nxkArr;
        this.f = nxkArr.length;
        for (int i = 0; i < this.f; i++) {
            this.d[i] = a();
        }
        this.e = nxjArr;
        this.g = nxjArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = c();
        }
    }

    public abstract Exception a(nxk nxk, nxj nxj, boolean z);

    public abstract nxk a();

    public abstract nxj c();

    public final void a(int i) {
        int i2 = 0;
        nwf.b(this.f == this.d.length);
        while (true) {
            nxk[] nxkArr = this.d;
            if (i2 < nxkArr.length) {
                nxkArr[i2].a.a(i);
                i2++;
            } else {
                return;
            }
        }
    }

    public final nxk d() {
        synchronized (this.a) {
            g();
            nwf.b(this.h == null);
            int i = this.f;
            if (i == 0) {
                return null;
            }
            nxk[] nxkArr = this.d;
            i--;
            this.f = i;
            nxh nxh = nxkArr[i];
            nxh.reset();
            this.h = nxh;
            return nxh;
        }
    }

    public final void a(nxk nxk) {
        synchronized (this.a) {
            g();
            nwf.a(nxk == this.h);
            this.b.addLast(nxk);
            h();
            this.h = null;
        }
    }

    public final nxj e() {
        synchronized (this.a) {
            g();
            if (this.c.isEmpty()) {
                return null;
            }
            nxj nxj = (nxj) this.c.removeFirst();
            return nxj;
        }
    }

    public final void a(nxj nxj) {
        synchronized (this.a) {
            nxj[] nxjArr = this.e;
            int i = this.g;
            this.g = i + 1;
            nxjArr[i] = nxj;
            h();
        }
    }

    public final void f() {
        synchronized (this.a) {
            this.j = true;
            nxk nxk = this.h;
            if (nxk != null) {
                nxk[] nxkArr = this.d;
                int i = this.f;
                this.f = i + 1;
                nxkArr[i] = nxk;
                this.h = null;
            }
            while (!this.b.isEmpty()) {
                nxk[] nxkArr2 = this.d;
                int i2 = this.f;
                this.f = i2 + 1;
                nxkArr2[i2] = (nxk) this.b.removeFirst();
            }
            while (!this.c.isEmpty()) {
                ((nxj) this.c.removeFirst()).release();
            }
        }
    }

    public void b() {
        synchronized (this.a) {
            this.k = true;
            this.a.notify();
        }
        try {
            join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private final void g() {
        Exception exception = this.i;
        if (exception != null) {
            throw exception;
        }
    }

    private final void h() {
        if (i()) {
            this.a.notify();
        }
    }

    /* JADX WARNING: Missing block: B:16:?, code skipped:
            r2.reset();
     */
    /* JADX WARNING: Missing block: B:17:0x003a, code skipped:
            if (r1.getFlag(1) == false) goto L_0x0040;
     */
    /* JADX WARNING: Missing block: B:18:0x003c, code skipped:
            r2.setFlag(1);
     */
    /* JADX WARNING: Missing block: B:20:0x0044, code skipped:
            if (r1.getFlag(2) == false) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:21:0x0046, code skipped:
            r2.setFlag(2);
     */
    /* JADX WARNING: Missing block: B:22:0x0049, code skipped:
            r6.i = a(r1, r2, r3);
     */
    /* JADX WARNING: Missing block: B:23:0x0051, code skipped:
            if (r6.i == null) goto L_0x005b;
     */
    /* JADX WARNING: Missing block: B:24:0x0053, code skipped:
            r0 = r6.a;
     */
    /* JADX WARNING: Missing block: B:25:0x0055, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:27:?, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:28:0x0057, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:33:0x005b, code skipped:
            r0 = r6.a;
     */
    /* JADX WARNING: Missing block: B:34:0x005d, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:37:0x0060, code skipped:
            if (r6.j != false) goto L_0x006f;
     */
    /* JADX WARNING: Missing block: B:39:0x0066, code skipped:
            if (r2.getFlag(2) == false) goto L_0x0069;
     */
    /* JADX WARNING: Missing block: B:41:0x0069, code skipped:
            r6.c.addLast(r2);
     */
    /* JADX WARNING: Missing block: B:42:0x006f, code skipped:
            r2.release();
     */
    /* JADX WARNING: Missing block: B:43:0x0072, code skipped:
            r2 = r6.d;
            r3 = r6.f;
            r6.f = r3 + 1;
            r2[r3] = r1;
     */
    /* JADX WARNING: Missing block: B:44:0x007c, code skipped:
            monitor-exit(r0);
     */
    public final void run() {
        /*
        r6 = this;
    L_0x0000:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x0084 }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0084 }
    L_0x0003:
        r1 = r6.k;	 Catch:{ all -> 0x0081 }
        if (r1 != 0) goto L_0x0013;
    L_0x0007:
        r1 = r6.i();	 Catch:{ all -> 0x0081 }
        if (r1 != 0) goto L_0x0013;
    L_0x000d:
        r1 = r6.a;	 Catch:{ all -> 0x0081 }
        r1.wait();	 Catch:{ all -> 0x0081 }
        goto L_0x0003;
    L_0x0013:
        r1 = r6.k;	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0019;
    L_0x0017:
        monitor-exit(r0);	 Catch:{ all -> 0x0081 }
        return;
    L_0x0019:
        r1 = r6.b;	 Catch:{ all -> 0x0081 }
        r1 = r1.removeFirst();	 Catch:{ all -> 0x0081 }
        r1 = (defpackage.nxk) r1;	 Catch:{ all -> 0x0081 }
        r2 = r6.e;	 Catch:{ all -> 0x0081 }
        r3 = r6.g;	 Catch:{ all -> 0x0081 }
        r3 = r3 + -1;
        r6.g = r3;	 Catch:{ all -> 0x0081 }
        r2 = r2[r3];	 Catch:{ all -> 0x0081 }
        r3 = r6.j;	 Catch:{ all -> 0x0081 }
        r4 = 0;
        r6.j = r4;	 Catch:{ all -> 0x0081 }
        monitor-exit(r0);	 Catch:{ all -> 0x0081 }
        r2.reset();	 Catch:{ InterruptedException -> 0x0084 }
        r0 = 1;
        r4 = r1.getFlag(r0);	 Catch:{ InterruptedException -> 0x0084 }
        r5 = 2;
        if (r4 == 0) goto L_0x0040;
    L_0x003c:
        r2.setFlag(r0);	 Catch:{ InterruptedException -> 0x0084 }
        goto L_0x005b;
    L_0x0040:
        r0 = r1.getFlag(r5);	 Catch:{ InterruptedException -> 0x0084 }
        if (r0 == 0) goto L_0x0049;
    L_0x0046:
        r2.setFlag(r5);	 Catch:{ InterruptedException -> 0x0084 }
    L_0x0049:
        r0 = r6.a(r1, r2, r3);	 Catch:{ InterruptedException -> 0x0084 }
        r6.i = r0;	 Catch:{ InterruptedException -> 0x0084 }
        r0 = r6.i;	 Catch:{ InterruptedException -> 0x0084 }
        if (r0 == 0) goto L_0x005b;
    L_0x0053:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x0084 }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0084 }
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        return;
    L_0x0058:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0058 }
        throw r1;	 Catch:{ InterruptedException -> 0x0084 }
    L_0x005b:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x0084 }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0084 }
        r3 = r6.j;	 Catch:{ all -> 0x007e }
        if (r3 != 0) goto L_0x006f;
    L_0x0062:
        r3 = r2.getFlag(r5);	 Catch:{ all -> 0x007e }
        if (r3 == 0) goto L_0x0069;
    L_0x0068:
        goto L_0x006f;
    L_0x0069:
        r3 = r6.c;	 Catch:{ all -> 0x007e }
        r3.addLast(r2);	 Catch:{ all -> 0x007e }
        goto L_0x0072;
    L_0x006f:
        r2.release();	 Catch:{ all -> 0x007e }
    L_0x0072:
        r2 = r6.d;	 Catch:{ all -> 0x007e }
        r3 = r6.f;	 Catch:{ all -> 0x007e }
        r4 = r3 + 1;
        r6.f = r4;	 Catch:{ all -> 0x007e }
        r2[r3] = r1;	 Catch:{ all -> 0x007e }
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        goto L_0x0000;
    L_0x007e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x007e }
        throw r1;	 Catch:{ InterruptedException -> 0x0084 }
    L_0x0081:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0081 }
        throw r1;	 Catch:{ InterruptedException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r1.<init>(r0);
        goto L_0x008c;
    L_0x008b:
        throw r1;
    L_0x008c:
        goto L_0x008b;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxm.run():void");
    }

    private final boolean i() {
        return !this.b.isEmpty() && this.g > 0;
    }
}
