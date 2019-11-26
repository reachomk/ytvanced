package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aety */
public final class aety implements aeuy {
    public final Queue a = new ArrayDeque();
    public final oye b;
    public final long c;
    public aeuy d;
    private boolean f;
    private boolean g;

    public aety(oye oye) {
        this.b = oye;
        this.c = oye.a();
    }

    public final void j() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeub(this));
        } else {
            aeuy.j();
        }
    }

    public final void k() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeua(this));
        } else {
            aeuy.k();
        }
    }

    public final void b(int i) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeun(this, i));
        } else {
            aeuy.b(i);
        }
    }

    public final void c(int i) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuo(this, i));
        } else {
            aeuy.c(i);
        }
    }

    public final void a() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeur(this));
        } else {
            aeuy.a();
        }
    }

    public final void b() {
        throw new IllegalStateException("Early Media Prep tried to emit onLoaded() event");
    }

    public final void c() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuq(this));
            this.a.add(new aeut(this));
            return;
        }
        this.f = true;
        aeuy.c();
    }

    public final void d() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeus(this));
            return;
        }
        if (this.f) {
            aeuy.d();
        }
    }

    public final void e() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuv(this));
        } else {
            aeuy.e();
        }
    }

    public final void f() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuu(this));
        } else {
            aeuy.f();
        }
    }

    public final void a(afif afif) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeud(this, afif));
        } else {
            aeuy.a(afif);
        }
    }

    public final void a(long j) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuc(this, j));
        } else {
            aeuy.a(j);
        }
    }

    public final void b(long j) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuf(this, j));
        } else {
            aeuy.b(j);
        }
    }

    public final void g() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeue(this));
        } else if (!this.g || this.f) {
            this.g = true;
            aeuy.g();
        }
    }

    public final void h() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuh(this));
        } else if (this.f) {
            aeuy.h();
        } else {
            g();
        }
    }

    public final void i() {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeug(this));
        } else {
            aeuy.i();
        }
    }

    public final void a(aetv aetv) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuj(this, aetv));
        } else {
            aeuy.a(aetv);
        }
    }

    public final void a(int i) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeui(this, i));
        } else {
            aeuy.a(i);
        }
    }

    public final void a(long j, long j2) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeul(this, j, j2));
        } else {
            aeuy.a(j, j2);
        }
    }

    public final void a(float f) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeuk(this, f));
        } else {
            aeuy.a(f);
        }
    }

    public final void a(String str, aevf aevf) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeum(this, str, aevf));
        } else {
            aeuy.a(str, aevf);
        }
    }

    public final void a(aett aett) {
        aeuy aeuy = this.d;
        if (aeuy == null) {
            this.a.add(new aeup(this, aett));
        } else {
            aeuy.a(aett);
        }
    }
}
