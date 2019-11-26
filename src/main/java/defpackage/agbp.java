package defpackage;

/* renamed from: agbp */
final class agbp implements agxk {
    private final /* synthetic */ agbo a;

    agbp(agbo agbo) {
        this.a = agbo;
    }

    public final void a() {
    }

    public final void a(agqz agqz) {
    }

    public final void b() {
    }

    public final void b(agqz agqz) {
    }

    public final void c(agqz agqz) {
    }

    public final void e(agqz agqz) {
    }

    public final void f(agqz agqz) {
    }

    public final void d(agqz agqz) {
        if (agxj.a(agqz)) {
            String b = agxj.b(agqz.f);
            agfi agfi = (agfi) this.a.c.get();
            xvd.a(b);
            agie a = agfi.h.a(b);
            if ((a != null ? a.c() : 0) == 0) {
                agqn a2 = this.a.a(b, null);
                if (a2 != null) {
                    long a3 = this.a.a.a();
                    agql agql = a2.a;
                    if (agql != null) {
                        agfi.a(b, agql.r(), a3, 0);
                    }
                    agql = a2.b;
                    if (agql != null) {
                        agfi.a(b, agql.r(), a3, 0);
                    }
                }
            }
        }
    }

    public final void a(agqz agqz, int i, agqf agqf) {
        if (agxj.a(agqz) && agqz.b == agrc.COMPLETED) {
            String b = agxj.b(agqz.f);
            agfi agfi = (agfi) this.a.c.get();
            xvd.a(b);
            agie a = agfi.h.a(b);
            if ((a != null ? a.d() : 0) == 0) {
                agqn a2 = this.a.a(b, null);
                if (a2 != null) {
                    long a3 = this.a.a.a();
                    agql agql = a2.a;
                    if (agql != null) {
                        agfi.a(b, agql.r(), 0, a3);
                    }
                    agql agql2 = a2.b;
                    if (agql2 != null) {
                        agfi.a(b, agql2.r(), 0, a3);
                    }
                }
            }
        }
    }
}
