package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: umw */
public final class umw implements ukl {
    public final umx a = new umv(this);
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final ukm c;
    public final Queue d = new LinkedList();
    public boolean e = false;
    public umr f;
    public Surface g;
    public List h;
    public umz i;
    public boolean j = true;
    private final Handler k = new Handler(Looper.getMainLooper());
    private final unb l = new unb(this.a);
    private final Runnable m = new umy(this);

    public umw(ukm ukm) {
        this.c = (ukm) uhy.a((Object) ukm);
    }

    public final String toString() {
        return "PLAYER";
    }

    public final synchronized void a(umr umr, List list) {
        this.f = (umr) uhy.a((Object) umr);
        this.h = Collections.unmodifiableList((List) uhy.a((Object) list));
        umr.a(this.l);
        umr.a.add(this.l);
        d();
        e();
    }

    public final boolean c() {
        return this.c.b(this);
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((una) it.next()).b();
        }
        synchronized (this.d) {
            this.d.add(Integer.valueOf(0));
        }
        d();
    }

    public final void b() {
        synchronized (this.d) {
            this.d.add(Integer.valueOf(1));
        }
        d();
    }

    public final void d() {
        this.k.post(this.m);
    }

    public final boolean a(boolean z) {
        if (!(this.f == null || this.g == null)) {
            List<Integer> list = this.h;
            if (list != null) {
                umz umz = this.i;
                if (umz != null && (z || umz.j)) {
                    for (Integer intValue : list) {
                        this.f.a(intValue.intValue(), !z ? -1 : 0);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void e() {
        umr umr = this.f;
        if (umr != null) {
            int i = Integer.MAX_VALUE;
            if (!(umr.d() || this.j)) {
                i = aocf.UNSET_ENUM_VALUE;
            }
            this.c.a(this, i);
        }
    }
}
