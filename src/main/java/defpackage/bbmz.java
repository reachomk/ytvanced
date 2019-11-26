package defpackage;

import java.util.ArrayList;

/* renamed from: bbmz */
public final class bbmz implements bbnc, bboa {
    public volatile boolean a;
    private bbyz b;

    public final void bK_() {
        if (!this.a) {
            synchronized (this) {
                if (this.a) {
                    return;
                }
                this.a = true;
                bbyz bbyz = this.b;
                this.b = null;
                bbmz.a(bbyz);
            }
        }
    }

    public final boolean c() {
        return this.a;
    }

    /* JADX WARNING: Missing block: B:33:0x0086, code skipped:
            return true;
     */
    public final boolean a(defpackage.bbnc r10) {
        /*
        r9 = this;
        r0 = "d is null";
        defpackage.bbow.a(r10, r0);
        r0 = r9.a;
        if (r0 != 0) goto L_0x008c;
    L_0x0009:
        monitor-enter(r9);
        r0 = r9.a;	 Catch:{ all -> 0x0089 }
        if (r0 != 0) goto L_0x0087;
    L_0x000e:
        r0 = r9.b;	 Catch:{ all -> 0x0089 }
        if (r0 != 0) goto L_0x0019;
    L_0x0012:
        r0 = new bbyz;	 Catch:{ all -> 0x0089 }
        r0.<init>();	 Catch:{ all -> 0x0089 }
        r9.b = r0;	 Catch:{ all -> 0x0089 }
    L_0x0019:
        r1 = r0.e;	 Catch:{ all -> 0x0089 }
        r2 = r0.b;	 Catch:{ all -> 0x0089 }
        r3 = r10.hashCode();	 Catch:{ all -> 0x0089 }
        r3 = defpackage.bbyz.a(r3);	 Catch:{ all -> 0x0089 }
        r3 = r3 & r2;
        r4 = r1[r3];	 Catch:{ all -> 0x0089 }
        r5 = 1;
        if (r4 == 0) goto L_0x003f;
    L_0x002b:
        r4 = r4.equals(r10);	 Catch:{ all -> 0x0089 }
        if (r4 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0085;
    L_0x0032:
        r3 = r3 + r5;
        r3 = r3 & r2;
        r4 = r1[r3];	 Catch:{ all -> 0x0089 }
        if (r4 == 0) goto L_0x003f;
    L_0x0038:
        r4 = r4.equals(r10);	 Catch:{ all -> 0x0089 }
        if (r4 != 0) goto L_0x0085;
    L_0x003e:
        goto L_0x0032;
    L_0x003f:
        r1[r3] = r10;	 Catch:{ all -> 0x0089 }
        r10 = r0.c;	 Catch:{ all -> 0x0089 }
        r10 = r10 + r5;
        r0.c = r10;	 Catch:{ all -> 0x0089 }
        r1 = r0.d;	 Catch:{ all -> 0x0089 }
        if (r10 < r1) goto L_0x0085;
    L_0x004a:
        r1 = r0.e;	 Catch:{ all -> 0x0089 }
        r2 = r1.length;	 Catch:{ all -> 0x0089 }
        r3 = r2 + r2;
        r4 = r3 + -1;
        r6 = new java.lang.Object[r3];	 Catch:{ all -> 0x0089 }
        r6 = (java.lang.Object[]) r6;	 Catch:{ all -> 0x0089 }
    L_0x0055:
        r7 = r10 + -1;
        if (r10 != 0) goto L_0x0066;
    L_0x0059:
        r0.b = r4;	 Catch:{ all -> 0x0089 }
        r10 = (float) r3;	 Catch:{ all -> 0x0089 }
        r1 = r0.a;	 Catch:{ all -> 0x0089 }
        r10 = r10 * r1;
        r10 = (int) r10;	 Catch:{ all -> 0x0089 }
        r0.d = r10;	 Catch:{ all -> 0x0089 }
        r0.e = r6;	 Catch:{ all -> 0x0089 }
        goto L_0x0085;
    L_0x0066:
        r2 = r2 + -1;
        r10 = r1[r2];	 Catch:{ all -> 0x0089 }
        if (r10 == 0) goto L_0x0066;
    L_0x006c:
        r10 = r10.hashCode();	 Catch:{ all -> 0x0089 }
        r10 = defpackage.bbyz.a(r10);	 Catch:{ all -> 0x0089 }
        r10 = r10 & r4;
        r8 = r6[r10];	 Catch:{ all -> 0x0089 }
        if (r8 == 0) goto L_0x007f;
    L_0x0079:
        r10 = r10 + r5;
        r10 = r10 & r4;
        r8 = r6[r10];	 Catch:{ all -> 0x0089 }
        if (r8 != 0) goto L_0x0079;
    L_0x007f:
        r8 = r1[r2];	 Catch:{ all -> 0x0089 }
        r6[r10] = r8;	 Catch:{ all -> 0x0089 }
        r10 = r7;
        goto L_0x0055;
    L_0x0085:
        monitor-exit(r9);	 Catch:{ all -> 0x0089 }
        return r5;
    L_0x0087:
        monitor-exit(r9);	 Catch:{ all -> 0x0089 }
        goto L_0x008c;
    L_0x0089:
        r10 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0089 }
        throw r10;
    L_0x008c:
        r10.bK_();
        r10 = 0;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbmz.a(bbnc):boolean");
    }

    public final boolean b(bbnc bbnc) {
        if (!c(bbnc)) {
            return false;
        }
        bbnc.bK_();
        return true;
    }

    /* JADX WARNING: Missing block: B:22:0x0042, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:24:0x0044, code skipped:
            return false;
     */
    public final boolean c(defpackage.bbnc r8) {
        /*
        r7 = this;
        r0 = "Disposable item is null";
        defpackage.bbow.a(r8, r0);
        r0 = r7.a;
        r1 = 0;
        if (r0 != 0) goto L_0x0048;
    L_0x000a:
        monitor-enter(r7);
        r0 = r7.a;	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r7);	 Catch:{ all -> 0x0045 }
        return r1;
    L_0x0011:
        r0 = r7.b;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0043;
    L_0x0016:
        r2 = r0.e;	 Catch:{ all -> 0x0045 }
        r3 = r0.b;	 Catch:{ all -> 0x0045 }
        r4 = r8.hashCode();	 Catch:{ all -> 0x0045 }
        r4 = defpackage.bbyz.a(r4);	 Catch:{ all -> 0x0045 }
        r4 = r4 & r3;
        r5 = r2[r4];	 Catch:{ all -> 0x0045 }
        if (r5 == 0) goto L_0x0043;
    L_0x0027:
        r5 = r5.equals(r8);	 Catch:{ all -> 0x0045 }
        r6 = 1;
        if (r5 == 0) goto L_0x0032;
    L_0x002e:
        r0.a(r4, r2, r3);	 Catch:{ all -> 0x0045 }
        goto L_0x0041;
    L_0x0032:
        r4 = r4 + r6;
        r4 = r4 & r3;
        r5 = r2[r4];	 Catch:{ all -> 0x0045 }
        if (r5 == 0) goto L_0x0043;
    L_0x0038:
        r5 = r5.equals(r8);	 Catch:{ all -> 0x0045 }
        if (r5 == 0) goto L_0x0032;
    L_0x003e:
        r0.a(r4, r2, r3);	 Catch:{ all -> 0x0045 }
    L_0x0041:
        monitor-exit(r7);	 Catch:{ all -> 0x0045 }
        return r6;
    L_0x0043:
        monitor-exit(r7);	 Catch:{ all -> 0x0045 }
        return r1;
    L_0x0045:
        r8 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x0045 }
        throw r8;
    L_0x0048:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbmz.c(bbnc):boolean");
    }

    public final void a() {
        if (!this.a) {
            synchronized (this) {
                if (this.a) {
                    return;
                }
                bbyz bbyz = this.b;
                this.b = null;
                bbmz.a(bbyz);
            }
        }
    }

    private static void a(bbyz bbyz) {
        if (bbyz != null) {
            Iterable iterable = null;
            for (Object obj : bbyz.e) {
                if (obj instanceof bbnc) {
                    try {
                        ((bbnc) obj).bK_();
                    } catch (Throwable th) {
                        bbnm.a(th);
                        if (iterable == null) {
                            iterable = new ArrayList();
                        }
                        iterable.add(th);
                    }
                }
            }
            if (iterable == null) {
                return;
            }
            if (iterable.size() == 1) {
                throw bbyw.a((Throwable) iterable.get(0));
            }
            throw new bbnf(iterable);
        }
    }
}
