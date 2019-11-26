package defpackage;

/* renamed from: hbq */
final class hbq implements xcp {
    private final /* synthetic */ hbm a;

    hbq(hbm hbm) {
        this.a = hbm;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{hbc.class, ahkk.class};
        } else if (i == 0) {
            hbc hbc = (hbc) obj;
            hbm hbm = this.a;
            boolean z = hbc.a.b;
            hbm.f = z;
            if (hbc.d != hbm) {
                hbm.a.g.a(z);
            } else {
                hbm.a.a(z);
            }
            hbm = this.a;
            hbm.b.a(hbm.f);
            if (hbc.d != null) {
                hbm = this.a;
                hbm.d.a(hbm, hbm.f);
                return null;
            }
        } else if (i == 1) {
            ahkk ahkk = (ahkk) obj;
            hbg hbg = this.a.a;
            boolean z2 = ahkk.a;
            if (hbg.c) {
                hbg.d = z2;
                hbg.d();
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
