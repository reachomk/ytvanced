package defpackage;

import android.util.Pair;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: fhk */
public final class fhk implements akov, t {
    public final WeakHashMap a = new WeakHashMap();
    public fhp b;
    public boolean c;
    public View d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private bbnc h;

    public final void B_() {
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(fhq fhq) {
        bbnc bbnc = this.h;
        if (!(bbnc == null || bbnc.c())) {
            this.h.bK_();
        }
        fhn j = j();
        if (j != null) {
            this.h = j.a(0).c();
        }
        View i = i();
        fhp fhp = this.b;
        if (!(fhp == null || i == null)) {
            fhp.a(i);
        }
        h();
        if (fhq == null) {
            this.b = null;
            this.e = null;
            return;
        }
        this.b = new fhp(this.d, fhq);
        this.e = new WeakReference((fho) amqw.a(fhq.n()));
    }

    public final void C_() {
        bbnc bbnc = this.h;
        if (!(bbnc == null || bbnc.c())) {
            this.h.bK_();
        }
        h();
    }

    public final void a(akot akot, Object obj) {
        if (akot instanceof fhn) {
            a(akot.K_(), (fhn) akot);
        }
    }

    public final void a(View view, fhn fhn) {
        this.a.put(view, fhn);
        fhp fhp = this.b;
        if (fhp != null) {
            fhp.a.put(view, Integer.valueOf(0));
        }
    }

    public final void f() {
        fhp fhp = this.b;
        if (fhp != null) {
            a(fhp.a(false), false, false);
        }
    }

    public final void g() {
        fhp fhp = this.b;
        if (fhp != null) {
            a(fhp.a(true), true, false);
        }
    }

    public final void a(Pair pair, boolean z, boolean z2) {
        View view = (View) pair.first;
        fhn fhn = (fhn) this.a.get(view);
        fhn j = j();
        if (z || fhn == null || !fhn.a(j)) {
            bbnc bbnc = this.h;
            if (!(bbnc == null || bbnc.c())) {
                this.h.bK_();
            }
            bblt a = bblt.a();
            if (!(j == null || j.a(fhn))) {
                View i = i();
                fhp fhp = this.b;
                if (!(fhp == null || i == null)) {
                    fhp.a(i);
                }
                a(null);
                a = a.a(j.a(0));
            }
            if (fhn != null) {
                a = a.a(fhn.a(!z2 ? 1 : 2).b(new fhj(this, pair)));
            }
            this.h = a.a(new fhm(this)).a(bbod.d, bbod.d, bbod.c, bbod.c, bbod.c, new fhl(this)).c();
            this.f = new WeakReference(fhn);
            this.g = new WeakReference(view);
        }
    }

    private final void h() {
        a(null);
        this.f = null;
        this.g = null;
    }

    public final void a(Integer num) {
        WeakReference weakReference = this.e;
        if (weakReference != null) {
            fho fho = (fho) weakReference.get();
            if (fho != null) {
                fho.a(num);
            }
        }
    }

    private final View i() {
        WeakReference weakReference = this.g;
        return weakReference != null ? (View) weakReference.get() : null;
    }

    private final fhn j() {
        WeakReference weakReference = this.f;
        return weakReference != null ? (fhn) weakReference.get() : null;
    }
}
