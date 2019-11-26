package defpackage;

/* renamed from: qwk */
public final class qwk extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwk zzrwv = new qwk();
    public int zzrwm;
    public qwp zzrwt;
    public rdg zzrwu = rdg.a;

    private qwk() {
    }

    public final qwp a() {
        qwp qwp = this.zzrwt;
        return qwp == null ? qwp.zzrwz : qwp;
    }

    public static qwj b() {
        return (qwj) ((ret) zzrwv.a(5));
    }

    public final Object a(int i) {
        switch (qwm.a[i - 1]) {
            case 1:
                return new qwk();
            case 2:
                return new qwj();
            case 3:
                return reu.a((rgh) zzrwv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzrwm", "zzrwt", "zzrwu"});
            case 4:
                return zzrwv;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwk.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrwv);
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
        reu.a(qwk.class, zzrwv);
    }
}
