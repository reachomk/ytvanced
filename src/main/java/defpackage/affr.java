package defpackage;

import java.util.LinkedList;
import java.util.List;

/* renamed from: affr */
public class affr {
    public static final affr a = new afft();
    private final LinkedList b = new LinkedList();
    private aequ c = aequ.a;

    /* JADX WARNING: Missing block: B:17:0x0054, code skipped:
            return r0;
     */
    public synchronized defpackage.affq a(long r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new affq;	 Catch:{ all -> 0x0064 }
        r1 = defpackage.aequ.a;	 Catch:{ all -> 0x0064 }
        r2 = defpackage.afgq.a;	 Catch:{ all -> 0x0064 }
        r0.<init>(r5, r1, r2);	 Catch:{ all -> 0x0064 }
        r1 = r4.b;	 Catch:{ all -> 0x0064 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0064 }
        if (r1 != 0) goto L_0x0055;
    L_0x0012:
        r1 = r4.b;	 Catch:{ all -> 0x0064 }
        r1 = r1.getFirst();	 Catch:{ all -> 0x0064 }
        r1 = (defpackage.affq) r1;	 Catch:{ all -> 0x0064 }
        r1 = r1.a;	 Catch:{ all -> 0x0064 }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 < 0) goto L_0x0055;
    L_0x0020:
        r1 = r4.b;	 Catch:{ all -> 0x0064 }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x0064 }
        if (r1 != 0) goto L_0x0053;
    L_0x0028:
        r1 = r4.b;	 Catch:{ all -> 0x0064 }
        r1 = r1.getFirst();	 Catch:{ all -> 0x0064 }
        r1 = (defpackage.affq) r1;	 Catch:{ all -> 0x0064 }
        r1 = r1.a;	 Catch:{ all -> 0x0064 }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 >= 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0053;
    L_0x0037:
        r1 = r4.b;	 Catch:{ all -> 0x0064 }
        r1 = r1.getFirst();	 Catch:{ all -> 0x0064 }
        r1 = (defpackage.affq) r1;	 Catch:{ all -> 0x0064 }
        r1 = r1.a;	 Catch:{ all -> 0x0064 }
        r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r3 != 0) goto L_0x004d;
    L_0x0045:
        r0 = r4.b;	 Catch:{ all -> 0x0064 }
        r0 = r0.getFirst();	 Catch:{ all -> 0x0064 }
        r0 = (defpackage.affq) r0;	 Catch:{ all -> 0x0064 }
    L_0x004d:
        r1 = r4.b;	 Catch:{ all -> 0x0064 }
        r1.removeFirst();	 Catch:{ all -> 0x0064 }
        goto L_0x0020;
    L_0x0053:
        monitor-exit(r4);
        return r0;
    L_0x0055:
        r0 = new affq;	 Catch:{ all -> 0x0064 }
        r1 = r4.c;	 Catch:{ all -> 0x0064 }
        r2 = defpackage.afgq.a;	 Catch:{ all -> 0x0064 }
        r0.<init>(r5, r1, r2);	 Catch:{ all -> 0x0064 }
        r5 = defpackage.aequ.a;	 Catch:{ all -> 0x0064 }
        r4.c = r5;	 Catch:{ all -> 0x0064 }
        monitor-exit(r4);
        return r0;
    L_0x0064:
        r5 = move-exception;
        monitor-exit(r4);
        goto L_0x0068;
    L_0x0067:
        throw r5;
    L_0x0068:
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.affr.a(long):affq");
    }

    public synchronized void a(List list, int i, aequ aequ, afgq afgq) {
        if (list.isEmpty()) {
            this.b.clear();
            this.c = aequ;
            return;
        }
        long j = ((nos) list.get(0)).j / 1000;
        long j2 = ((nos) list.get(i - 1)).k / 1000;
        while (!this.b.isEmpty()) {
            if (((affq) this.b.getFirst()).a >= j) {
                break;
            }
            this.b.removeFirst();
        }
        while (!this.b.isEmpty()) {
            if (((affq) this.b.getLast()).a < j2) {
                break;
            }
            this.b.removeLast();
        }
        this.b.add(new affq(j2, aequ, afgq));
    }

    public synchronized void a() {
        this.b.clear();
        this.c = aequ.a;
    }
}
