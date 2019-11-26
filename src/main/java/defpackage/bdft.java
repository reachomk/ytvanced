package defpackage;

import java.util.List;

/* renamed from: bdft */
public final class bdft implements bcud {
    public boolean a = true;
    public boolean b;
    public List c;
    private final bcup d;
    private boolean e;

    public bdft(bcup bcup) {
        this.d = bcup;
    }

    public final void e_(Object obj) {
        this.d.e_(obj);
    }

    public final void a(Throwable th) {
        this.d.a(th);
    }

    public final void bM_() {
        this.d.bM_();
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:14:0x001f, code skipped:
            r1.e = true;
     */
    public final void b(java.lang.Object r2) {
        /*
        r1 = this;
        r0 = r1.e;
        if (r0 != 0) goto L_0x0026;
    L_0x0004:
        monitor-enter(r1);
        r0 = 0;
        r1.a = r0;	 Catch:{ all -> 0x0023 }
        r0 = r1.b;	 Catch:{ all -> 0x0023 }
        if (r0 == 0) goto L_0x001e;
    L_0x000c:
        r0 = r1.c;	 Catch:{ all -> 0x0023 }
        if (r0 != 0) goto L_0x0017;
    L_0x0010:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0023 }
        r0.<init>();	 Catch:{ all -> 0x0023 }
        r1.c = r0;	 Catch:{ all -> 0x0023 }
    L_0x0017:
        r0 = r1.c;	 Catch:{ all -> 0x0023 }
        r0.add(r2);	 Catch:{ all -> 0x0023 }
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        return;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        r0 = 1;
        r1.e = r0;
        goto L_0x0026;
    L_0x0023:
        r2 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0023 }
        throw r2;
    L_0x0026:
        r0 = r1.d;
        defpackage.bcwf.a(r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdft.b(java.lang.Object):void");
    }

    /* Access modifiers changed, original: final */
    public final void c(Object obj) {
        if (obj != null) {
            bcwf.a(this.d, obj);
        }
    }
}
