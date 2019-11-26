package defpackage;

/* renamed from: qwl */
public final class qwl extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwl zzrwx = new qwl();
    public qwp zzrwt;
    public int zzrww;

    private qwl() {
    }

    public final qwp a() {
        qwp qwp = this.zzrwt;
        return qwp == null ? qwp.zzrwz : qwp;
    }

    public final Object a(int i) {
        switch (qwn.a[i - 1]) {
            case 1:
                return new qwl();
            case 2:
                return new qwo();
            case 3:
                return reu.a((rgh) zzrwx, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzrwt", "zzrww"});
            case 4:
                return zzrwx;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwl.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrwx);
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
        reu.a(qwl.class, zzrwx);
    }
}
