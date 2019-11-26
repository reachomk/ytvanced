package defpackage;

/* renamed from: qyz */
public final class qyz extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qyz zzrzn = new qyz();
    public String zzryv = "";
    public rdg zzryw = rdg.a;
    public int zzrzm;

    private qyz() {
    }

    public final Object a(int i) {
        switch (qzb.a[i - 1]) {
            case 1:
                return new qyz();
            case 2:
                return new qzc();
            case 3:
                return reu.a((rgh) zzrzn, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzryv", "zzryw", "zzrzm"});
            case 4:
                return zzrzn;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qyz.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrzn);
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
        reu.a(qyz.class, zzrzn);
    }
}
