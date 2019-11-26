package defpackage;

/* renamed from: qxb */
public final class qxb extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxb zzrxe = new qxb();
    public int zzrwm;
    public rdg zzrwu = rdg.a;

    private qxb() {
    }

    public static qxe a() {
        return (qxe) ((ret) zzrxe.a(5));
    }

    public final Object a(int i) {
        switch (qxd.a[i - 1]) {
            case 1:
                return new qxb();
            case 2:
                return new qxe();
            case 3:
                return reu.a((rgh) zzrxe, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzrwm", "zzrwu"});
            case 4:
                return zzrxe;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxb.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxe);
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
        reu.a(qxb.class, zzrxe);
    }
}
