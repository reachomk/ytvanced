package defpackage;

/* renamed from: adgv */
final class adgv implements xcp {
    private final /* synthetic */ adgt a;

    adgv(adgt adgt) {
        this.a = adgt;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xgg.class};
        } else if (i == 0) {
            this.a.a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
