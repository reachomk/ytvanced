package defpackage;

/* renamed from: rjb */
public final class rjb extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rjb zzuut = new rjb();
    public int zzbfv;
    public rfi zzuuh = rgv.b;
    public String zzuuq;
    public String zzuur;
    public rix zzuus;

    private rjb() {
        String str = "";
        this.zzuuq = str;
        this.zzuur = str;
    }

    public final Object a(int i) {
        switch (rjd.a[i - 1]) {
            case 1:
                return new rjb();
            case 2:
                return new rje();
            case 3:
                return reu.a((rgh) zzuut, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\t\u0002", new Object[]{"zzbfv", "zzuuq", "zzuur", "zzuuh", riz.class, "zzuus"});
            case 4:
                return zzuut;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rjb.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzuut);
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
        reu.a(rjb.class, zzuut);
    }
}
