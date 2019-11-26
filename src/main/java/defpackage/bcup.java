package defpackage;

/* renamed from: bcup */
public abstract class bcup implements bcud, bcuo {
    private final bdco a;
    private final bcup b;
    private bcuc c;
    private long d;

    protected bcup() {
        this(null, false);
    }

    public void d() {
    }

    protected bcup(bcup bcup) {
        this(bcup, true);
    }

    protected bcup(bcup bcup, boolean z) {
        this.d = Long.MIN_VALUE;
        this.b = bcup;
        bdco bdco = (z && bcup != null) ? bcup.a : new bdco();
        this.a = bdco;
    }

    public final void a(bcuo bcuo) {
        this.a.a(bcuo);
    }

    public final void b() {
        this.a.b();
    }

    public final boolean c() {
        return this.a.b;
    }

    /* JADX WARNING: Missing block: B:18:0x002b, code skipped:
            return;
     */
    public final void a(long r8) {
        /*
        r7 = this;
        r0 = 0;
        r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r2 < 0) goto L_0x002f;
    L_0x0006:
        monitor-enter(r7);
        r2 = r7.c;	 Catch:{ all -> 0x002c }
        if (r2 == 0) goto L_0x0010;
    L_0x000b:
        monitor-exit(r7);	 Catch:{ all -> 0x002c }
        r2.a(r8);
        return;
    L_0x0010:
        r2 = r7.d;	 Catch:{ all -> 0x002c }
        r4 = -9223372036854775808;
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 == 0) goto L_0x0028;
    L_0x0018:
        r2 = r2 + r8;
        r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r8 >= 0) goto L_0x0025;
    L_0x001d:
        r8 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r7.d = r8;	 Catch:{ all -> 0x002c }
        goto L_0x002a;
    L_0x0025:
        r7.d = r2;	 Catch:{ all -> 0x002c }
        goto L_0x002a;
    L_0x0028:
        r7.d = r8;	 Catch:{ all -> 0x002c }
    L_0x002a:
        monitor-exit(r7);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r8 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x002c }
        throw r8;
    L_0x002f:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "number requested cannot be negative: ";
        r1.append(r2);
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcup.a(long):void");
    }

    public void a(bcuc bcuc) {
        long j;
        Object obj;
        synchronized (this) {
            j = this.d;
            this.c = bcuc;
            obj = null;
            if (this.b != null) {
                if (j == Long.MIN_VALUE) {
                    obj = 1;
                }
            }
        }
        if (obj != null) {
            this.b.a(this.c);
        } else if (j == Long.MIN_VALUE) {
            this.c.a(Long.MAX_VALUE);
        } else {
            this.c.a(j);
        }
    }
}
