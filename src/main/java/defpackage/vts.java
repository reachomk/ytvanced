package defpackage;

/* renamed from: vts */
public final class vts implements aaoy {
    private final bcaa a;

    public vts(bcaa bcaa) {
        this.a = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(aapb aapb) {
        vnx vnx = (vnx) this.a.get();
        aapb.v = aali.b(vnx.a.d());
        aapb.r = vnx.a();
        aapb.t = vnx.b.k();
        airt airt = vnx.e;
        synchronized (airt) {
            aapb.u = airt.d();
            if (airt.g() != null) {
                aapb.s = airt.g().a.i;
            }
        }
        xpt xpt = vnx.d;
        if (xpt != null) {
            aapb.q = xpt.b();
        }
    }
}
