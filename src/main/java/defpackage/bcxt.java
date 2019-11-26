package defpackage;

/* renamed from: bcxt */
final class bcxt extends bcup {
    public final bcxv a = new bcxv();
    public final bcup b = this;
    public final /* synthetic */ bded c;
    private final /* synthetic */ bdfw d;
    private final /* synthetic */ bcue e;
    private final /* synthetic */ bcxq f;

    bcxt(bcxq bcxq, bcup bcup, bdfw bdfw, bcue bcue, bded bded) {
        this.f = bcxq;
        this.d = bdfw;
        this.e = bcue;
        this.c = bded;
        super(bcup);
    }

    public final void d() {
        a(Long.MAX_VALUE);
    }

    public final void e_(Object obj) {
        int a = this.a.a(obj);
        bdfw bdfw = this.d;
        bcue bcue = this.e;
        bcxs bcxs = new bcxs(this, a);
        bcxq bcxq = this.f;
        bdfw.a(bcue.a(bcxs, bcxq.a, bcxq.b));
    }

    public final void a(Throwable th) {
        this.c.a(th);
        b();
        this.a.a();
    }

    /* JADX WARNING: Missing block: B:10:0x001b, code skipped:
            if (r4 == false) goto L_0x0026;
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r1.e_(r2);
     */
    /* JADX WARNING: Missing block: B:13:0x0021, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x0022, code skipped:
            defpackage.bcva.a(r0, r6, r2);
     */
    /* JADX WARNING: Missing block: B:15:0x0025, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:16:0x0026, code skipped:
            r1.bM_();
     */
    /* JADX WARNING: Missing block: B:17:0x0029, code skipped:
            return;
     */
    public final void bM_() {
        /*
        r6 = this;
        r0 = r6.a;
        r1 = r6.c;
        monitor-enter(r0);
        r2 = r0.e;	 Catch:{ all -> 0x002a }
        r3 = 1;
        if (r2 == 0) goto L_0x000e;
    L_0x000a:
        r0.d = r3;	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        return;
    L_0x000e:
        r2 = r0.b;	 Catch:{ all -> 0x002a }
        r4 = r0.c;	 Catch:{ all -> 0x002a }
        r5 = 0;
        r0.b = r5;	 Catch:{ all -> 0x002a }
        r5 = 0;
        r0.c = r5;	 Catch:{ all -> 0x002a }
        r0.e = r3;	 Catch:{ all -> 0x002a }
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        if (r4 == 0) goto L_0x0026;
    L_0x001d:
        r1.e_(r2);	 Catch:{ all -> 0x0021 }
        goto L_0x0026;
    L_0x0021:
        r0 = move-exception;
        defpackage.bcva.a(r0, r6, r2);
        return;
    L_0x0026:
        r1.bM_();
        return;
    L_0x002a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002a }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcxt.bM_():void");
    }
}
