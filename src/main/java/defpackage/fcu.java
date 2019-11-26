package defpackage;

/* renamed from: fcu */
final class fcu implements xcp {
    private final /* synthetic */ fcs a;

    fcu(fcs fcs) {
        this.a = fcs;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        fcs fcs;
        if (i == -1) {
            return new Class[]{gzv.class, vow.class};
        } else if (i == 0) {
            gzv gzv = (gzv) obj;
            fcs = this.a;
            fcs.a(gzv.a, fcs.c);
            return null;
        } else if (i == 1) {
            vow vow = (vow) obj;
            fcs = this.a;
            fcx fcx = fcs.b;
            auuc auuc = fcx.a;
            if (auuc != null) {
                fcx.a = null;
                aaga aaga = vow.a;
                vra vra = vow.b;
                if (aaga != null) {
                    if (aaga.p()) {
                    }
                }
            }
            auuc = null;
            fcs.b(auuc, this.a.c);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
