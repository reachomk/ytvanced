package defpackage;

/* renamed from: vhe */
final /* synthetic */ class vhe implements bcvk {
    private final vhd a;

    vhe(vhd vhd) {
        this.a = vhd;
    }

    public final void a(Object obj) {
        vhd vhd = this.a;
        ahkm ahkm = (ahkm) obj;
        if (!vhd.h) {
            long j = ahkm.a;
            vhh vhh = (vhh) vhd.e.get();
            if (j >= vhh.a && j <= vhh.b) {
                vhd.h = true;
                vhd.a.a(vhd.c, vhd.d);
                for (vrx vrx : vhd.f) {
                    vhd.a.a(vhd.c, vhd.d, vsm.MID_ROLL, vrx);
                    vhd.a.a(vhd.d, vsm.MID_ROLL, vrx, vra.NO_AD, -1, -1);
                }
                vhd.a.b(vhd.c, vhd.d);
                try {
                    vhd.b();
                } catch (Exception unused) {
                }
            }
        }
    }
}
