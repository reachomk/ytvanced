package defpackage;

/* renamed from: raa */
public final class raa extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final raa zzsal = new raa();
    public String zzsaj = "";
    public qyz zzsak;

    private raa() {
    }

    public final qyz a() {
        qyz qyz = this.zzsak;
        return qyz == null ? qyz.zzrzn : qyz;
    }

    public final Object a(int i) {
        switch (rac.a[i - 1]) {
            case 1:
                return new raa();
            case 2:
                return new qzz();
            case 3:
                return reu.a((rgh) zzsal, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzsaj", "zzsak"});
            case 4:
                return zzsal;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (raa.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsal);
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
        reu.a(raa.class, zzsal);
    }
}
