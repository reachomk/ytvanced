package defpackage;

/* renamed from: adrc */
final class adrc implements xcp {
    private final /* synthetic */ adqx a;

    adrc(adqx adqx) {
        this.a = adqx;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((xgg) obj).a) {
            adqx adqx = this.a;
            if (!adqx.g || adqx.c.e()) {
                xtl.c(adqx.a, "network connectivity restored: continuing with recovery");
                this.a.e.removeMessages(1);
                this.a.e.sendEmptyMessage(1);
                return null;
            }
        }
        return clsArr;
    }
}
