package defpackage;

/* renamed from: edc */
public final class edc implements acxx {
    private final int a;

    public edc(int i) {
        this.a = i;
    }

    public final acxv a(acya acya) {
        acyi acyi = (acyi) acya;
        int k = acyi.c.k();
        boolean a = acyi.a.a();
        int i = this.a;
        if (i == 0) {
            return new edk(k, a);
        }
        if (i == 1) {
            return new edg(k, a);
        }
        if (i == 2) {
            return new ede(k, a);
        }
        if (i == 4) {
            return new edi(k, a);
        }
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append(i);
        stringBuilder.append(" type is not support");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
