package defpackage;

/* renamed from: agbc */
final class agbc implements agih {
    private final /* synthetic */ agak a;

    public final void a() {
        this.a.a(new agkv());
    }

    public final void b() {
        agak agak = this.a;
        agak.k.d(agak.L);
    }

    public final void c() {
        agak agak = this.a;
        agak.l.b(agak.L);
    }

    /* synthetic */ agbc(agak agak) {
        this.a = agak;
    }

    public final void a(String str, avsi avsi, int i, String str2) {
        agqy j = this.a.u.j(str);
        if (this.a.h.c() && (j == null || !j.i())) {
            avqv avqv = (avqv) avqw.B.createBuilder();
            avqv.a(str);
            avqv.c(2);
            avqv.a(avsi);
            avqv.e(i);
            if (str2 != null) {
                avqv.b(str2);
            }
            ((agps) this.a.j.get()).a((avqw) ((anxl) avqv.build()));
        }
        ((agpn) this.a.r.get()).a();
    }
}
