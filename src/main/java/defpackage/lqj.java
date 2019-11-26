package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;

/* renamed from: lqj */
public final class lqj implements llc, llf, lli, lps {
    public final llg a;
    public final SparseArray b = new SparseArray();
    public final lkz c = new lqm(this);
    public int d;
    public int e;
    public lkv f;
    private final zl g = new zl();

    public lqj(llg llg, lla lla, lla lla2, lla lla3, lla lla4) {
        this.a = llg;
        a(0, lla);
        a(2, lla2);
        a(1, lla3);
        a(3, lla4);
        llg.a.add(this);
    }

    public static boolean a(float f) {
        return f > 0.0f;
    }

    public final void a(lkz lkz) {
        amqw.a((Object) lkz);
        this.g.add(lkz);
    }

    public final void b(lkz lkz) {
        this.g.remove(lkz);
    }

    public final lla a(int i) {
        return (lla) this.b.get(i);
    }

    public final lla a() {
        lla lla = this.f;
        return lla == null ? a(this.a.b) : lla;
    }

    public final int f() {
        return this.a.b;
    }

    public final boolean aF_() {
        return this.a.aF_();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean g() {
        return this.a.c();
    }

    public final boolean h() {
        return lqj.a(a().n());
    }

    public final boolean i() {
        return lqj.a(a().q());
    }

    public final boolean j() {
        return lqj.a(a().o());
    }

    public final void aG_() {
        k();
    }

    public final Rect c() {
        return a().i();
    }

    public final float d() {
        return a().r();
    }

    public final boolean e() {
        boolean z = true;
        if (!(this.a.aF_() || this.a.b())) {
            if (!this.a.c()) {
                z = false;
            } else if (this.f != null) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    private final void a(int i, lla lla) {
        lkv a = lqj.a(lla);
        this.b.put(i, a);
        a.a(this.c);
    }

    public final void k() {
        lla a = a();
        int i = 0;
        while (true) {
            zl zlVar = this.g;
            if (i < zlVar.b) {
                ((lkz) zlVar.a(i)).a(a);
                i++;
            } else {
                return;
            }
        }
    }

    public static lkv a(lla lla) {
        if (lla instanceof lkv) {
            return (lkv) lla;
        }
        return new lkv(lla);
    }
}
