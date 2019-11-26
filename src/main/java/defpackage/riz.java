package defpackage;

/* renamed from: riz */
public final class riz extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final riz zzuup = new riz();
    public int zzbfv;
    public String zzffc = "";
    public rfb zzuuj = rde.b;
    public rff zzuuk = rfw.b;
    public rfi zzuul = rgv.b;
    public rfi zzuum = rgv.b;
    public rdg zzuun = rdg.a;
    public rfe zzuuo = rec.b;

    private riz() {
    }

    public final Object a(int i) {
        switch (rjd.a[i - 1]) {
            case 1:
                return new riz();
            case 2:
                return new rjc();
            case 3:
                return reu.a((rgh) zzuup, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0005\u0000\u0001\b\u0000\u0002\u0019\u0003\u0014\u0004\u001a\u0005\u001b\u0006\n\u0001\u0007\u0012", new Object[]{"zzbfv", "zzffc", "zzuuj", "zzuuk", "zzuul", "zzuum", rjb.class, "zzuun", "zzuuo"});
            case 4:
                return zzuup;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (riz.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzuup);
                            zzbei = obj;
                        }
                    }
                }
                return obj;
            case 6:
                return Byte.valueOf((byte) 1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        reu.a(riz.class, zzuup);
    }
}
