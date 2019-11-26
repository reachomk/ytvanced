package defpackage;

/* renamed from: qwu */
public final class qwu extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwu zzrxb = new qwu();
    public int zzrwm;
    public rdg zzrwu = rdg.a;
    public qxa zzrxa;

    private qwu() {
    }

    public final qxa a() {
        qxa qxa = this.zzrxa;
        return qxa == null ? qxa.zzrxd : qxa;
    }

    public final Object a(int i) {
        switch (qww.a[i - 1]) {
            case 1:
                return new qwu();
            case 2:
                return new qwt();
            case 3:
                return reu.a((rgh) zzrxb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzrwm", "zzrxa", "zzrwu"});
            case 4:
                return zzrxb;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwu.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxb);
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
        reu.a(qwu.class, zzrxb);
    }
}
