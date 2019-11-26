package defpackage;

/* renamed from: gnd */
final class gnd implements xcp {
    private final /* synthetic */ gmp a;

    gnd(gmp gmp) {
        this.a = gmp;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{uyw.class, zye.class};
        } else if (i == 0) {
            int ordinal = ((uyw) obj).a.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                if (this.a.an.a()) {
                    this.a.al.f();
                    this.a.ab.H_();
                } else {
                    this.a.X();
                }
            }
        } else if (i == 1) {
            CharSequence a;
            zye zye = (zye) obj;
            avls avls = zye.a;
            avkh avkh = zye.b;
            arml arml;
            if (avls != null) {
                if ((avls.a & 1) != 0) {
                    arml = avls.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                a = ajqy.a(arml);
            } else if (avkh == null) {
                a = null;
            } else {
                if ((avkh.a & 1) != 0) {
                    arml = avkh.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                a = ajqy.a(arml);
            }
            if (a != null) {
                xpr.a(this.a.M_(), a, 1);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
