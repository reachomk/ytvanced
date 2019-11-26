package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: png */
final class png implements poo {
    private final /* synthetic */ plw a;

    png(plw plw) {
        this.a = plw;
    }

    public final void a() {
        plw plw = this.a;
        for (pmh pmh : plw.h.values()) {
            if (plw.p() && !pmh.d) {
                pmh.e.b.removeCallbacks(pmh.c);
                pmh.d = true;
                pmh.e.b.postDelayed(pmh.c, pmh.b);
            } else if (!plw.p() && pmh.d) {
                pmh.e.b.removeCallbacks(pmh.c);
                pmh.d = false;
            }
            if (pmh.d && (plw.m() || plw.l() || plw.n())) {
                HashSet<pmd> hashSet = new HashSet(pmh.a);
                if (plw.k() || plw.l() || plw.m()) {
                    for (pmd pmd : hashSet) {
                        plw.e();
                        plw.f();
                        pmd.a();
                    }
                } else if (plw.n()) {
                    pjy pjy;
                    pzr.b("Must be called from the main thread.");
                    pjz g = plw.g();
                    if (g == null) {
                        pjy = null;
                    } else {
                        pjy = g.a(g.k);
                    }
                    if (!(pjy == null || pjy.a == null)) {
                        for (pmd pmd2 : hashSet) {
                            long j = pjy.a.e;
                            pmd2.a();
                        }
                    }
                } else {
                    for (pmd pmd3 : hashSet) {
                        pmd3.a();
                    }
                }
            }
        }
        for (ply a : this.a.f) {
            a.a();
        }
        for (plz a2 : this.a.g) {
            a2.a();
        }
    }

    public final void b() {
        for (ply b : this.a.f) {
            b.b();
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void c() {
        for (ply c : this.a.f) {
            c.c();
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void d() {
        for (ply d : this.a.f) {
            d.d();
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void e() {
        for (ply f : this.a.f) {
            f.f();
        }
        Iterator it = this.a.g.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(int[] iArr) {
        for (plz a : this.a.g) {
            a.a(iArr);
        }
    }

    public final void a(int[] iArr, int i) {
        for (plz a : this.a.g) {
            a.a(iArr, i);
        }
    }

    public final void b(int[] iArr) {
        for (plz b : this.a.g) {
            b.b(iArr);
        }
    }

    public final void c(int[] iArr) {
        for (plz c : this.a.g) {
            c.c(iArr);
        }
    }

    public final void a(pjy[] pjyArr) {
        for (plz a : this.a.g) {
            a.a(pjyArr);
        }
    }
}
