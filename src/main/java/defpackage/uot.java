package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: uot */
public final class uot implements upf {
    public final ukz a;
    public final upc b;
    public final uos c = new uos(this);
    public List d;

    public uot(ukz ukz) {
        this.a = (ukz) uhy.a((Object) ukz);
        this.b = new upc(ukz);
    }

    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            return null;
     */
    public final defpackage.uor a(long r3) {
        /*
        r2 = this;
        r0 = r2.b;
        monitor-enter(r0);
        r1 = r2.a;	 Catch:{ all -> 0x001d }
        r3 = r1.a(r3);	 Catch:{ all -> 0x001d }
        r4 = -1;
        if (r3 == r4) goto L_0x001a;
    L_0x000c:
        r4 = r2.b;	 Catch:{ all -> 0x001d }
        r3 = r4.a(r3);	 Catch:{ all -> 0x001d }
        if (r3 == 0) goto L_0x001a;
    L_0x0014:
        r3 = r3.c();	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return r3;
    L_0x001a:
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        r3 = 0;
        return r3;
    L_0x001d:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uot.a(long):uor");
    }

    public final uor a(long j, boolean z) {
        synchronized (this.b) {
            uor a = this.b.a(j, z);
            if (a != null) {
                a = a.c();
                return a;
            }
            return null;
        }
    }

    public final boolean e() {
        synchronized (this.b) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                if (((uor) it.next()).e() == 1) {
                    return false;
                }
            }
            return true;
        }
    }

    public final void a(upe upe) {
        if (this.d == null) {
            this.d = new CopyOnWriteArrayList();
        }
        this.d.add(upe);
    }

    public final void b(upe upe) {
        List list = this.d;
        if (list != null) {
            list.remove(upe);
        }
    }

    public final void f() {
        synchronized (this.b) {
            this.b.a();
        }
        List list = this.d;
        if (list != null) {
            list.clear();
        }
    }
}
