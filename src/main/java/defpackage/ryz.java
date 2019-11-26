package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ryz */
final class ryz implements rzd {
    public final Object a = new Object();
    public final ryh b;
    private final Executor c;

    public ryz(Executor executor, ryh ryh) {
        this.c = executor;
        this.b = ryh;
    }

    /* JADX WARNING: Missing block: B:12:0x0017, code skipped:
            r2.c.execute(new defpackage.ryy(r2, r3));
     */
    public final void a(defpackage.ryi r3) {
        /*
        r2 = this;
        r0 = r3.b();
        if (r0 != 0) goto L_0x0025;
    L_0x0006:
        r0 = r3;
        r0 = (defpackage.rze) r0;
        r0 = r0.d;
        if (r0 != 0) goto L_0x0025;
    L_0x000d:
        r0 = r2.a;
        monitor-enter(r0);
        r1 = r2.b;	 Catch:{ all -> 0x0022 }
        if (r1 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        return;
    L_0x0016:
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        r0 = r2.c;
        r1 = new ryy;
        r1.<init>(r2, r3);
        r0.execute(r1);
        goto L_0x0025;
    L_0x0022:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0022 }
        throw r3;
    L_0x0025:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryz.a(ryi):void");
    }
}
