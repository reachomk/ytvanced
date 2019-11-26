package defpackage;

import android.text.TextUtils;

/* renamed from: agdb */
final class agdb implements agxk {
    public final /* synthetic */ agci a;

    agdb(agci agci) {
        this.a = agci;
    }

    public final void b() {
    }

    public final void b(agqz agqz) {
    }

    public final void f(agqz agqz) {
    }

    public final void a() {
        this.a.k.execute(new agde(this));
    }

    public final void a(agqz agqz) {
        if (agxj.a(agqz)) {
            String b = agxj.b(agqz.f);
            agfi agfi = (agfi) this.a.m.get();
            agfi.a(b, agqz);
            agfi.a(b, agqf.ACTIVE);
            if (agfi.c.e(b) == 0) {
                agfi.c(b, this.a.a.a());
            }
            this.a.l(b);
            agdt agdt = (agdt) this.a.q.get();
            if (agdt.a().contains(b)) {
                this.a.a(agdt.b().b());
            }
            agdz agdz = (agdz) this.a.r.get();
            if (agdz.a().contains(b)) {
                this.a.a(agdz.b().a());
            }
        }
    }

    public final void c(agqz agqz) {
        String b = agxj.b(agqz.f);
        agci agci = this.a;
        String.valueOf(b).length();
        agci.j.a(new aglr(b));
    }

    public final void d(agqz agqz) {
        if (agxj.a(agqz)) {
            this.a.k.execute(new agdd(this, agqz));
        }
    }

    public final void e(agqz agqz) {
        if (agxj.a(agqz)) {
            String b = agxj.b(agqz.f);
            agdt agdt = (agdt) this.a.q.get();
            if (agdt.a().contains(b)) {
                agdw b2 = agdt.b();
                b2.b(agqz);
                this.a.a(b2.b());
            }
            agdz agdz = (agdz) this.a.r.get();
            if (agdz.a().contains(b)) {
                agec b3 = agdz.b();
                b3.b(agqz);
                this.a.a(b3.a());
            }
        }
    }

    public final void a(agqz agqz, int i, agqf agqf) {
        i = agxj.a(agqz.f);
        if (agxj.a(agqz)) {
            this.a.k.execute(new agdg(this, agqz, agqf));
        } else if (i == 2) {
            String b = agxj.b(agqz.f);
            if (!TextUtils.isEmpty(b)) {
                ((agfi) this.a.m.get()).k(b);
            }
        } else if (i == 5) {
            this.a.k.execute(new agdf(this, agqz, agqf));
        }
    }
}
