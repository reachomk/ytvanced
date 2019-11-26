package defpackage;

/* renamed from: qwp */
public final class qwp extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwp zzrwz = new qwp();
    public int zzrwy;

    private qwp() {
    }

    public final Object a(int i) {
        switch (qwr.a[i - 1]) {
            case 1:
                return new qwp();
            case 2:
                return new qws();
            case 3:
                return reu.a((rgh) zzrwz, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzrwy"});
            case 4:
                return zzrwz;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwp.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrwz);
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
        reu.a(qwp.class, zzrwz);
    }
}
