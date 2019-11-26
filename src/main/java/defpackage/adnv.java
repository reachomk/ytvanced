package defpackage;

/* renamed from: adnv */
final class adnv implements xcp {
    private final /* synthetic */ adnt a;

    adnv(adnt adnt) {
        this.a = adnt;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adnz.class};
        } else if (i == 0) {
            Enum enumR;
            adnz adnz = (adnz) obj;
            adnt adnt = this.a;
            if (adnz.a) {
                enumR = adnw.REMOTE;
            } else {
                enumR = adnw.LOCAL;
            }
            adnt.a(enumR);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
