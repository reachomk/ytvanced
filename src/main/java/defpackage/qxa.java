package defpackage;

/* renamed from: qxa */
public final class qxa extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxa zzrxd = new qxa();
    public int zzrwy;

    private qxa() {
    }

    public final Object a(int i) {
        switch (qxc.a[i - 1]) {
            case 1:
                return new qxa();
            case 2:
                return new qwz();
            case 3:
                return reu.a((rgh) zzrxd, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzrwy"});
            case 4:
                return zzrxd;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxa.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxd);
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
        reu.a(qxa.class, zzrxd);
    }
}
