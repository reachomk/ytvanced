package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: xaa */
public final class xaa implements IdleHandler {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final ScheduledExecutorService b;
    public final Queue c;
    public final boolean d;
    public final int e;
    public final AtomicBoolean f;
    private final boolean g;

    public xaa(ScheduledExecutorService scheduledExecutorService, aotn aotn) {
        this.b = scheduledExecutorService;
        this.c = new LinkedList();
        boolean z = false;
        if (aotn == null) {
            this.e = 0;
            this.d = false;
            this.g = false;
        } else {
            int i = aotn.c;
            this.e = i;
            if (aotn.b && i > 0) {
                z = true;
            }
            this.d = z;
            this.g = aotn.h;
        }
        this.f = new AtomicBoolean(true);
    }

    /* JADX WARNING: Missing block: B:15:0x0036, code skipped:
            return;
     */
    public final void a(java.lang.Runnable r4, boolean r5) {
        /*
        r3 = this;
        r0 = r3.d;
        if (r0 == 0) goto L_0x003c;
    L_0x0004:
        r0 = r3.f;
        r0 = r0.get();
        if (r0 == 0) goto L_0x003c;
    L_0x000c:
        r0 = r3.f;
        monitor-enter(r0);
        r1 = r3.f;	 Catch:{ all -> 0x0039 }
        r1 = r1.get();	 Catch:{ all -> 0x0039 }
        if (r1 == 0) goto L_0x0037;
    L_0x0017:
        r1 = r3.c;	 Catch:{ all -> 0x0039 }
        r2 = new xac;	 Catch:{ all -> 0x0039 }
        r2.<init>(r4, r5);	 Catch:{ all -> 0x0039 }
        r1.add(r2);	 Catch:{ all -> 0x0039 }
        r4 = r3.g;	 Catch:{ all -> 0x0039 }
        if (r4 == 0) goto L_0x0035;
    L_0x0025:
        r4 = r3.c;	 Catch:{ all -> 0x0039 }
        r4 = r4.size();	 Catch:{ all -> 0x0039 }
        r5 = 1;
        if (r4 != r5) goto L_0x0035;
    L_0x002e:
        r4 = android.os.Looper.myQueue();	 Catch:{ all -> 0x0039 }
        r4.addIdleHandler(r3);	 Catch:{ all -> 0x0039 }
    L_0x0035:
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        return;
    L_0x0037:
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        goto L_0x003c;
    L_0x0039:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0039 }
        throw r4;
    L_0x003c:
        if (r5 == 0) goto L_0x0042;
    L_0x003e:
        r4.run();
        return;
    L_0x0042:
        r5 = r3.b;
        r5.execute(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xaa.a(java.lang.Runnable, boolean):void");
    }

    /* JADX WARNING: Missing block: B:19:0x003d, code skipped:
            return false;
     */
    public final boolean queueIdle() {
        /*
        r3 = this;
        r0 = r3.f;
        monitor-enter(r0);
        r1 = r3.d;	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x003b;
    L_0x0007:
        r1 = r3.f;	 Catch:{ all -> 0x003e }
        r1 = r1.get();	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x003b;
    L_0x000f:
        r1 = r3.c;	 Catch:{ all -> 0x003e }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x003e }
        if (r1 == 0) goto L_0x0018;
    L_0x0017:
        goto L_0x003b;
    L_0x0018:
        r1 = r3.c;	 Catch:{ all -> 0x003e }
        r1 = r1.poll();	 Catch:{ all -> 0x003e }
        r1 = (defpackage.xac) r1;	 Catch:{ all -> 0x003e }
        r2 = r1.b;	 Catch:{ all -> 0x003e }
        if (r2 == 0) goto L_0x002a;
    L_0x0024:
        r1 = r1.a;	 Catch:{ all -> 0x003e }
        r1.run();	 Catch:{ all -> 0x003e }
        goto L_0x0031;
    L_0x002a:
        r2 = r3.b;	 Catch:{ all -> 0x003e }
        r1 = r1.a;	 Catch:{ all -> 0x003e }
        r2.execute(r1);	 Catch:{ all -> 0x003e }
    L_0x0031:
        r1 = r3.c;	 Catch:{ all -> 0x003e }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x003e }
        r1 = r1 ^ 1;
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        return r1;
    L_0x003b:
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        r0 = 0;
        return r0;
    L_0x003e:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003e }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xaa.queueIdle():boolean");
    }
}
