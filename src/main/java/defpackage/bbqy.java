package defpackage;

import java.util.Iterator;

/* renamed from: bbqy */
final class bbqy extends bbqw {
    public static final long serialVersionUID = -6022804456014692607L;
    private final bcto c;

    bbqy(bcto bcto, Iterator it) {
        super(it);
        this.c = bcto;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        Iterator it = this.a;
        bcto bcto = this.c;
        while (!this.b) {
            try {
                Object next = it.next();
                if (!this.b) {
                    if (next == null) {
                        bcto.a(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bcto.c_(next);
                    if (!this.b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.b) {
                                    bcto.a();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            bbnm.a(th);
                            bcto.a(th);
                        }
                    }
                }
                return;
            } catch (Throwable th2) {
                bbnm.a(th2);
                bcto.a(th2);
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:31:0x0056, code skipped:
            r4 = addAndGet(-r9);
     */
    /* JADX WARNING: Missing block: B:32:0x005d, code skipped:
            if (r4 == 0) goto L_0x0060;
     */
    /* JADX WARNING: Missing block: B:34:0x0060, code skipped:
            return;
     */
    public final void a(long r9) {
        /*
        r8 = this;
        r0 = r8.a;
        r1 = r8.c;
        r2 = 0;
        r4 = r9;
    L_0x0007:
        r9 = r2;
    L_0x0008:
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x004e;
    L_0x000c:
        r6 = r8.b;
        if (r6 != 0) goto L_0x004d;
    L_0x0010:
        r6 = r0.next();	 Catch:{ all -> 0x0046 }
        r7 = r8.b;
        if (r7 != 0) goto L_0x0045;
    L_0x0018:
        if (r6 != 0) goto L_0x0025;
    L_0x001a:
        r9 = new java.lang.NullPointerException;
        r10 = "Iterator.next() returned a null value";
        r9.<init>(r10);
        r1.a(r9);
        return;
    L_0x0025:
        r1.c_(r6);
        r6 = r8.b;
        if (r6 != 0) goto L_0x0045;
    L_0x002c:
        r6 = r0.hasNext();	 Catch:{ all -> 0x003e }
        if (r6 == 0) goto L_0x0036;
    L_0x0032:
        r6 = 1;
        r9 = r9 + r6;
        goto L_0x0008;
    L_0x0036:
        r9 = r8.b;
        if (r9 != 0) goto L_0x003d;
    L_0x003a:
        r1.a();
    L_0x003d:
        return;
    L_0x003e:
        r9 = move-exception;
        defpackage.bbnm.a(r9);
        r1.a(r9);
    L_0x0045:
        return;
    L_0x0046:
        r9 = move-exception;
        defpackage.bbnm.a(r9);
        r1.a(r9);
    L_0x004d:
        return;
    L_0x004e:
        r4 = r8.get();
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0008;
    L_0x0056:
        r9 = -r9;
        r4 = r8.addAndGet(r9);
        r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r9 == 0) goto L_0x0060;
    L_0x005f:
        goto L_0x0007;
    L_0x0060:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbqy.a(long):void");
    }
}
