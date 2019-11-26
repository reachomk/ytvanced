package defpackage;

import java.util.Iterator;

/* renamed from: bbqv */
final class bbqv extends bbqw {
    public static final long serialVersionUID = -6022804456014692607L;
    private final bboy c;

    bbqv(bboy bboy, Iterator it) {
        super(it);
        this.c = bboy;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        Iterator it = this.a;
        bboy bboy = this.c;
        while (!this.b) {
            try {
                Object next = it.next();
                if (!this.b) {
                    if (next == null) {
                        bboy.a((Throwable) new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    bboy.b(next);
                    if (!this.b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.b) {
                                    bboy.a();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            bbnm.a(th);
                            bboy.a(th);
                        }
                    }
                }
                return;
            } catch (Throwable th2) {
                bbnm.a(th2);
                bboy.a(th2);
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:32:0x0059, code skipped:
            r4 = addAndGet(-r9);
     */
    /* JADX WARNING: Missing block: B:33:0x0060, code skipped:
            if (r4 == 0) goto L_0x0063;
     */
    /* JADX WARNING: Missing block: B:35:0x0063, code skipped:
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
        if (r6 == 0) goto L_0x0051;
    L_0x000c:
        r6 = r8.b;
        if (r6 != 0) goto L_0x0050;
    L_0x0010:
        r6 = r0.next();	 Catch:{ all -> 0x0049 }
        r7 = r8.b;
        if (r7 != 0) goto L_0x0048;
    L_0x0018:
        if (r6 != 0) goto L_0x0025;
    L_0x001a:
        r9 = new java.lang.NullPointerException;
        r10 = "Iterator.next() returned a null value";
        r9.<init>(r10);
        r1.a(r9);
        return;
    L_0x0025:
        r6 = r1.b(r6);
        r7 = r8.b;
        if (r7 != 0) goto L_0x0048;
    L_0x002d:
        r7 = r0.hasNext();	 Catch:{ all -> 0x0041 }
        if (r7 != 0) goto L_0x003b;
    L_0x0033:
        r9 = r8.b;
        if (r9 != 0) goto L_0x003a;
    L_0x0037:
        r1.a();
    L_0x003a:
        return;
    L_0x003b:
        if (r6 == 0) goto L_0x0008;
    L_0x003d:
        r6 = 1;
        r9 = r9 + r6;
        goto L_0x0008;
    L_0x0041:
        r9 = move-exception;
        defpackage.bbnm.a(r9);
        r1.a(r9);
    L_0x0048:
        return;
    L_0x0049:
        r9 = move-exception;
        defpackage.bbnm.a(r9);
        r1.a(r9);
    L_0x0050:
        return;
    L_0x0051:
        r4 = r8.get();
        r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0008;
    L_0x0059:
        r9 = -r9;
        r4 = r8.addAndGet(r9);
        r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r9 == 0) goto L_0x0063;
    L_0x0062:
        goto L_0x0007;
    L_0x0063:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbqv.a(long):void");
    }
}
