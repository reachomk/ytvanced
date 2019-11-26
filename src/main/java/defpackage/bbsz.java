package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbsz */
final class bbsz extends AtomicInteger implements bbmo, bbnc {
    public static final long serialVersionUID = -6951100001833242599L;
    public final bbyr a = new bbyr();
    public final boolean b;
    public bbnc c;
    public volatile boolean d;
    private final bbmo e;
    private final bbnv f;
    private final int g;
    private final bbtc h;
    private bbpg i;
    private volatile boolean j;
    private volatile boolean k;
    private int l;

    bbsz(bbmo bbmo, bbnv bbnv, int i, boolean z) {
        this.e = bbmo;
        this.f = bbnv;
        this.g = i;
        this.b = z;
        this.h = new bbtc(bbmo, this);
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            if (bbnc instanceof bboz) {
                bboz bboz = (bboz) bbnc;
                int a = bboz.a(3);
                if (a == 1) {
                    this.l = 1;
                    this.i = bboz;
                    this.j = true;
                    this.e.a((bbnc) this);
                    b();
                    return;
                } else if (a == 2) {
                    this.l = 2;
                    this.i = bboz;
                    this.e.a((bbnc) this);
                    return;
                }
            }
            this.i = new bbxb(this.g);
            this.e.a((bbnc) this);
        }
    }

    public final void b_(Object obj) {
        if (this.l == 0) {
            this.i.a(obj);
        }
        b();
    }

    public final void a(Throwable th) {
        if (bbyw.a(this.a, th)) {
            this.j = true;
            b();
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        this.j = true;
        b();
    }

    public final boolean c() {
        return this.k;
    }

    public final void bK_() {
        this.k = true;
        this.c.bK_();
        bbnz.a(this.h);
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:19:0x003b, code skipped:
            if (r5 != null) goto L_0x0050;
     */
    public final void b() {
        /*
        r6 = this;
        r0 = r6.getAndIncrement();
        if (r0 != 0) goto L_0x00b7;
    L_0x0006:
        r0 = r6.e;
        r1 = r6.i;
        r2 = r6.a;
    L_0x000c:
        r3 = r6.d;
        if (r3 != 0) goto L_0x00b1;
    L_0x0010:
        r3 = r6.k;
        if (r3 == 0) goto L_0x0018;
    L_0x0014:
        r1.e();
        return;
    L_0x0018:
        r3 = r6.b;
        r4 = 1;
        if (r3 != 0) goto L_0x0033;
    L_0x001d:
        r3 = r2.get();
        r3 = (java.lang.Throwable) r3;
        if (r3 != 0) goto L_0x0026;
    L_0x0025:
        goto L_0x0033;
    L_0x0026:
        r1.e();
        r6.k = r4;
        r1 = defpackage.bbyw.a(r2);
        r0.a(r1);
        return;
    L_0x0033:
        r3 = r6.j;
        r5 = r1.bI_();	 Catch:{ all -> 0x009b }
        if (r3 != 0) goto L_0x003e;
    L_0x003b:
        if (r5 == 0) goto L_0x00b1;
    L_0x003d:
        goto L_0x0050;
    L_0x003e:
        if (r5 != 0) goto L_0x0050;
    L_0x0040:
        r6.k = r4;
        r1 = defpackage.bbyw.a(r2);
        if (r1 == 0) goto L_0x004c;
    L_0x0048:
        r0.a(r1);
        return;
    L_0x004c:
        r0.a();
        return;
    L_0x0050:
        r3 = r6.f;	 Catch:{ all -> 0x0082 }
        r3 = r3.a(r5);	 Catch:{ all -> 0x0082 }
        r5 = "The mapper returned a null ObservableSource";
        r3 = defpackage.bbow.a(r3, r5);	 Catch:{ all -> 0x0082 }
        r3 = (defpackage.bbmm) r3;	 Catch:{ all -> 0x0082 }
        r5 = r3 instanceof java.util.concurrent.Callable;
        if (r5 == 0) goto L_0x007a;
    L_0x0062:
        r3 = (java.util.concurrent.Callable) r3;	 Catch:{ all -> 0x0072 }
        r3 = r3.call();	 Catch:{ all -> 0x0072 }
        if (r3 == 0) goto L_0x000c;
    L_0x006a:
        r4 = r6.k;
        if (r4 != 0) goto L_0x000c;
    L_0x006e:
        r0.b_(r3);
        goto L_0x000c;
    L_0x0072:
        r3 = move-exception;
        defpackage.bbnm.a(r3);
        defpackage.bbyw.a(r2, r3);
        goto L_0x000c;
    L_0x007a:
        r6.d = r4;
        r4 = r6.h;
        r3.b(r4);
        goto L_0x00b1;
    L_0x0082:
        r3 = move-exception;
        defpackage.bbnm.a(r3);
        r6.k = r4;
        r4 = r6.c;
        r4.bK_();
        r1.e();
        defpackage.bbyw.a(r2, r3);
        r1 = defpackage.bbyw.a(r2);
        r0.a(r1);
        return;
    L_0x009b:
        r1 = move-exception;
        defpackage.bbnm.a(r1);
        r6.k = r4;
        r3 = r6.c;
        r3.bK_();
        defpackage.bbyw.a(r2, r1);
        r1 = defpackage.bbyw.a(r2);
        r0.a(r1);
        return;
    L_0x00b1:
        r3 = r6.decrementAndGet();
        if (r3 != 0) goto L_0x000c;
    L_0x00b7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbsz.b():void");
    }
}
