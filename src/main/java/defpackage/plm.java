package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimerTask;

/* renamed from: plm */
public final class plm {
    public final pon a = new pon("MediaQueue");
    public long b;
    public final plw c;
    public boolean d;
    public List e;
    public final SparseIntArray f;
    public final LruCache g;
    public final List h;
    public final Deque i;
    public ptg j;
    public ptg k;
    public final ptm l;
    public final Set m = new HashSet();
    private final Handler n;
    private final TimerTask o;
    private final ptm p;
    private final plq q;
    private final ple r;

    plm(plw plw) {
        this.c = plw;
        Math.max(20, 1);
        plb b = pkp.a().b();
        pzr.b("Must be called from the main thread.");
        pla a = b.a();
        pla pla = null;
        if (a != null && (a instanceof pkq)) {
            pla = (pkq) a;
        }
        this.e = new ArrayList();
        this.f = new SparseIntArray();
        this.h = new ArrayList();
        this.i = new ArrayDeque(20);
        this.n = new Handler(Looper.getMainLooper());
        this.g = new pnf(this);
        this.o = new pnc(this);
        this.l = new plo(this);
        this.p = new plp(this);
        this.q = new plq(this);
        this.r = new plr(this);
        pkp.a().b().a(this.r, pkq.class);
        if (pla != null && pla.d()) {
            a(pla.a());
        }
    }

    public final void a() {
        f();
        this.e.clear();
        this.f.clear();
        this.g.evictAll();
        this.h.clear();
        j();
        this.i.clear();
        k();
        l();
        h();
        g();
    }

    public final void b() {
        String str = "Must be called from the main thread.";
        pzr.b(str);
        if (this.d && this.b != 0 && this.k == null) {
            ptg a;
            k();
            l();
            plw plw = this.c;
            pzr.b(str);
            if (plw.r()) {
                a = plw.a(new pml(plw, plw.e));
            } else {
                a = plw.s();
            }
            this.k = a;
            this.k.a(this.p);
        }
    }

    public final void c() {
        j();
        this.n.postDelayed(this.o, 500);
    }

    private final void j() {
        this.n.removeCallbacks(this.o);
    }

    private final void k() {
        ptg ptg = this.k;
        if (ptg != null) {
            ptg.c();
            this.k = null;
        }
    }

    private final void l() {
        ptg ptg = this.j;
        if (ptg != null) {
            ptg.c();
            this.j = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(plw plw) {
        if (plw != null && this.c == plw) {
            this.d = true;
            plq plq = this.q;
            pzr.b("Must be called from the main thread.");
            if (plq != null) {
                plw.g.add(plq);
            }
            long b = plm.b(plw);
            this.b = b;
            if (b != 0) {
                b();
            }
        }
    }

    public static long b(plw plw) {
        pjz g = plw.g();
        if (g != null) {
            MediaInfo mediaInfo = g.a;
            if (!pjz.a(g.e, g.f, g.k, mediaInfo != null ? mediaInfo.b : -1)) {
                return g.b;
            }
        }
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        plw plw = this.c;
        plq plq = this.q;
        pzr.b("Must be called from the main thread.");
        if (plq != null) {
            plw.g.remove(plq);
        }
        this.d = false;
    }

    public final void e() {
        this.f.clear();
        for (int i = 0; i < this.e.size(); i++) {
            this.f.put(((Integer) this.e.get(i)).intValue(), i);
        }
    }

    public final void f() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void g() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void h() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void i() {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
