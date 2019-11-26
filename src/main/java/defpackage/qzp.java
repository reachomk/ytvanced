package defpackage;

/* renamed from: qzp */
public final class qzp extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzp zzsae = new qzp();
    public int zzrwm;
    public qzu zzsad;

    private qzp() {
    }

    public final Object a(int i) {
        switch (qzr.a[i - 1]) {
            case 1:
                return new qzp();
            case 2:
                return new qzs();
            case 3:
                return reu.a((rgh) zzsae, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzrwm", "zzsad"});
            case 4:
                return zzsae;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzp.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsae);
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
        reu.a(qzp.class, zzsae);
    }
}
