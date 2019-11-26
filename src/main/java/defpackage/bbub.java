package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbub */
final class bbub extends AtomicReference implements bbmo {
    public static final long serialVersionUID = -4606175640614850599L;
    public final long a;
    public volatile boolean b;
    public volatile bbpg c;
    private final bbue d;
    private int e;

    bbub(bbue bbue, long j) {
        this.a = j;
        this.d = bbue;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc) && (bbnc instanceof bboz)) {
            bboz bboz = (bboz) bbnc;
            int a = bboz.a(7);
            if (a == 1) {
                this.e = 1;
                this.c = bboz;
                this.b = true;
                this.d.b();
            } else if (a == 2) {
                this.e = 2;
                this.c = bboz;
            }
        }
    }

    /* JADX WARNING: Missing block: B:7:0x001d, code skipped:
            if (r0.decrementAndGet() != 0) goto L_0x0037;
     */
    public final void b_(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = r3.e;
        if (r0 != 0) goto L_0x003b;
    L_0x0004:
        r0 = r3.d;
        r1 = r0.get();
        if (r1 != 0) goto L_0x0020;
    L_0x000c:
        r1 = 0;
        r2 = 1;
        r1 = r0.compareAndSet(r1, r2);
        if (r1 == 0) goto L_0x0020;
    L_0x0014:
        r1 = r0.a;
        r1.b_(r4);
        r4 = r0.decrementAndGet();
        if (r4 == 0) goto L_0x003a;
    L_0x001f:
        goto L_0x0037;
    L_0x0020:
        r1 = r3.c;
        if (r1 != 0) goto L_0x002d;
    L_0x0024:
        r1 = new bbxb;
        r2 = r0.c;
        r1.<init>(r2);
        r3.c = r1;
    L_0x002d:
        r1.a(r4);
        r4 = r0.getAndIncrement();
        if (r4 == 0) goto L_0x0037;
    L_0x0036:
        return;
    L_0x0037:
        r0.e();
    L_0x003a:
        return;
    L_0x003b:
        r4 = r3.d;
        r4.b();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbub.b_(java.lang.Object):void");
    }

    public final void a(Throwable th) {
        if (bbyw.a(this.d.d, th)) {
            this.d.f();
            this.b = true;
            this.d.b();
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        this.b = true;
        this.d.b();
    }
}
