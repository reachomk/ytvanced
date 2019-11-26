package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbul */
final class bbul extends AtomicReference implements bbmd, bbnc {
    public static final long serialVersionUID = -502562646270949838L;
    private final /* synthetic */ bbum a;

    bbul(bbum bbum) {
        this.a = bbum;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    /* JADX WARNING: Missing block: B:27:0x0078, code skipped:
            if (r0.getAndIncrement() == 0) goto L_0x007a;
     */
    public final void d_(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = r4.a;
        r1 = r0.c;
        r1.c(r4);
        r1 = r0.get();
        if (r1 == 0) goto L_0x000e;
    L_0x000d:
        goto L_0x0050;
    L_0x000e:
        r1 = 0;
        r2 = 1;
        r1 = r0.compareAndSet(r1, r2);
        if (r1 == 0) goto L_0x0050;
    L_0x0016:
        r1 = r0.a;
        r1.b_(r5);
        r5 = r0.d;
        r5 = r5.decrementAndGet();
        r1 = r0.f;
        r1 = r1.get();
        r1 = (defpackage.bbxb) r1;
        if (r5 == 0) goto L_0x002c;
    L_0x002b:
        goto L_0x0049;
    L_0x002c:
        if (r1 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0035;
    L_0x002f:
        r5 = r1.b();
        if (r5 == 0) goto L_0x0049;
    L_0x0035:
        r5 = r0.e;
        r5 = defpackage.bbyw.a(r5);
        if (r5 == 0) goto L_0x0043;
    L_0x003d:
        r0 = r0.a;
        r0.a(r5);
        return;
    L_0x0043:
        r5 = r0.a;
        r5.a();
        return;
    L_0x0049:
        r5 = r0.decrementAndGet();
        if (r5 != 0) goto L_0x007a;
    L_0x004f:
        return;
    L_0x0050:
        r1 = r0.f;
        r1 = r1.get();
        r1 = (defpackage.bbxb) r1;
        if (r1 != 0) goto L_0x006a;
    L_0x005a:
        r1 = new bbxb;
        r2 = defpackage.bbmc.a;
        r1.<init>(r2);
        r2 = r0.f;
        r3 = 0;
        r2 = r2.compareAndSet(r3, r1);
        if (r2 == 0) goto L_0x0050;
    L_0x006a:
        monitor-enter(r1);
        r1.a(r5);	 Catch:{ all -> 0x007e }
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
        r5 = r0.d;
        r5.decrementAndGet();
        r5 = r0.getAndIncrement();
        if (r5 != 0) goto L_0x007d;
    L_0x007a:
        r0.e();
    L_0x007d:
        return;
    L_0x007e:
        r5 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x007e }
        goto L_0x0082;
    L_0x0081:
        throw r5;
    L_0x0082:
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbul.d_(java.lang.Object):void");
    }

    public final void a_(Throwable th) {
        bbum bbum = this.a;
        bbum.c.c(this);
        if (bbyw.a(bbum.e, th)) {
            bbum.g.bK_();
            bbum.c.bK_();
            bbum.d.decrementAndGet();
            bbum.b();
            return;
        }
        bbzf.a(th);
    }

    public final void bL_() {
        bbum bbum = this.a;
        bbum.c.c(this);
        if (bbum.get() == 0 && bbum.compareAndSet(0, 1)) {
            bbxb bbxb = (bbxb) bbum.f.get();
            if (bbum.d.decrementAndGet() == 0 && (bbxb == null || bbxb.b())) {
                Throwable a = bbyw.a(bbum.e);
                if (a != null) {
                    bbum.a.a(a);
                    return;
                } else {
                    bbum.a.a();
                    return;
                }
            }
            if (bbum.decrementAndGet() != 0) {
                bbum.e();
            }
            return;
        }
        bbum.d.decrementAndGet();
        bbum.b();
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }
}
