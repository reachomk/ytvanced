package defpackage;

/* renamed from: agay */
final class agay implements agfh {
    private final /* synthetic */ agak a;

    public final void a(aakj aakj) {
        avqc u = aakj.u();
        if (u != null) {
            long j = (long) u.c;
            long a = ((agvs) this.a.i.get()).a(this.a.L);
            if (j > 0 && (a == 0 || j < a)) {
                agak agak = this.a;
                agak.k.a(agak.L, j);
            }
            ((agpn) this.a.r.get()).a();
        }
    }

    public final void a() {
        agak agak = this.a;
        agak.k.d(agak.L);
    }

    public final void b() {
        agak agak = this.a;
        agak.l.a(agak.L, false);
    }

    /* synthetic */ agay(agak agak) {
        this.a = agak;
    }

    public final void a(String str, avsi avsi, int i) {
        if (this.a.h.c()) {
            avqv avqv = (avqv) avqw.B.createBuilder();
            avqv.a(str);
            avqv.c(2);
            avqv.a(true);
            avqv.a(avsi);
            avqv.e(1);
            ((agps) this.a.j.get()).a((avqw) ((anxl) avqv.build()));
        }
        ((agpn) this.a.r.get()).a();
    }
}
