package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: uph */
public final class uph implements upe, upf {
    private final uoz a;
    private final List b = new CopyOnWriteArrayList();
    private final List c = new ArrayList();

    public uph(uoz uoz) {
        this.a = (uoz) uhy.a((Object) uoz);
    }

    public final void a(long j, long j2) {
        HashMap hashMap = new HashMap();
        for (uon uon : this.c) {
            hashMap.put(Long.valueOf(uon.d().a()), uon);
        }
        this.c.clear();
        long b = b(j);
        long c = c(j2);
        a(b, c, hashMap);
        j -= 1000000;
        if (j < b) {
            a(b(j), b, hashMap);
        }
        j2 += 1000000;
        if (j2 > c) {
            a(c, c(j2), hashMap);
        }
        for (uon f : hashMap.values()) {
            f.f();
        }
    }

    public final uor a(long j) {
        Iterator it = this.c.iterator();
        while (true) {
            uor uor = null;
            if (!it.hasNext()) {
                return null;
            }
            uon uon = (uon) it.next();
            if (uon.d().a() <= j) {
                synchronized (uon.c) {
                    Entry lastEntry = uon.c.a.lastEntry();
                    if (lastEntry != null) {
                        uor = (uor) lastEntry.getValue();
                    }
                    uor = uor.c();
                }
                if (uor.a() >= j) {
                    return uon.a(j);
                }
            }
        }
        while (true) {
        }
    }

    public final uor a(long j, boolean z) {
        uor uor = null;
        for (uon a : this.c) {
            uor a2 = a.a(j, z);
            if (a2 != null) {
                if (uor != null) {
                    if (Math.abs(a2.a() - j) < Math.abs(uor.a() - j)) {
                        uor.d();
                    }
                }
                uor = a2;
            }
        }
        return uor;
    }

    public final boolean e() {
        for (uon e : this.c) {
            if (!e.e()) {
                return false;
            }
        }
        return true;
    }

    public final void a(upe upe) {
        this.b.add(upe);
        if (e()) {
            upe.b(this);
        }
    }

    public final void b(upe upe) {
        this.b.remove(upe);
    }

    public final void f() {
        for (uon f : this.c) {
            f.f();
        }
        this.b.clear();
    }

    public final void a(uor uor) {
        for (upe a : this.b) {
            a.a(uor);
        }
    }

    public final void b(upf upf) {
        if (e()) {
            for (upe b : this.b) {
                b.b(this);
            }
        }
    }

    public final void a(Exception exception) {
        for (upe a : this.b) {
            a.a(exception);
        }
    }

    private final void a(long j, long j2, Map map) {
        while (true) {
            long j3 = j;
            if (j3 < j2) {
                j = c(1 + j3);
                Object obj = (uon) map.remove(Long.valueOf(j3));
                if (obj == null) {
                    obj = this.a.a(j3, -1 + j, String.format("Subsequence: %d - %d", new Object[]{Long.valueOf(j3 / 1000), Long.valueOf(j / 1000)}));
                    obj.a((upe) this);
                }
                this.c.add(obj);
            } else {
                return;
            }
        }
    }

    private final long b(long j) {
        ukz a = this.a.a();
        int c = a.c(j);
        if (c == -1) {
            return 0;
        }
        return a.b(c);
    }

    private final long c(long j) {
        ukz a = this.a.a();
        int b = a.b(j);
        if (b != -1) {
            return a.b(b);
        }
        return a.g;
    }
}
