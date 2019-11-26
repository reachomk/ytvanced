package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: bcog */
final class bcog implements Executor {
    public final Executor a;
    public final Runnable b = new bcof(this);
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;

    bcog(Executor executor) {
        this.a = executor;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    public final void execute(java.lang.Runnable r3) {
        /*
        r2 = this;
        r0 = r2.c;
        monitor-enter(r0);
        r1 = r2.c;	 Catch:{ all -> 0x0017 }
        r1.addLast(r3);	 Catch:{ all -> 0x0017 }
        r3 = r2.a;	 Catch:{ RejectedExecutionException -> 0x0010 }
        r1 = r2.b;	 Catch:{ RejectedExecutionException -> 0x0010 }
        r3.execute(r1);	 Catch:{ RejectedExecutionException -> 0x0010 }
        goto L_0x0015;
    L_0x0010:
        r3 = r2.c;	 Catch:{ all -> 0x0017 }
        r3.removeLast();	 Catch:{ all -> 0x0017 }
    L_0x0015:
        monitor-exit(r0);	 Catch:{ all -> 0x0017 }
        return;
    L_0x0017:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0017 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcog.execute(java.lang.Runnable):void");
    }
}
