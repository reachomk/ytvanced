package defpackage;

/* renamed from: rjg */
public final class rjg extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rjg zzuwi = new rjg();
    public int zzbfv;
    public int zzuwf;
    public String zzuwg;
    public String zzuwh;

    private rjg() {
        String str = "";
        this.zzuwg = str;
        this.zzuwh = str;
    }

    public final Object a(int i) {
        switch (rjl.a[i - 1]) {
            case 1:
                return new rjg();
            case 2:
                return new rjf();
            case 3:
                return reu.a((rgh) zzuwi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbfv", "zzuwf", "zzuwg", "zzuwh"});
            case 4:
                return zzuwi;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rjg.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzuwi);
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
        reu.a(rjg.class, zzuwi);
    }
}
