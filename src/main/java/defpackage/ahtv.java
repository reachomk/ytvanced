package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* renamed from: ahtv */
public final class ahtv extends ahor implements ahpv, ahru, ahrw, ahrx, ahsc, ahsd {
    public final Handler a = new Handler(Looper.getMainLooper());
    public ahmt b;
    public ahtp c;
    public ahvd e;
    public ahrl f;
    public aibe g;
    public aihy h;
    public aiff i;
    public boolean j;
    public boolean k;
    public ahqn m;
    public boolean n;
    public boolean o;
    public boolean p;
    private final ahou q;
    private final ahou r;
    private final ahou s;
    private final ahmo t = new ahmo();
    private final ahry u;
    private final ahrt v;
    private long w;
    private boolean x;
    private boolean y;

    public final void g() {
        boolean z = true;
        boolean z2 = this.v.h() || !(!this.k || this.x || this.j || this.p || this.v.i());
        this.o = z2;
        Iterator it = iterator();
        while (it.hasNext()) {
            ((ahqb) it.next()).m_(this.o);
        }
        this.b.m_(this.j ^ 1);
        this.v.c();
        this.c.a(this.v.h);
        ahrl ahrl = this.f;
        boolean z3 = this.o;
        if (!(z3 || this.y)) {
            z = false;
        }
        ahrl.l = z;
        this.v.c(z3);
    }

    public final boolean f() {
        return super.f() || this.o;
    }

    public final void m_(boolean z) {
        this.l = z;
    }

    public final void a(boolean z, ahnj ahnj) {
        boolean f = f(ahnj);
        if (!z || f) {
            super.a(z, ahnj);
        }
    }

    public final void e(ahnj ahnj) {
        Iterator it = this.v.c.iterator();
        while (it.hasNext()) {
            if (((ahqb) it.next()).f(ahnj)) {
                break;
            }
        }
        if (!this.q.a(ahnj).a()) {
            this.n = true;
        }
        int i = this.x ^ 1;
        this.x = i;
        if (i != 0) {
            this.w = ahnj.b + 2500;
        }
        g();
        super.e(ahnj);
    }

    public final void bd_() {
        super.bd_();
        this.u.b((ahsd) this);
        this.u.b((ahsc) this);
    }

    public final boolean b(ahnj ahnj) {
        boolean z = false;
        if (!by_()) {
            if (this.m == ahqn.FULL_SPHERICAL || !this.k) {
                z = true;
            } else if (this.r.a(ahnj).a()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final boolean c(ahnj ahnj) {
        boolean z = false;
        if (f() && this.k) {
            if (this.m != ahqn.RECTANGULAR) {
                z = true;
            } else if (this.s.a(ahnj).a()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public final void d(ahnj ahnj) {
        boolean z;
        boolean z2 = false;
        if (this.n) {
            this.u.a(ahnj);
            this.n = false;
        }
        if (!f() && (f(ahnj) || this.v.i())) {
            this.w = ahnj.b + 2500;
        } else if (!f()) {
            z = this.x && this.w > ahnj.b;
            this.x = z;
            g();
        }
        z = this.q.a(ahnj).a();
        ahmo ahmo = this.t;
        if (!f() && z) {
            z2 = true;
        }
        ahmo.a(z2, ahnj.b);
        this.u.a(this.t.a() * 0.66f);
        super.d(ahnj);
    }

    public final void h() {
        this.a.post(new ahtu(this));
        g();
        i();
        this.k = true;
    }

    public final void i() {
        this.k = true;
        this.e.a(2);
        this.p = false;
        this.x = false;
        g();
    }

    public final void a(ahqn ahqn) {
        this.m = ahqn;
        this.c.c.m_(ahqn != ahqn.RECTANGULAR);
    }

    public final void a(float f, float f2) {
        this.s.a(f, f2);
        this.r.a(f, f2);
    }

    public final boolean b() {
        return this.o;
    }

    public final boolean a(ahnj ahnj) {
        return !f() && this.q.a(ahnj).a();
    }

    public final void c() {
        g();
    }

    public final void d() {
        g();
    }

    public final void e() {
        this.y = true;
        g();
    }

    public final void a(String str, String str2) {
        this.f.a(str);
        this.f.b(str2);
        this.y = false;
    }

    /* synthetic */ ahtv(ahry ahry, ahrt ahrt) {
        this.v = (ahrt) amqw.a((Object) ahrt);
        this.u = (ahry) amqw.a((Object) ahry);
        this.q = new ahou((ahpn) ahry.c.clone(), 40.0f, 30.0f);
        this.r = new ahou((ahpn) ahry.c.clone(), ahry.j, ahry.k);
        this.s = new ahou((ahpn) ahry.c.clone(), ahry.j, ahry.k);
    }
}
