package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: ukm */
public final class ukm {
    public int a = 1;
    private final PriorityQueue b = new PriorityQueue(5);
    private final PriorityQueue c = new PriorityQueue(5, Collections.reverseOrder());

    /* JADX WARNING: Missing block: B:12:0x002d, code skipped:
            return;
     */
    public final synchronized void a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.a;	 Catch:{ all -> 0x0030 }
        if (r2 <= r0) goto L_0x002e;
    L_0x0005:
        r1.a = r2;	 Catch:{ all -> 0x0030 }
    L_0x0007:
        r2 = r1.b;	 Catch:{ all -> 0x0030 }
        r2 = r2.size();	 Catch:{ all -> 0x0030 }
        r0 = r1.a;	 Catch:{ all -> 0x0030 }
        if (r2 >= r0) goto L_0x002c;
    L_0x0011:
        r2 = r1.c;	 Catch:{ all -> 0x0030 }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x0030 }
        if (r2 != 0) goto L_0x002c;
    L_0x0019:
        r2 = r1.c;	 Catch:{ all -> 0x0030 }
        r2 = r2.poll();	 Catch:{ all -> 0x0030 }
        r2 = (defpackage.uko) r2;	 Catch:{ all -> 0x0030 }
        r0 = r1.b;	 Catch:{ all -> 0x0030 }
        r0.add(r2);	 Catch:{ all -> 0x0030 }
        r2 = r2.b;	 Catch:{ all -> 0x0030 }
        r2.a();	 Catch:{ all -> 0x0030 }
        goto L_0x0007;
    L_0x002c:
        monitor-exit(r1);
        return;
    L_0x002e:
        monitor-exit(r1);
        return;
    L_0x0030:
        r2 = move-exception;
        monitor-exit(r1);
        goto L_0x0034;
    L_0x0033:
        throw r2;
    L_0x0034:
        goto L_0x0033;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukm.a(int):void");
    }

    public final synchronized boolean a(ukl ukl) {
        uhy.a(b(ukl));
        this.b.remove(e(ukl));
        int i = this.a;
        if (i == 1) {
            return false;
        }
        this.a = i - 1;
        return true;
    }

    public final synchronized void a(ukl ukl, int i) {
        uhy.a((Object) ukl);
        uko e = e(ukl);
        if (e == null) {
            this.c.add(new uko(i, ukl));
        } else if (e.a == i) {
            return;
        } else {
            if (this.c.contains(e)) {
                this.c.remove(e);
                this.c.add(new uko(i, ukl));
            } else {
                this.b.remove(e);
                this.b.add(new uko(i, ukl));
            }
        }
        a();
    }

    public final synchronized boolean b(ukl ukl) {
        boolean z;
        uko e = e(ukl);
        z = e != null && this.b.contains(e);
        return z;
    }

    public final synchronized void c(ukl ukl) {
        uhy.a((Object) ukl);
        uko e = e(ukl);
        if (e != null && this.b.remove(e)) {
            this.c.add(e);
            a();
        }
    }

    public final synchronized void d(ukl ukl) {
        uhy.a((Object) ukl);
        uko e = e(ukl);
        if (e != null) {
            this.b.remove(e);
            this.c.remove(e);
            a();
        }
    }

    /* JADX WARNING: Missing block: B:17:0x0054, code skipped:
            return;
     */
    private final synchronized void a() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x0055 }
        r0 = r0.size();	 Catch:{ all -> 0x0055 }
        r1 = r4.a;	 Catch:{ all -> 0x0055 }
        if (r0 >= r1) goto L_0x0023;
    L_0x000b:
        r0 = r4.c;	 Catch:{ all -> 0x0055 }
        r0 = r0.poll();	 Catch:{ all -> 0x0055 }
        r0 = (defpackage.uko) r0;	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x0053;
    L_0x0015:
        r1 = r4.b;	 Catch:{ all -> 0x0055 }
        r1.add(r0);	 Catch:{ all -> 0x0055 }
        r1 = 0;
        r0.c = r1;	 Catch:{ all -> 0x0055 }
        r0 = r0.b;	 Catch:{ all -> 0x0055 }
        r0.a();	 Catch:{ all -> 0x0055 }
        goto L_0x0053;
    L_0x0023:
        r0 = r4.b;	 Catch:{ all -> 0x0055 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0055 }
        r1 = 1;
        r0 = r0 ^ r1;
        defpackage.uhy.b(r0);	 Catch:{ all -> 0x0055 }
        r0 = r4.c;	 Catch:{ all -> 0x0055 }
        r0 = r0.peek();	 Catch:{ all -> 0x0055 }
        r0 = (defpackage.uko) r0;	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x0053;
    L_0x0038:
        r2 = r4.b;	 Catch:{ all -> 0x0055 }
        r2 = r2.peek();	 Catch:{ all -> 0x0055 }
        r2 = (defpackage.uko) r2;	 Catch:{ all -> 0x0055 }
        r0 = r0.a;	 Catch:{ all -> 0x0055 }
        r3 = r2.a;	 Catch:{ all -> 0x0055 }
        if (r0 <= r3) goto L_0x0053;
    L_0x0046:
        r0 = r2.c;	 Catch:{ all -> 0x0055 }
        if (r0 != 0) goto L_0x0053;
    L_0x004a:
        r2.c = r1;	 Catch:{ all -> 0x0055 }
        r0 = r2.b;	 Catch:{ all -> 0x0055 }
        r0.b();	 Catch:{ all -> 0x0055 }
        monitor-exit(r4);
        return;
    L_0x0053:
        monitor-exit(r4);
        return;
    L_0x0055:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ukm.a():void");
    }

    private final uko e(ukl ukl) {
        uko uko;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            uko = (uko) it.next();
            if (uko.b == ukl) {
                return uko;
            }
        }
        it = this.c.iterator();
        while (it.hasNext()) {
            uko = (uko) it.next();
            if (uko.b == ukl) {
                return uko;
            }
        }
        return null;
    }
}
