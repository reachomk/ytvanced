package defpackage;

/* renamed from: qxh */
public final class qxh extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxh zzrxg = new qxh();
    public int zzrwm;
    public rdg zzrwu = rdg.a;

    private qxh() {
    }

    public final Object a(int i) {
        switch (qxj.a[i - 1]) {
            case 1:
                return new qxh();
            case 2:
                return new qxk();
            case 3:
                return reu.a((rgh) zzrxg, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzrwm", "zzrwu"});
            case 4:
                return zzrxg;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxh.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxg);
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
        reu.a(qxh.class, zzrxg);
    }
}
