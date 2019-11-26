package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ambz */
public abstract class ambz implements amcj {
    public final int a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public ambz(int i) {
        this.a = i;
    }

    public abstract void b();

    public abstract void c();

    public final int a() {
        return this.a;
    }

    public final synchronized void a(amcm amcm) {
        if (this.b.isEmpty()) {
            b();
        }
        this.b.add(amcm);
    }

    /* JADX WARNING: Missing block: B:8:0x001a, code skipped:
            return;
     */
    public final synchronized void b(defpackage.amcm r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = r1.b;	 Catch:{ all -> 0x001d }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x001d }
        if (r0 != 0) goto L_0x001b;
    L_0x0009:
        r0 = r1.b;	 Catch:{ all -> 0x001d }
        r0.remove(r2);	 Catch:{ all -> 0x001d }
        r2 = r1.b;	 Catch:{ all -> 0x001d }
        r2 = r2.isEmpty();	 Catch:{ all -> 0x001d }
        if (r2 == 0) goto L_0x0019;
    L_0x0016:
        r1.c();	 Catch:{ all -> 0x001d }
    L_0x0019:
        monitor-exit(r1);
        return;
    L_0x001b:
        monitor-exit(r1);
        return;
    L_0x001d:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ambz.b(amcm):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((amcm) it.next()).a(this);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof amcj) {
            if (this.a == ((amcj) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
