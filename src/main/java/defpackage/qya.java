package defpackage;

/* renamed from: qya */
public final class qya extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qya zzrxy = new qya();
    public int zzrwm;
    public qxu zzrxo;
    public rdg zzrxw = rdg.a;
    public rdg zzrxx = rdg.a;

    private qya() {
    }

    public final qxu a() {
        qxu qxu = this.zzrxo;
        return qxu == null ? qxu.zzrxt : qxu;
    }

    public final Object a(int i) {
        switch (qyc.a[i - 1]) {
            case 1:
                return new qya();
            case 2:
                return new qxz();
            case 3:
                return reu.a((rgh) zzrxy, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzrwm", "zzrxo", "zzrxw", "zzrxx"});
            case 4:
                return zzrxy;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qya.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxy);
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
        reu.a(qya.class, zzrxy);
    }
}
