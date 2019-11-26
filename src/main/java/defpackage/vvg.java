package defpackage;

/* renamed from: vvg */
final /* synthetic */ class vvg implements bcvk {
    private final vvh a;

    vvg(vvh vvh) {
        this.a = vvh;
    }

    public final void a(Object obj) {
        Object obj2;
        vvh vvh = this.a;
        ahjn ahjn = (ahjn) obj;
        vvh.a.get();
        vxf vxf = vvh.d;
        Object obj3 = 1;
        boolean z = ahjn.a == airc.REMOTE;
        vye c = vxf.c();
        if (c.a() == z) {
            obj2 = null;
        } else {
            vxf.a(vye.b().a(c.a()).a(z).a());
            obj2 = 1;
        }
        vvh.b.get();
        vxf vxf2 = vvh.d;
        boolean z2 = ahjn.b == airc.FULLSCREEN;
        vxg g = vxf2.g();
        Object obj4;
        if (g.e() != z2) {
            vxf2.a(g.b().b(z2).a());
            obj4 = 1;
        } else {
            obj4 = null;
        }
        vvh.c.get();
        vxf vxf3 = vvh.d;
        boolean z3 = ahjn.b == airc.FULLSCREEN;
        vya h = vxf3.h();
        Object obj5;
        if (h.e() != z3) {
            vxf3.a(h.i().e(z3).a());
            obj5 = 1;
        } else {
            obj5 = null;
        }
        vvh.e.get();
        vxf vxf4 = vvh.d;
        boolean z4 = ahjn.b == airc.FULLSCREEN;
        vyg b = vxf4.b();
        if (b.k() != z4) {
            vxf4.a(b.q().c(z4).a());
        } else {
            obj3 = null;
        }
        if (obj2 != null || obj4 != null || obj5 != null || obj3 != null) {
            vvh.h();
        }
    }
}
