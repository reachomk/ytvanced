package defpackage;

/* renamed from: aeng */
public final class aeng implements aenf {
    private final aell a;

    public aeng(aell aell) {
        this.a = aell;
    }

    public final ovm a(ovm ovm) {
        aell aell = this.a;
        if (aell != null) {
            aepg b = aell.b(ovm.a.getHost());
            if (b != null) {
                xvo a = xvo.a(ovm.a.buildUpon().authority(b.a).build());
                String str = "ohrtt";
                a.a(str);
                int i = b.b;
                if (i > 0) {
                    a.b(str, Integer.toString(i));
                }
                a.b("retry", "1");
                return ovm.a(a.a());
            }
        }
        return null;
    }
}
