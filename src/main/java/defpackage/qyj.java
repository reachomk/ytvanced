package defpackage;

/* renamed from: qyj */
public final class qyj extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qyj zzryq = new qyj();
    public int zzrwm;
    public rdg zzrwu = rdg.a;
    public qyp zzryp;

    private qyj() {
    }

    public final qyp a() {
        qyp qyp = this.zzryp;
        return qyp == null ? qyp.zzryu : qyp;
    }

    public static qym b() {
        return (qym) ((ret) zzryq.a(5));
    }

    public final Object a(int i) {
        switch (qyl.a[i - 1]) {
            case 1:
                return new qyj();
            case 2:
                return new qym();
            case 3:
                return reu.a((rgh) zzryq, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzrwm", "zzryp", "zzrwu"});
            case 4:
                return zzryq;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qyj.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzryq);
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
        reu.a(qyj.class, zzryq);
    }
}
