package defpackage;

/* renamed from: rji */
public final class rji extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rji zzwkt = new rji();
    public int zzbfv;
    public int zzwkr = -1;
    public int zzwks;

    private rji() {
    }

    public final Object a(int i) {
        switch (rjl.a[i - 1]) {
            case 1:
                return new rji();
            case 2:
                return new rjh();
            case 3:
                return reu.a((rgh) zzwkt, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbfv", "zzwkr", rjj.a, "zzwks", rjk.a});
            case 4:
                return zzwkt;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rji.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzwkt);
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
        reu.a(rji.class, zzwkt);
    }
}
