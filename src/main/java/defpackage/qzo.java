package defpackage;

/* renamed from: qzo */
public final class qzo extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzo zzsac = new qzo();
    public String zzryv = "";
    public int zzrzm;
    public int zzrzx;
    public int zzrzy;

    private qzo() {
    }

    public final Object a(int i) {
        switch (qzq.a[i - 1]) {
            case 1:
                return new qzo();
            case 2:
                return new qzn();
            case 3:
                return reu.a((rgh) zzsac, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzryv", "zzrzx", "zzrzy", "zzrzm"});
            case 4:
                return zzsac;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzo.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsac);
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
        reu.a(qzo.class, zzsac);
    }
}
