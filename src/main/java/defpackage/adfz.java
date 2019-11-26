package defpackage;

/* renamed from: adfz */
final class adfz implements xcp {
    private final /* synthetic */ adfv a;

    adfz(adfv adfv) {
        this.a = adfv;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = false;
        adfv adfv;
        if (i == -1) {
            return new Class[]{adqk.class, adqr.class};
        } else if (i == 0) {
            adqe adqe = ((adqk) obj).a;
            adfv adfv2 = this.a;
            if (adqe != null && adqe.d() == 0) {
                z = true;
            }
            adfv2.p = z;
            adfv = this.a;
            boolean z2 = adfv.p;
            adfv.b();
            return null;
        } else if (i == 1) {
            adqr adqr = (adqr) obj;
            adfv = this.a;
            adfv.q = adqr.a;
            adfv.a(adfv.a());
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
