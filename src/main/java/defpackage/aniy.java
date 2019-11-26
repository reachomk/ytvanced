package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aniy */
public final class aniy {
    private static final Logger a = Logger.getLogger(aniy.class.getName());
    private anix b;
    private boolean c;

    public final void a(Runnable runnable, Executor executor) {
        amqw.a((Object) runnable, (Object) "Runnable was null.");
        amqw.a((Object) executor, (Object) "Executor was null.");
        synchronized (this) {
            if (this.c) {
                aniy.b(runnable, executor);
                return;
            }
            this.b = new anix(runnable, executor, this.b);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0010, code skipped:
            r1 = r0;
            r0 = null;
     */
    /* JADX WARNING: Missing block: B:9:0x0013, code skipped:
            if (r1 == null) goto L_0x001c;
     */
    /* JADX WARNING: Missing block: B:10:0x0015, code skipped:
            r2 = r1.c;
            r1.c = r0;
            r0 = r1;
            r1 = r2;
     */
    /* JADX WARNING: Missing block: B:11:0x001c, code skipped:
            if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Missing block: B:12:0x001e, code skipped:
            defpackage.aniy.b(r0.a, r0.b);
            r0 = r0.c;
     */
    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            return;
     */
    public final void a() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.c;	 Catch:{ all -> 0x0029 }
        if (r0 == 0) goto L_0x0007;
    L_0x0005:
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        return;
    L_0x0007:
        r0 = 1;
        r4.c = r0;	 Catch:{ all -> 0x0029 }
        r0 = r4.b;	 Catch:{ all -> 0x0029 }
        r1 = 0;
        r4.b = r1;	 Catch:{ all -> 0x0029 }
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        r3 = r1;
        r1 = r0;
        r0 = r3;
    L_0x0013:
        if (r1 == 0) goto L_0x001c;
    L_0x0015:
        r2 = r1.c;
        r1.c = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0013;
    L_0x001c:
        if (r0 == 0) goto L_0x0028;
    L_0x001e:
        r1 = r0.a;
        r2 = r0.b;
        defpackage.aniy.b(r1, r2);
        r0 = r0.c;
        goto L_0x001c;
    L_0x0028:
        return;
    L_0x0029:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0029 }
        goto L_0x002d;
    L_0x002c:
        throw r0;
    L_0x002d:
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aniy.a():void");
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 57) + valueOf2.length());
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with executor ");
            stringBuilder.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ExecutionList", "executeListener", stringBuilder.toString(), e);
        }
    }
}
