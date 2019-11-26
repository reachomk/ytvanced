package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: aijv */
public class aijv implements aikc {
    private final SparseArray a;
    private final Set b;
    private final Set c;
    private final aijz d;
    private int e;

    public aijv() {
        this(new aijz());
    }

    public aijv(aijz aijz) {
        this.a = new SparseArray(n.length);
        this.b = new CopyOnWriteArraySet();
        this.c = new CopyOnWriteArraySet();
        this.d = aijz;
        for (int put : n) {
            this.a.put(put, new ArrayList());
        }
        this.e = -1;
    }

    public final void a(aike aike) {
        this.b.add(aike);
    }

    public final void b(aike aike) {
        this.b.remove(aike);
    }

    public final void a(aikd aikd) {
        this.d.e.add(aikd);
    }

    public final void b(aikd aikd) {
        this.d.e.remove(aikd);
    }

    public final void a(aikg aikg) {
        this.c.add(aikg);
    }

    public final void b(aikg aikg) {
        this.c.remove(aikg);
    }

    public final synchronized int a(int i) {
        return ((List) this.a.get(i)).size();
    }

    public final synchronized aikr a(int i, int i2) {
        return (aikr) ((List) this.a.get(i)).get(i2);
    }

    public final synchronized void b(int i, List list) {
        list.addAll((Collection) this.a.get(i));
    }

    public final void a(int i, int i2, Collection collection) {
        int size = collection.size();
        if (size != 0) {
            synchronized (this) {
                ((List) this.a.get(i)).addAll(i2, collection);
                int i3 = this.e;
                if (i == 0) {
                    b(i2, size);
                }
                for (aike a : this.b) {
                    a.a(i, i2, size);
                }
                c(i3);
            }
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0011, code skipped:
            return;
     */
    private final synchronized void b(int r3, int r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.e;	 Catch:{ all -> 0x0012 }
        r1 = -1;
        if (r0 == r1) goto L_0x0010;
    L_0x0006:
        if (r3 > r0) goto L_0x0010;
    L_0x0008:
        r0 = r0 + r4;
        r2.e = r0;	 Catch:{ all -> 0x0012 }
        r2.b();	 Catch:{ all -> 0x0012 }
        monitor-exit(r2);
        return;
    L_0x0010:
        monitor-exit(r2);
        return;
    L_0x0012:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijv.b(int, int):void");
    }

    public final void a(int i, int i2, int i3) {
        if (i3 != 0) {
            synchronized (this) {
                ((List) this.a.get(i)).subList(i2, i2 + i3).clear();
                int i4 = this.e;
                if (i == 0) {
                    c(i2, i3);
                }
                for (aike b : this.b) {
                    b.b(i, i2, i3);
                }
                c(i4);
            }
        }
    }

    /* JADX WARNING: Missing block: B:16:0x002e, code skipped:
            return;
     */
    private final synchronized void c(int r4, int r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.e;	 Catch:{ all -> 0x002f }
        r1 = -1;
        if (r0 == r1) goto L_0x002d;
    L_0x0006:
        if (r4 > r0) goto L_0x002d;
    L_0x0008:
        r2 = r4 + r5;
        if (r2 <= r0) goto L_0x0025;
    L_0x000c:
        r5 = r3.a;	 Catch:{ all -> 0x002f }
        r0 = 0;
        r5 = r5.get(r0);	 Catch:{ all -> 0x002f }
        r5 = (java.util.List) r5;	 Catch:{ all -> 0x002f }
        r5 = r5.size();	 Catch:{ all -> 0x002f }
        r5 = r5 + r1;
        r4 = java.lang.Math.min(r4, r5);	 Catch:{ all -> 0x002f }
        r3.e = r4;	 Catch:{ all -> 0x002f }
        r3.a();	 Catch:{ all -> 0x002f }
        monitor-exit(r3);
        return;
    L_0x0025:
        r0 = r0 - r5;
        r3.e = r0;	 Catch:{ all -> 0x002f }
        r3.b();	 Catch:{ all -> 0x002f }
        monitor-exit(r3);
        return;
    L_0x002d:
        monitor-exit(r3);
        return;
    L_0x002f:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijv.c(int, int):void");
    }

    public final synchronized int a(int i, aikr aikr) {
        return ((List) this.a.get(i)).indexOf(aikr);
    }

    public final synchronized boolean b(aikr aikr) {
        for (int i : n) {
            if (((List) this.a.get(i)).contains(aikr)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void c() {
        for (int i = 0; i < n.length; i++) {
            a(n[i], 0, ((List) this.a.get(n[i])).size());
        }
    }

    public final synchronized int e() {
        return this.e;
    }

    public final synchronized void b(int i) {
        List list = (List) this.a.get(0);
        if (!list.isEmpty()) {
            xru.a(i, list.size() - 1);
        } else if (i != -1) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = this.e;
        this.e = i;
        c(i2);
        a();
    }

    public synchronized int a(aikr aikr) {
        List list = (List) this.a.get(0);
        int indexOf = list.indexOf(aikr);
        if (indexOf < 0) {
            indexOf = ((List) this.a.get(1)).indexOf(aikr);
            if (indexOf < 0) {
                indexOf = Math.max(0, this.e + 1);
                a(0, indexOf, Collections.singleton(aikr));
            } else {
                indexOf++;
                for (int i = 0; i < indexOf; i++) {
                    int size = list.size();
                    synchronized (this) {
                        ((List) this.a.get(0)).add(size, (aikr) ((List) this.a.get(1)).remove(0));
                        int i2 = this.e;
                        b(size, 1);
                        for (aike a : this.b) {
                            a.a(size);
                        }
                        c(i2);
                    }
                }
                indexOf = list.size() - 1;
            }
        }
        b(indexOf);
        return e();
    }

    public final synchronized boolean c(aiqq aiqq) {
        aikr a = aikb.a(this);
        if (a == null) {
            return false;
        }
        return aiqx.a(a.e(), aiqq);
    }

    private final synchronized void a() {
        this.d.a(aikb.a(this));
    }

    private final synchronized void c(int i) {
        if (i != this.e) {
            for (aikg a : this.c) {
                a.a(i, this.e);
            }
        }
    }

    private final synchronized void b() {
        amqw.b(this.d.b(this.e != -1 ? (aikr) ((List) this.a.get(0)).get(this.e) : null));
    }
}
