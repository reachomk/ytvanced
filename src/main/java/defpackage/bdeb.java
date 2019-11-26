package defpackage;

/* renamed from: bdeb */
public final class bdeb implements bcud {
    private final bcud a;
    private boolean b;
    private volatile boolean c;
    private bdea d;

    public bdeb(bcud bcud) {
        this.a = bcud;
    }

    /* JADX WARNING: Missing block: B:19:?, code skipped:
            r6.a.e_(r7);
     */
    /* JADX WARNING: Missing block: B:20:0x002c, code skipped:
            monitor-enter(r6);
     */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            r1 = r6.d;
            r2 = 0;
     */
    /* JADX WARNING: Missing block: B:23:0x0030, code skipped:
            if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:24:0x0032, code skipped:
            r6.b = false;
     */
    /* JADX WARNING: Missing block: B:25:0x0034, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:26:0x0035, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:27:0x0036, code skipped:
            r6.d = null;
     */
    /* JADX WARNING: Missing block: B:28:0x0039, code skipped:
            monitor-exit(r6);
     */
    /* JADX WARNING: Missing block: B:29:0x003a, code skipped:
            r1 = r1.a;
            r3 = r1.length;
     */
    /* JADX WARNING: Missing block: B:30:0x003d, code skipped:
            if (r2 >= r3) goto L_0x002c;
     */
    /* JADX WARNING: Missing block: B:31:0x003f, code skipped:
            r4 = r1[r2];
     */
    /* JADX WARNING: Missing block: B:32:0x0041, code skipped:
            if (r4 == null) goto L_0x002c;
     */
    /* JADX WARNING: Missing block: B:35:0x0049, code skipped:
            if (defpackage.bcwf.a(r6.a, r4) != false) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:36:0x004b, code skipped:
            r2 = r2 + 1;
     */
    /* JADX WARNING: Missing block: B:37:0x004e, code skipped:
            r6.c = true;
     */
    /* JADX WARNING: Missing block: B:38:0x0050, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:39:0x0051, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:40:0x0052, code skipped:
            r6.c = true;
            defpackage.bcva.b(r1);
            r6.a.a(defpackage.bcvh.a(r1, r7));
     */
    /* JADX WARNING: Missing block: B:41:0x0060, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:46:0x0064, code skipped:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:47:0x0065, code skipped:
            r6.c = true;
            defpackage.bcva.a(r1, r6.a, r7);
     */
    /* JADX WARNING: Missing block: B:48:0x006c, code skipped:
            return;
     */
    public final void e_(java.lang.Object r7) {
        /*
        r6 = this;
        r0 = r6.c;
        if (r0 != 0) goto L_0x0070;
    L_0x0004:
        monitor-enter(r6);
        r0 = r6.c;	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        return;
    L_0x000b:
        r0 = r6.b;	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x0023;
    L_0x000f:
        r0 = r6.d;	 Catch:{ all -> 0x006d }
        if (r0 != 0) goto L_0x001a;
    L_0x0013:
        r0 = new bdea;	 Catch:{ all -> 0x006d }
        r0.<init>();	 Catch:{ all -> 0x006d }
        r6.d = r0;	 Catch:{ all -> 0x006d }
    L_0x001a:
        r7 = defpackage.bcwf.a(r7);	 Catch:{ all -> 0x006d }
        r0.a(r7);	 Catch:{ all -> 0x006d }
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        return;
    L_0x0023:
        r0 = 1;
        r6.b = r0;	 Catch:{ all -> 0x006d }
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        r1 = r6.a;	 Catch:{ all -> 0x0064 }
        r1.e_(r7);	 Catch:{ all -> 0x0064 }
    L_0x002c:
        monitor-enter(r6);
        r1 = r6.d;	 Catch:{ all -> 0x0061 }
        r2 = 0;
        if (r1 != 0) goto L_0x0036;
    L_0x0032:
        r6.b = r2;	 Catch:{ all -> 0x0061 }
        monitor-exit(r6);	 Catch:{ all -> 0x0061 }
        return;
    L_0x0036:
        r3 = 0;
        r6.d = r3;	 Catch:{ all -> 0x0061 }
        monitor-exit(r6);	 Catch:{ all -> 0x0061 }
        r1 = r1.a;
        r3 = r1.length;
    L_0x003d:
        if (r2 >= r3) goto L_0x002c;
    L_0x003f:
        r4 = r1[r2];
        if (r4 == 0) goto L_0x002c;
    L_0x0043:
        r5 = r6.a;	 Catch:{ all -> 0x0051 }
        r4 = defpackage.bcwf.a(r5, r4);	 Catch:{ all -> 0x0051 }
        if (r4 != 0) goto L_0x004e;
    L_0x004b:
        r2 = r2 + 1;
        goto L_0x003d;
    L_0x004e:
        r6.c = r0;	 Catch:{ all -> 0x0051 }
        return;
    L_0x0051:
        r1 = move-exception;
        r6.c = r0;
        defpackage.bcva.b(r1);
        r0 = r6.a;
        r7 = defpackage.bcvh.a(r1, r7);
        r0.a(r7);
        return;
    L_0x0061:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0061 }
        throw r7;
    L_0x0064:
        r1 = move-exception;
        r6.c = r0;
        r0 = r6.a;
        defpackage.bcva.a(r1, r0, r7);
        return;
    L_0x006d:
        r7 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        throw r7;
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdeb.e_(java.lang.Object):void");
    }

    public final void a(Throwable th) {
        bcva.b(th);
        if (!this.c) {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                this.c = true;
                if (this.b) {
                    bdea bdea = this.d;
                    if (bdea == null) {
                        bdea = new bdea();
                        this.d = bdea;
                    }
                    bdea.a(bcwf.a(th));
                    return;
                }
                this.b = true;
                this.a.a(th);
            }
        }
    }

    public final void bM_() {
        if (!this.c) {
            synchronized (this) {
                if (this.c) {
                    return;
                }
                this.c = true;
                if (this.b) {
                    bdea bdea = this.d;
                    if (bdea == null) {
                        bdea = new bdea();
                        this.d = bdea;
                    }
                    bdea.a(bcwf.a);
                    return;
                }
                this.b = true;
                this.a.bM_();
            }
        }
    }
}
