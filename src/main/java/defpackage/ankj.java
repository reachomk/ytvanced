package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: ankj */
final class ankj implements Executor {
    public static final Logger a = Logger.getLogger(ankj.class.getName());
    public final Deque b = new ArrayDeque();
    public long c = 0;
    public int d = 1;
    private final Executor e;
    private final ankl f = new ankl(this);

    ankj(Executor executor) {
        this.e = (Executor) amqw.a((Object) executor);
    }

    /* JADX WARNING: Missing block: B:11:?, code skipped:
            r7.e.execute(r7.f);
     */
    /* JADX WARNING: Missing block: B:13:0x0028, code skipped:
            if (r7.d != 2) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:14:0x002a, code skipped:
            r0 = r7.b;
     */
    /* JADX WARNING: Missing block: B:15:0x002c, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:18:0x0031, code skipped:
            if (r7.c != r3) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:20:0x0035, code skipped:
            if (r7.d != 2) goto L_0x0039;
     */
    /* JADX WARNING: Missing block: B:21:0x0037, code skipped:
            r7.d = 3;
     */
    /* JADX WARNING: Missing block: B:22:0x0039, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:23:0x003a, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:27:0x003e, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:28:0x003f, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:30:0x0044, code skipped:
            monitor-enter(r7.b);
     */
    /* JADX WARNING: Missing block: B:32:?, code skipped:
            r3 = r7.d;
            r4 = null;
     */
    /* JADX WARNING: Missing block: B:33:0x0049, code skipped:
            if (r3 == 1) goto L_0x004b;
     */
    /* JADX WARNING: Missing block: B:35:0x004c, code skipped:
            if (r3 != 2) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:38:0x0055, code skipped:
            if (r7.b.removeLastOccurrence(r1) == false) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:40:0x0058, code skipped:
            r4 = 1;
     */
    /* JADX WARNING: Missing block: B:42:0x005b, code skipped:
            if ((r0 instanceof java.util.concurrent.RejectedExecutionException) != false) goto L_0x005d;
     */
    /* JADX WARNING: Missing block: B:45:0x0060, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:46:0x0061, code skipped:
            throw r0;
     */
    public final void execute(java.lang.Runnable r8) {
        /*
        r7 = this;
        defpackage.amqw.a(r8);
        r0 = r7.b;
        monitor-enter(r0);
        r1 = r7.d;	 Catch:{ all -> 0x006c }
        r2 = 4;
        if (r1 != r2) goto L_0x000c;
    L_0x000b:
        goto L_0x0065;
    L_0x000c:
        r2 = 3;
        if (r1 == r2) goto L_0x0065;
    L_0x000f:
        r3 = r7.c;	 Catch:{ all -> 0x006c }
        r1 = new ankm;	 Catch:{ all -> 0x006c }
        r1.<init>(r8);	 Catch:{ all -> 0x006c }
        r8 = r7.b;	 Catch:{ all -> 0x006c }
        r8.add(r1);	 Catch:{ all -> 0x006c }
        r8 = 2;
        r7.d = r8;	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        r0 = r7.e;	 Catch:{ RuntimeException -> 0x0041, Error | RuntimeException -> 0x003f }
        r5 = r7.f;	 Catch:{ RuntimeException -> 0x0041, Error | RuntimeException -> 0x003f }
        r0.execute(r5);	 Catch:{ RuntimeException -> 0x0041, Error | RuntimeException -> 0x003f }
        r0 = r7.d;
        if (r0 != r8) goto L_0x003e;
    L_0x002a:
        r0 = r7.b;
        monitor-enter(r0);
        r5 = r7.c;	 Catch:{ all -> 0x003b }
        r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r1 != 0) goto L_0x0039;
    L_0x0033:
        r1 = r7.d;	 Catch:{ all -> 0x003b }
        if (r1 != r8) goto L_0x0039;
    L_0x0037:
        r7.d = r2;	 Catch:{ all -> 0x003b }
    L_0x0039:
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x003b:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        throw r8;
    L_0x003e:
        return;
    L_0x003f:
        r0 = move-exception;
        goto L_0x0042;
    L_0x0041:
        r0 = move-exception;
    L_0x0042:
        r2 = r7.b;
        monitor-enter(r2);
        r3 = r7.d;	 Catch:{ all -> 0x0062 }
        r4 = 0;
        r5 = 1;
        if (r3 != r5) goto L_0x004c;
    L_0x004b:
        goto L_0x004f;
    L_0x004c:
        if (r3 == r8) goto L_0x004f;
    L_0x004e:
        goto L_0x0059;
    L_0x004f:
        r8 = r7.b;	 Catch:{ all -> 0x0062 }
        r8 = r8.removeLastOccurrence(r1);	 Catch:{ all -> 0x0062 }
        if (r8 != 0) goto L_0x0058;
    L_0x0057:
        goto L_0x0059;
    L_0x0058:
        r4 = 1;
    L_0x0059:
        r8 = r0 instanceof java.util.concurrent.RejectedExecutionException;	 Catch:{ all -> 0x0062 }
        if (r8 == 0) goto L_0x0061;
    L_0x005d:
        if (r4 != 0) goto L_0x0061;
    L_0x005f:
        monitor-exit(r2);	 Catch:{ all -> 0x0062 }
        return;
    L_0x0061:
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0062:
        r8 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0062 }
        throw r8;
    L_0x0065:
        r1 = r7.b;	 Catch:{ all -> 0x006c }
        r1.add(r8);	 Catch:{ all -> 0x006c }
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        return;
    L_0x006c:
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x006c }
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ankj.execute(java.lang.Runnable):void");
    }
}
