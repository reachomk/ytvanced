package defpackage;

/* renamed from: vvi */
final /* synthetic */ class vvi implements bcvk {
    private final vvh a;

    vvi(vvh vvh) {
        this.a = vvh;
    }

    public final void a(Object obj) {
        vvh vvh = this.a;
        ahkm ahkm = (ahkm) obj;
        if (vvh.h && !vvh.g) {
            int i = (int) ahkm.a;
            int i2 = (int) ahkm.d;
            vvh.d.a(i);
            vvh.d.c(i2);
            vvh.d.b((int) ahkm.e);
            if (vvh.f) {
                vyg a;
                vxf vxf = vvh.d;
                vxf.a(vxf.d().b().a(i2 - i).a());
                vxf = vvh.d;
                vvr vvr = (vvr) vvh.e.get();
                vyg b = vvh.d.b();
                vyj q = b.q();
                q.c(vvr.i - i);
                if (b.d() != 0) {
                    a = q.a();
                } else {
                    int i3 = vvr.h - i;
                    if (i3 > 0) {
                        q.b(i3);
                    } else if (b.d() == 0) {
                        q.a(1).b(0);
                        vvr.a.b();
                        vvr.c.d(new voy(1, vvr.f));
                    }
                    a = q.a();
                }
                vxf.a(a);
            }
            vvh.h();
        }
    }
}
