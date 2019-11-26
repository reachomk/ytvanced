package defpackage;

/* renamed from: rix */
public final class rix extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rix zzuui = new rix();
    public int zzbfv;
    public boolean zzuue;
    public int zzuuf;
    public String zzuug = "";
    public rfi zzuuh = rgv.b;

    private rix() {
    }

    public final Object a(int i) {
        switch (rjd.a[i - 1]) {
            case 1:
                return new rix();
            case 2:
                return new rja();
            case 3:
                return reu.a((rgh) zzuui, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\u001b", new Object[]{"zzbfv", "zzuue", "zzuuf", "zzuug", "zzuuh", riz.class});
            case 4:
                return zzuui;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rix.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzuui);
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
        reu.a(rix.class, zzuui);
    }
}
