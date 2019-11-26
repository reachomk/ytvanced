package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbsx */
final class bbsx extends AtomicInteger implements bbnc {
    public static final long serialVersionUID = 8567835998786448817L;
    public final bbmo a;
    public final bbsy[] b;
    public Object[] c;
    public final boolean d;
    public volatile boolean e;
    public volatile boolean f;
    public final bbyr g = new bbyr();
    public int h;
    private final bbnv i;
    private final bbxb j;
    private int k;

    bbsx(bbmo bbmo, bbnv bbnv, int i, int i2) {
        this.a = bbmo;
        this.i = bbnv;
        int i3 = 0;
        this.d = false;
        this.c = new Object[i];
        bbsy[] bbsyArr = new bbsy[i];
        while (i3 < i) {
            bbsyArr[i3] = new bbsy(this, i3);
            i3++;
        }
        this.b = bbsyArr;
        this.j = new bbxb(i2);
    }

    public final void bK_() {
        if (!this.e) {
            this.e = true;
            a();
            if (getAndIncrement() == 0) {
                a(this.j);
            }
        }
    }

    public final boolean c() {
        return this.e;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        for (AtomicReference a : this.b) {
            bbnz.a(a);
        }
    }

    private final void a(bbxb bbxb) {
        synchronized (this) {
            this.c = null;
        }
        bbxb.e();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (getAndIncrement() == 0) {
            bbxb bbxb = this.j;
            bbmo bbmo = this.a;
            int i = 1;
            while (!this.e) {
                if (this.g.get() != null) {
                    a();
                    a(bbxb);
                    bbmo.a(bbyw.a(this.g));
                    return;
                }
                boolean z = this.f;
                Object[] objArr = (Object[]) bbxb.bI_();
                Object obj = objArr != null ? null : 1;
                if (z) {
                    if (obj != null) {
                        a(bbxb);
                        Throwable a = bbyw.a(this.g);
                        if (a == null) {
                            bbmo.a();
                            return;
                        } else {
                            bbmo.a(a);
                            return;
                        }
                    }
                } else if (obj != null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                try {
                    bbmo.b_(bbow.a(this.i.a(objArr), "The combiner returned a null value"));
                } catch (Throwable th) {
                    bbnm.a(th);
                    bbyw.a(this.g, th);
                    a();
                    a(bbxb);
                    bbmo.a(bbyw.a(this.g));
                    return;
                }
            }
            a(bbxb);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:14:0x0023, code skipped:
            if (r4 == null) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            b();
     */
    /* JADX WARNING: Missing block: B:16:0x0028, code skipped:
            return;
     */
    public final void a(int r4, java.lang.Object r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0029 }
        if (r0 != 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r3);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0007:
        r1 = r0[r4];	 Catch:{ all -> 0x0029 }
        r2 = r3.k;	 Catch:{ all -> 0x0029 }
        if (r1 != 0) goto L_0x0011;
    L_0x000d:
        r2 = r2 + 1;
        r3.k = r2;	 Catch:{ all -> 0x0029 }
    L_0x0011:
        r0[r4] = r5;	 Catch:{ all -> 0x0029 }
        r4 = r0.length;	 Catch:{ all -> 0x0029 }
        if (r2 != r4) goto L_0x0021;
    L_0x0016:
        r4 = r3.j;	 Catch:{ all -> 0x0029 }
        r5 = r0.clone();	 Catch:{ all -> 0x0029 }
        r4.a(r5);	 Catch:{ all -> 0x0029 }
        r4 = 1;
        goto L_0x0022;
    L_0x0021:
        r4 = 0;
    L_0x0022:
        monitor-exit(r3);	 Catch:{ all -> 0x0029 }
        if (r4 == 0) goto L_0x0028;
    L_0x0025:
        r3.b();
    L_0x0028:
        return;
    L_0x0029:
        r4 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0029 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbsx.a(int, java.lang.Object):void");
    }
}
