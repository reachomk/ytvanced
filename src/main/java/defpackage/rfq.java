package defpackage;

/* renamed from: rfq */
public class rfq {
    public volatile rgh a;
    public volatile rdg b;

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfq)) {
            return false;
        }
        rfq rfq = (rfq) obj;
        rgh rgh = this.a;
        rgh rgh2 = rfq.a;
        if (rgh == null && rgh2 == null) {
            return c().equals(rfq.c());
        }
        if (rgh != null && rgh2 != null) {
            return rgh.equals(rgh2);
        }
        if (rgh != null) {
            return rgh.equals(rfq.a(rgh.g()));
        }
        return a(rgh2.g()).equals(rgh2);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    private final defpackage.rgh a(defpackage.rgh r2) {
        /*
        r1 = this;
        r0 = r1.a;
        if (r0 != 0) goto L_0x001d;
    L_0x0004:
        monitor-enter(r1);
        r0 = r1.a;	 Catch:{ all -> 0x001a }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x000b:
        r1.a = r2;	 Catch:{ rfk -> 0x0012 }
        r0 = defpackage.rdg.a;	 Catch:{ rfk -> 0x0012 }
        r1.b = r0;	 Catch:{ rfk -> 0x0012 }
        goto L_0x0018;
    L_0x0012:
        r1.a = r2;	 Catch:{ all -> 0x001a }
        r2 = defpackage.rdg.a;	 Catch:{ all -> 0x001a }
        r1.b = r2;	 Catch:{ all -> 0x001a }
    L_0x0018:
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        goto L_0x001d;
    L_0x001a:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001a }
        throw r2;
    L_0x001d:
        r2 = r1.a;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfq.a(rgh):rgh");
    }

    public final int b() {
        if (this.b != null) {
            return this.b.a();
        }
        return this.a != null ? this.a.h() : 0;
    }

    public final rdg c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            rdg rdg;
            if (this.b != null) {
                rdg = this.b;
                return rdg;
            }
            if (this.a == null) {
                this.b = rdg.a;
            } else {
                this.b = this.a.d();
            }
            rdg = this.b;
            return rdg;
        }
    }

    static {
        reg.a();
    }
}
