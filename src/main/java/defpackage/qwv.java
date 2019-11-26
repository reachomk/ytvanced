package defpackage;

/* renamed from: qwv */
public final class qwv extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwv zzrxc = new qwv();
    public int zzrww;
    public qxa zzrxa;

    private qwv() {
    }

    public final qxa a() {
        qxa qxa = this.zzrxa;
        return qxa == null ? qxa.zzrxd : qxa;
    }

    public final Object a(int i) {
        switch (qwx.a[i - 1]) {
            case 1:
                return new qwv();
            case 2:
                return new qwy();
            case 3:
                return reu.a((rgh) zzrxc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzrxa", "zzrww"});
            case 4:
                return zzrxc;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwv.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxc);
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
        reu.a(qwv.class, zzrxc);
    }
}
