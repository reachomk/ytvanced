package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: vht */
public final class vht {
    public final Lock a = new ReentrantLock(true);
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public int d = 0;

    public vht(List list) {
        a(list);
    }

    public final void a(List list) {
        for (vso a : list) {
            this.b.add(vht.a(a));
        }
    }

    public static anjv a(vso vso) {
        if (vso instanceof vtg) {
            return new vhs();
        }
        return anjf.a((Object) vso);
    }

    public final void a(int i) {
        xak.a();
        this.a.lock();
        try {
            if (i >= this.d) {
                this.d = i;
                return;
            }
            throw new vhv("We can only ascend in state order");
        } finally {
            this.a.unlock();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0050 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|18) */
    /* JADX WARNING: Missing block: B:18:0x0057, code skipped:
            throw new defpackage.vhv("Couldn't mark current ad as ended - ad at head of queue is unretrievable");
     */
    public final void b(defpackage.vso r3) {
        /*
        r2 = this;
        defpackage.xak.a();
        r0 = r2.a;
        r0.lock();
        r0 = r2.d;	 Catch:{ all -> 0x0070 }
        r1 = 1;
        if (r0 != r1) goto L_0x0068;
    L_0x000d:
        r0 = r2.b;	 Catch:{ all -> 0x0070 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0070 }
        if (r0 != 0) goto L_0x0060;
    L_0x0015:
        r0 = r2.b;	 Catch:{ all -> 0x0070 }
        r1 = 0;
        r0 = r0.get(r1);	 Catch:{ all -> 0x0070 }
        r0 = (defpackage.anjv) r0;	 Catch:{ all -> 0x0070 }
        r0 = r0.isDone();	 Catch:{ all -> 0x0070 }
        if (r0 == 0) goto L_0x0058;
    L_0x0024:
        r0 = r2.b;	 Catch:{ Exception -> 0x0050 }
        r0 = r0.get(r1);	 Catch:{ Exception -> 0x0050 }
        r0 = (defpackage.anjv) r0;	 Catch:{ Exception -> 0x0050 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0050 }
        r0 = (defpackage.vso) r0;	 Catch:{ Exception -> 0x0050 }
        r3 = defpackage.amqq.a(r0, r3);	 Catch:{ Exception -> 0x0050 }
        if (r3 == 0) goto L_0x0048;
    L_0x0038:
        r3 = r2.b;	 Catch:{ Exception -> 0x0050 }
        r3.remove(r1);	 Catch:{ Exception -> 0x0050 }
        r3 = r2.c;	 Catch:{ Exception -> 0x0050 }
        r3.add(r0);	 Catch:{ Exception -> 0x0050 }
        r3 = r2.a;
        r3.unlock();
        return;
    L_0x0048:
        r3 = new vhv;	 Catch:{ Exception -> 0x0050 }
        r0 = "Couldn't mark current ad as ended - ad specified for completion is not the ad at head of queue";
        r3.<init>(r0);	 Catch:{ Exception -> 0x0050 }
        throw r3;	 Catch:{ Exception -> 0x0050 }
    L_0x0050:
        r3 = new vhv;	 Catch:{ all -> 0x0070 }
        r0 = "Couldn't mark current ad as ended - ad at head of queue is unretrievable";
        r3.<init>(r0);	 Catch:{ all -> 0x0070 }
        throw r3;	 Catch:{ all -> 0x0070 }
    L_0x0058:
        r3 = new vhv;	 Catch:{ all -> 0x0070 }
        r0 = "Couldn't mark current ad as ended - ad at head of queue not filled";
        r3.<init>(r0);	 Catch:{ all -> 0x0070 }
        throw r3;	 Catch:{ all -> 0x0070 }
    L_0x0060:
        r3 = new vhv;	 Catch:{ all -> 0x0070 }
        r0 = "Couldn't mark current ad as ended - no ads in queue for playing";
        r3.<init>(r0);	 Catch:{ all -> 0x0070 }
        throw r3;	 Catch:{ all -> 0x0070 }
    L_0x0068:
        r3 = new vhv;	 Catch:{ all -> 0x0070 }
        r0 = "Tried to mark an ad as entered before scheduling before slot entered";
        r3.<init>(r0);	 Catch:{ all -> 0x0070 }
        throw r3;	 Catch:{ all -> 0x0070 }
    L_0x0070:
        r3 = move-exception;
        r0 = r2.a;
        r0.unlock();
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vht.b(vso):void");
    }
}
