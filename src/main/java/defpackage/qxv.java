package defpackage;

/* renamed from: qxv */
public final class qxv extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxv zzrxv = new qxv();
    public int zzrwm;
    public rdg zzrwu = rdg.a;
    public qya zzrxu;

    private qxv() {
    }

    public final qya a() {
        qya qya = this.zzrxu;
        return qya == null ? qya.zzrxy : qya;
    }

    public final Object a(int i) {
        switch (qxx.a[i - 1]) {
            case 1:
                return new qxv();
            case 2:
                return new qxy();
            case 3:
                return reu.a((rgh) zzrxv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzrwm", "zzrxu", "zzrwu"});
            case 4:
                return zzrxv;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxv.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxv);
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
        reu.a(qxv.class, zzrxv);
    }
}
