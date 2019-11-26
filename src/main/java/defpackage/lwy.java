package defpackage;

/* renamed from: lwy */
public final class lwy implements xcp {
    private final acwa a;

    public lwy(acwa acwa) {
        this.a = acwa;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vpj.class};
        } else if (i == 0) {
            acxf acvs = new acvs(((vpj) obj).a.a());
            acvx t = this.a.t();
            if (t != null) {
                t.a(acvs);
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
