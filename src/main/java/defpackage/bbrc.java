package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbrc */
final class bbrc extends AtomicLong implements bblz, bctr {
    public static final long serialVersionUID = 7565982551505011832L;
    private final bcto a;
    private final bbnr b;
    private final bbnw c;
    private Object d;
    private volatile boolean e;
    private boolean f;
    private boolean g;

    bbrc(bcto bcto, bbnr bbnr, bbnw bbnw, Object obj) {
        this.a = bcto;
        this.b = bbnr;
        this.c = bbnw;
        this.d = obj;
    }

    /* JADX WARNING: Missing block: B:25:0x0054, code skipped:
            r9.d = r0;
            r4 = addAndGet(-r10);
     */
    /* JADX WARNING: Missing block: B:26:0x005d, code skipped:
            if (r4 == 0) goto L_0x0060;
     */
    public final void b(long r10) {
        /*
        r9 = this;
        r0 = defpackage.bbyq.a(r10);
        if (r0 == 0) goto L_0x0060;
    L_0x0006:
        r0 = defpackage.bbyu.a(r9, r10);
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0060;
    L_0x0010:
        r0 = r9.d;
        r1 = r9.b;
        r4 = r10;
    L_0x0015:
        r10 = r2;
    L_0x0016:
        r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x004c;
    L_0x001a:
        r6 = r9.e;
        r7 = 0;
        if (r6 == 0) goto L_0x0025;
    L_0x001f:
        r9.d = r7;
        r9.b(r0);
        return;
    L_0x0025:
        r6 = 0;
        r9.g = r6;
        r6 = 1;
        r0 = r1.a(r0, r9);	 Catch:{ all -> 0x003d }
        r8 = r9.f;
        if (r8 != 0) goto L_0x0035;
    L_0x0031:
        r6 = 1;
        r10 = r10 + r6;
        goto L_0x0016;
    L_0x0035:
        r9.e = r6;
        r9.d = r7;
        r9.b(r0);
        return;
    L_0x003d:
        r10 = move-exception;
        defpackage.bbnm.a(r10);
        r9.e = r6;
        r9.d = r7;
        r9.a(r10);
        r9.b(r0);
        return;
    L_0x004c:
        r4 = r9.get();
        r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0016;
    L_0x0054:
        r9.d = r0;
        r10 = -r10;
        r4 = r9.addAndGet(r10);
        r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r10 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0015;
    L_0x0060:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbrc.b(long):void");
    }

    private final void b(Object obj) {
        try {
            this.c.accept(obj);
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
    }

    public final void d() {
        if (!this.e) {
            this.e = true;
            if (bbyu.a(this, 1) == 0) {
                Object obj = this.d;
                this.d = null;
                b(obj);
            }
        }
    }

    public final void a(Object obj) {
        if (!this.f) {
            if (this.g) {
                a(new IllegalStateException("onNext already called in this generate turn"));
            } else if (obj == null) {
                a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.g = true;
                this.a.c_(obj);
            }
        }
    }

    private final void a(Throwable th) {
        if (this.f) {
            bbzf.a(th);
            return;
        }
        this.f = true;
        this.a.a(th);
    }
}
