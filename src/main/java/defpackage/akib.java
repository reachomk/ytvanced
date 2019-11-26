package defpackage;

/* renamed from: akib */
public final /* synthetic */ class akib implements akie {
    private final boolean a;
    private final afnw b;
    private final sxd c;
    private final swf d;
    private final bbma e;
    private final akkq f;

    public akib(boolean z, afnw afnw, sxd sxd, swf swf, bbma bbma, akkq akkq) {
        this.a = z;
        this.b = afnw;
        this.c = sxd;
        this.d = swf;
        this.e = bbma;
        this.f = akkq;
    }

    public final clz a(cmg cmg, swk swk, bdhn bdhn, bdho bdho) {
        akhx akhx;
        boolean z = this.a;
        afnw afnw = this.b;
        sxd sxd = this.c;
        swf swf = this.d;
        bbma bbma = this.e;
        akkq akkq = this.f;
        if (z) {
            akhx akhx2 = new akhx(afnw, sxd, bdhn.f, bdhn.g, swf, bbma, bdhn.b);
        } else {
            akhx = null;
        }
        akic akic = new akic();
        akic.a(akic, cmg, new akhz());
        akic.a.e = bdhn.b;
        akic.d.set(0);
        akic.a.v = sxd;
        akic.d.set(4);
        akic.a.f = akkq;
        akic.d.set(1);
        akhz akhz = akic.a;
        akhz.b = akhx;
        akhz.u = bdhn.e;
        akic.d.set(3);
        if (bdho != null) {
            bdga bdga = (bdga) szb.a(bdho, bdga.a);
            if (bdga != null) {
                if ("primary_image".equals(bdga.d)) {
                    akic.a.a = Boolean.valueOf(true);
                }
            }
        }
        bdhi bdhi = bdhn.c;
        if (bdhi != null) {
            akic.a.c = bdhi;
        }
        bdhi = bdhn.d;
        if (bdhi != null) {
            akic.a.d = bdhi;
        }
        akic.a.g = swk.e();
        akic.d.set(2);
        return akic;
    }
}
