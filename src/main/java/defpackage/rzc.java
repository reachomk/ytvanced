package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: rzc */
final class rzc {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    rzc() {
    }

    public final void a(rzd rzd) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(rzd);
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0010, code skipped:
            r1 = r2.a;
     */
    /* JADX WARNING: Missing block: B:11:0x0012, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:13:?, code skipped:
            r0 = (defpackage.rzd) r2.b.poll();
     */
    /* JADX WARNING: Missing block: B:14:0x001b, code skipped:
            if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:15:0x001d, code skipped:
            r2.c = false;
     */
    /* JADX WARNING: Missing block: B:16:0x0020, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:17:0x0021, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:18:0x0022, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:19:0x0023, code skipped:
            r0.a(r3);
     */
    public final void a(defpackage.ryi r3) {
        /*
        r2 = this;
        r0 = r2.a;
        monitor-enter(r0);
        r1 = r2.b;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x002a;
    L_0x0007:
        r1 = r2.c;	 Catch:{ all -> 0x002c }
        if (r1 == 0) goto L_0x000c;
    L_0x000b:
        goto L_0x002a;
    L_0x000c:
        r1 = 1;
        r2.c = r1;	 Catch:{ all -> 0x002c }
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
    L_0x0010:
        r1 = r2.a;
        monitor-enter(r1);
        r0 = r2.b;	 Catch:{ all -> 0x0027 }
        r0 = r0.poll();	 Catch:{ all -> 0x0027 }
        r0 = (defpackage.rzd) r0;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r3 = 0;
        r2.c = r3;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        return;
    L_0x0022:
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        r0.a(r3);
        goto L_0x0010;
    L_0x0027:
        r3 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0027 }
        throw r3;
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        return;
    L_0x002c:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x002c }
        goto L_0x0030;
    L_0x002f:
        throw r3;
    L_0x0030:
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzc.a(ryi):void");
    }
}
