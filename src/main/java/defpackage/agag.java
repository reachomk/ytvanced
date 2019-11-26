package defpackage;

/* renamed from: agag */
final class agag implements agxk {
    public final /* synthetic */ afzs a;

    public final void a() {
        this.a.j.execute(new agaf(this));
    }

    public final void a(agqz agqz) {
    }

    public final void b() {
    }

    public final void b(agqz agqz) {
    }

    public final void c(agqz agqz) {
    }

    public final void f(agqz agqz) {
    }

    public final void d(agqz agqz) {
        if (agxj.a(agqz)) {
            this.a.j.execute(new agai(this, agqz));
        }
    }

    public final void e(agqz agqz) {
        if (agxj.a(agqz)) {
            String b = agxj.b(agqz.f);
            for (agdu agdu : this.a.s.c(b)) {
                if (agdu.b(agqz)) {
                    this.a.a(agdu.c());
                }
            }
            if (this.a.u.containsKey(b)) {
                ((agfi) this.a.k.get()).a(b, (agqf) this.a.u.remove(b));
                if (this.a.u.isEmpty()) {
                    afzs afzs = this.a;
                    String c = agxj.c(agqz.f);
                    String.valueOf(c).length();
                    afzs.i.a(new agle(c));
                }
            }
        }
    }

    /* synthetic */ agag(afzs afzs) {
        this.a = afzs;
    }

    public final void a(agqz agqz, int i, agqf agqf) {
        if (agxj.a(agqz)) {
            this.a.j.execute(new agah(this, agqz));
        }
    }
}
