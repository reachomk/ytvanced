package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: uon */
public final class uon extends uok implements upf {
    public final upc c;
    public final uob d;
    private final AtomicBoolean e;
    private final List f;
    private final ukz g;
    private uor h;

    public uon(int[] iArr, uot uot, String str, int i) {
        this(iArr, unw.a, uot, str, i);
    }

    public uon(int[] iArr, unw unw, uot uot, String str, int i) {
        super(i);
        this.e = new AtomicBoolean(false);
        this.f = new CopyOnWriteArrayList();
        uhy.a(iArr.length > 0);
        uhy.a((Object) unw);
        this.g = uot.a;
        this.c = new upc(this.g);
        i = 0;
        int i2 = 0;
        while (true) {
            Iterator it = null;
            if (i < iArr.length) {
                uor a;
                int i3 = iArr[i];
                if (this.g.a(i3)) {
                    i2++;
                }
                uhy.a(i3 >= 0);
                uhy.a(i3 < uot.a.d());
                synchronized (uot.b) {
                    a = uot.b.a(i3);
                    if (a == null) {
                        a = new uor(uot.c, i3);
                        if (uot.b.a(a) == null) {
                            List list = uot.d;
                            if (list != null) {
                                it = list.iterator();
                            }
                        } else {
                            throw new AssertionError("An existing thumbnail was already stored");
                        }
                    }
                    a.c();
                }
                if (it != null) {
                    while (it.hasNext()) {
                        ((upe) it.next()).a(a);
                    }
                }
                uhy.b(a.e() != 3);
                this.c.a(a);
                i++;
            } else {
                ujo.a(3, String.format("ExtractorTask(%s) for %d thumbnails (%d keyframes)", new Object[]{str, Integer.valueOf(iArr.length), Integer.valueOf(i2)}), null);
                this.d = unw.a(iArr, this.g);
                this.h = g();
                return;
            }
        }
        while (true) {
        }
    }

    public final uor d() {
        uor c;
        synchronized (this.c) {
            Entry firstEntry = this.c.a.firstEntry();
            c = (firstEntry != null ? (uor) firstEntry.getValue() : null).c();
        }
        return c;
    }

    /* JADX WARNING: Missing block: B:12:0x001c, code skipped:
            return null;
     */
    public final defpackage.uor a(long r3) {
        /*
        r2 = this;
        r0 = r2.c;
        monitor-enter(r0);
        r1 = r2.g;	 Catch:{ all -> 0x001d }
        r3 = r1.a(r3);	 Catch:{ all -> 0x001d }
        r4 = -1;
        if (r3 == r4) goto L_0x001a;
    L_0x000c:
        r4 = r2.c;	 Catch:{ all -> 0x001d }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uon.a(long):uor");
    }

    public final uor a(long j, boolean z) {
        synchronized (this.c) {
            uor a = this.c.a(j, z);
            if (a != null) {
                a = a.c();
                return a;
            }
            return null;
        }
    }

    public final boolean e() {
        return this.e.get();
    }

    public final void a(upe upe) {
        boolean z;
        uhy.a((Object) upe);
        synchronized (this.e) {
            this.f.add(upe);
            z = this.e.get();
        }
        if (z) {
            upe.b(this);
        }
    }

    public final void b(upe upe) {
        this.f.remove(upe);
    }

    public final void f() {
        this.b = true;
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((uor) it.next()).d();
            }
            this.c.a();
            this.h = null;
        }
        this.f.clear();
    }

    public final int a() {
        uor uor = this.h;
        if (uor == null) {
            return -1;
        }
        return uor.a;
    }

    public final boolean a(int i) {
        uor uor = this.h;
        if (uor == null) {
            ujo.b("Thumbnails are being extracted even though all requests are already completed");
            return false;
        } else if (uor.a == i) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(int i, Bitmap bitmap) {
        uor uor = this.h;
        boolean z = false;
        if (uor != null && uor.a == i) {
            z = true;
        }
        uhy.b(z);
        this.h.a(bitmap);
        for (upe a : this.f) {
            a.a(this.h);
        }
    }

    public final int b() {
        uor uor = this.h;
        if (uor != null && uor.e() == 2) {
            this.h = g();
        }
        uor = this.h;
        if (uor == null) {
            return -1;
        }
        return uor.a;
    }

    public final void c() {
        synchronized (this.e) {
            this.e.set(true);
        }
        for (upe b : this.f) {
            b.b(this);
        }
    }

    public final void a(Exception exception) {
        synchronized (this.f) {
            for (upe a : this.f) {
                a.a(exception);
            }
        }
    }

    private final uor g() {
        if (!this.b) {
            while (this.d.hasNext()) {
                uor uor = (uor) uhy.a(this.c.a(((Integer) uhy.a((Integer) this.d.next())).intValue()));
                if (uor.e() == 1) {
                    return uor;
                }
                if (uor.e() == 2) {
                    for (upe a : this.f) {
                        a.a(uor);
                    }
                }
            }
        }
        return null;
    }
}
