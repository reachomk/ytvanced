package defpackage;

import java.util.List;

/* renamed from: sli */
final class sli extends cma {
    @cue(a = 6)
    public List a;
    @cue(a = 13)
    public bdgl b;
    @cue(a = 13)
    public swf c;
    @cue(a = 13)
    public swk d;
    @cue(a = 13)
    private bbmz e;
    @cue(a = 13)
    private swp f;
    @cue(a = 13)
    private sns g;

    public sli() {
        super("Collection");
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(csq csq) {
        if (csq != null) {
            this.e = (bbmz) csq.a(bbmz.class);
            this.f = (swp) csq.a(swp.class);
            this.g = (sns) csq.a(sns.class);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final cma b(cmg cmg) {
        sns sns = this.g;
        swp swp = this.f;
        bbmz bbmz = this.e;
        swk swk = this.d;
        bdgl bdgl = this.b;
        List list = this.a;
        swf swf = this.c;
        cxi a = cxf.a();
        a.c = bdgl.c != 1 ? 1 : 0;
        int i = bdgl.f;
        int i2 = i - 1;
        if (i != 0) {
            a.d = i2 != 1 ? aocf.UNSET_ENUM_VALUE : Integer.MAX_VALUE;
            a.e = swk.g();
            cxv a2 = a.a();
            cxo h = cxm.h(cmg);
            cwj cwj = new cwj(cmg);
            slq slq = new slq();
            slq.a(cwj, new sln());
            slq.b.m = swk;
            slq.c.set(2);
            slq.b.o = sns;
            slq.c.set(4);
            slq.b.n = swp;
            slq.c.set(3);
            slq.b.l = bbmz;
            slq.c.set(1);
            slq.b.p = bdgl.b;
            slq.c.set(5);
            slq.b.k = list;
            slq.c.set(0);
            h.a(slq.b());
            h.a();
            h.a(a2);
            h.g();
            bdgy bdgy = bdgl.d;
            if (bdgy != null) {
                bdhb bdhb = bdgy.g;
                if (bdhb != null) {
                    h.v(bdhb.a);
                    h.w(bdgy.g.a);
                }
                bdhb = bdgy.h;
                if (bdhb != null) {
                    h.x(bdhb.a);
                    h.u(bdgy.h.a);
                }
                bdhb = bdgy.b;
                if (bdhb != null) {
                    h.v(bdhb.a);
                }
                bdhb = bdgy.a;
                if (bdhb != null) {
                    h.x(bdhb.a);
                }
                bdhb = bdgy.d;
                if (bdhb != null) {
                    h.w(bdhb.a);
                }
                bdhb bdhb2 = bdgy.c;
                if (bdhb2 != null) {
                    h.u(bdhb2.a);
                }
                h.b();
            }
            if (bdgl.e != null) {
                h.a(new slr(swf, bdgl));
            }
            return (cxm) h.c();
        }
        throw null;
    }
}
