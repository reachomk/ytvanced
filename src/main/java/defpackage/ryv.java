package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ryv */
final class ryv implements rzd {
    public final Object a = new Object();
    public final ryf b;
    private final Executor c;

    public ryv(Executor executor, ryf ryf) {
        this.c = executor;
        this.b = ryf;
    }

    /* JADX WARNING: Missing block: B:10:0x0010, code skipped:
            r1.c.execute(new defpackage.ryu(r1));
     */
    public final void a(defpackage.ryi r2) {
        /*
        r1 = this;
        r2 = (defpackage.rze) r2;
        r2 = r2.d;
        if (r2 == 0) goto L_0x001e;
    L_0x0006:
        r2 = r1.a;
        monitor-enter(r2);
        r0 = r1.b;	 Catch:{ all -> 0x001b }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        return;
    L_0x000f:
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        r2 = r1.c;
        r0 = new ryu;
        r0.<init>(r1);
        r2.execute(r0);
        goto L_0x001e;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x001b }
        throw r0;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryv.a(ryi):void");
    }
}
