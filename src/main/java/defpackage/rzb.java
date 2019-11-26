package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rzb */
final class rzb implements rzd {
    public final Object a = new Object();
    public final ryg b;
    private final Executor c;

    public rzb(Executor executor, ryg ryg) {
        this.c = executor;
        this.b = ryg;
    }

    /* JADX WARNING: Missing block: B:10:0x0010, code skipped:
            r2.c.execute(new defpackage.rza(r2, r3));
     */
    public final void a(defpackage.ryi r3) {
        /*
        r2 = this;
        r0 = r3.b();
        if (r0 == 0) goto L_0x001e;
    L_0x0006:
        r0 = r2.a;
        monitor-enter(r0);
        r1 = r2.b;	 Catch:{ all -> 0x001b }
        if (r1 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        return;
    L_0x000f:
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        r0 = r2.c;
        r1 = new rza;
        r1.<init>(r2, r3);
        r0.execute(r1);
        goto L_0x001e;
    L_0x001b:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001b }
        throw r3;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzb.a(ryi):void");
    }
}
