package defpackage;

import android.text.TextUtils;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: xkb */
final class xkb implements xku {
    public final xju a;
    private final aac c = new aac(10);

    xkb(xju xju) {
        this.a = xju;
    }

    public final boolean a(xle xle, xjp xjp) {
        String c = xkb.c(xle);
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        synchronized (this.c) {
            if (this.c.containsKey(c)) {
                Queue queue = (Queue) this.c.get(c);
                if (queue == null) {
                    queue = new ArrayDeque();
                    this.c.put(c, queue);
                }
                boolean offer = queue.offer(new xkg(xjp, xle));
                return offer;
            }
            this.c.put(c, null);
            return false;
        }
    }

    public final void a(xle xle) {
        a(xle, new xke(this));
    }

    public final void a(xle xle, bqh bqh) {
        a(xle, new xkd(bqh));
    }

    public final boolean b(xle xle) {
        String c = xkb.c(xle);
        boolean z = false;
        if (TextUtils.isEmpty(c)) {
            return false;
        }
        synchronized (this.c) {
            Queue queue = (Queue) this.c.get(c);
            if (queue != null) {
                if (!queue.isEmpty()) {
                    z = true;
                }
            }
        }
        return z;
    }

    private static String c(xle xle) {
        if (xle.i) {
            return xle.g();
        }
        return null;
    }

    /* JADX WARNING: Missing block: B:18:0x0039, code skipped:
            return;
     */
    private final void a(defpackage.xle r4, defpackage.xkf r5) {
        /*
        r3 = this;
        r4 = defpackage.xkb.c(r4);
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 != 0) goto L_0x003d;
    L_0x000a:
        r0 = r3.c;
        monitor-enter(r0);
        r1 = r3.c;	 Catch:{ all -> 0x003a }
        r1 = r1.get(r4);	 Catch:{ all -> 0x003a }
        r1 = (java.util.Queue) r1;	 Catch:{ all -> 0x003a }
        if (r1 == 0) goto L_0x002b;
    L_0x0017:
        r2 = r1.isEmpty();	 Catch:{ all -> 0x003a }
        if (r2 != 0) goto L_0x002b;
    L_0x001d:
        r2 = r1.poll();	 Catch:{ all -> 0x003a }
        r2 = (defpackage.xkg) r2;	 Catch:{ all -> 0x003a }
        r2 = r5.a(r2);	 Catch:{ all -> 0x003a }
        if (r2 == 0) goto L_0x0017;
    L_0x0029:
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        return;
    L_0x002b:
        if (r1 == 0) goto L_0x0033;
    L_0x002d:
        r5 = r1.isEmpty();	 Catch:{ all -> 0x003a }
        if (r5 == 0) goto L_0x0038;
    L_0x0033:
        r5 = r3.c;	 Catch:{ all -> 0x003a }
        r5.remove(r4);	 Catch:{ all -> 0x003a }
    L_0x0038:
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        return;
    L_0x003a:
        r4 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003a }
        throw r4;
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkb.a(xle, xkf):void");
    }
}
