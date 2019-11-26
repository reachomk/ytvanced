package defpackage;

/* renamed from: qxg */
public final class qxg extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxg zzrxf = new qxg();
    public int zzrww;

    private qxg() {
    }

    public static qxg a(rdg rdg) {
        return (qxg) reu.a(zzrxf, rdg);
    }

    public final Object a(int i) {
        switch (qxi.a[i - 1]) {
            case 1:
                return new qxg();
            case 2:
                return new qxf();
            case 3:
                return reu.a((rgh) zzrxf, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", new Object[]{"zzrww"});
            case 4:
                return zzrxf;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxg.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxf);
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
        reu.a(qxg.class, zzrxf);
    }
}
