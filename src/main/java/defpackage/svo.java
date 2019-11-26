package defpackage;

/* renamed from: svo */
public final /* synthetic */ class svo implements svn {
    private final sxd a;
    private final sxh b;

    public svo(sxd sxd, sxh sxh) {
        this.a = sxd;
        this.b = sxh;
    }

    public final clz a(cmg cmg, bdhn bdhn, bdho bdho) {
        sxd sxd = this.a;
        sxh sxh = this.b;
        svl svl = new svl();
        svl.a(svl, cmg, new svm());
        svl.a.d = bdhn.b;
        svl.d.set(0);
        svl.a.g = sxd;
        svl.d.set(2);
        bdhi bdhi = bdhn.c;
        if (bdhi != null) {
            svl.a.b = bdhi;
        }
        bdhi = bdhn.d;
        if (bdhi != null) {
            svl.a.c = bdhi;
        }
        if (sxh != null) {
            svl.a.e = sxh;
        }
        svl.a.f = bdhn.e;
        svl.d.set(1);
        if (bdho != null) {
            bdga bdga = (bdga) szb.a(bdho, bdga.a);
            if (bdga != null) {
                if ("primary_image".equals(bdga.d)) {
                    svl.a.a = Boolean.valueOf(true);
                }
            }
        }
        return svl;
    }
}
