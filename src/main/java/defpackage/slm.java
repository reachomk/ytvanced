package defpackage;

import java.util.List;

/* renamed from: slm */
final class slm extends cma {
    @cue(a = 6)
    public List a;
    @cue(a = 13)
    public baoo b;
    @cue(a = 13)
    public swf c;
    @cue(a = 13)
    public swk d;
    @cue(a = 13)
    private bbmz e;
    @cue(a = 13)
    private swp f;
    @cue(a = 13)
    private swz g;

    public slm() {
        super("CollectionFlat");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(csq csq) {
        if (csq != null) {
            this.e = (bbmz) csq.a(bbmz.class);
            this.f = (swp) csq.a(swp.class);
            this.g = (swz) csq.a(swz.class);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        swz swz = this.g;
        swp swp = this.f;
        bbmz bbmz = this.e;
        swk swk = this.d;
        baoo baoo = this.b;
        List list = this.a;
        swf swf = this.c;
        cxi a = cxf.a();
        int a2 = baoo.a(6);
        a.c = (a2 != 0 ? baoo.b.getInt(a2 + baoo.a) : 0) != 1 ? 1 : 0;
        a2 = baoo.a(26);
        a.d = (a2 != 0 ? baoo.b.getInt(a2 + baoo.a) : 0) != 1 ? aocf.UNSET_ENUM_VALUE : Integer.MAX_VALUE;
        a.e = swk.g();
        cxv a3 = a.a();
        cxo h = cxm.h(cmg);
        cwj cwj = new cwj(cmg);
        sls sls = new sls();
        sls.a(cwj, new slp());
        sls.b.n = swk;
        sls.c.set(3);
        sls.b.p = swz;
        sls.c.set(5);
        sls.b.o = swp;
        sls.c.set(4);
        sls.b.m = bbmz;
        sls.c.set(2);
        sls.b.l = baoo;
        sls.c.set(1);
        sls.b.k = list;
        sls.c.set(0);
        h.a(sls.b());
        h.a();
        h.a(a3);
        h.g();
        if (baoo.b() != null) {
            baot b = baoo.b();
            if (b.e() != null) {
                h.v(b.e().a());
                h.w(b.e().a());
            }
            if (b.f() != null) {
                h.x(b.f().a());
                h.u(b.f().a());
            }
            if (b.b() != null) {
                h.v(b.b().a());
            }
            if (b.a() != null) {
                h.x(b.a().a());
            }
            if (b.d() != null) {
                h.w(b.d().a());
            }
            if (b.c() != null) {
                h.u(b.c().a());
            }
            h.b();
        }
        if (baoo.c() != null) {
            h.a(new slo(baoo, swf));
        }
        return (cxm) h.c();
    }
}
