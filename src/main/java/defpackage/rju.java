package defpackage;

/* renamed from: rju */
public final class rju extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rju zzwoy = new rju();
    public int zzbfv;
    public int zzvbc;
    public String zzwov = "";
    public long zzwow;
    public long zzwox;

    private rju() {
    }

    public final Object a(int i) {
        switch (rjw.a[i - 1]) {
            case 1:
                return new rju();
            case 2:
                return new rjt();
            case 3:
                return reu.a((rgh) zzwoy, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbfv", "zzvbc", "zzwov", "zzwow", "zzwox"});
            case 4:
                return zzwoy;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rju.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzwoy);
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
        reu.a(rju.class, zzwoy);
    }
}
