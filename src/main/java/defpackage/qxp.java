package defpackage;

/* renamed from: qxp */
public final class qxp extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxp zzrxp = new qxp();
    public qxu zzrxo;

    private qxp() {
    }

    public final qxu a() {
        qxu qxu = this.zzrxo;
        return qxu == null ? qxu.zzrxt : qxu;
    }

    public final Object a(int i) {
        switch (qxr.a[i - 1]) {
            case 1:
                return new qxp();
            case 2:
                return new qxs();
            case 3:
                return reu.a((rgh) zzrxp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzrxo"});
            case 4:
                return zzrxp;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxp.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxp);
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
        reu.a(qxp.class, zzrxp);
    }
}
