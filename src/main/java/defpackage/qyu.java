package defpackage;

/* renamed from: qyu */
public final class qyu extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qyu zzryy = new qyu();
    public String zzryv = "";
    public rdg zzryw = rdg.a;
    public int zzryx;

    private qyu() {
    }

    public final qyw a() {
        qyw a = qyw.a(this.zzryx);
        return a == null ? qyw.UNRECOGNIZED : a;
    }

    public static qyt b() {
        return (qyt) ((ret) zzryy.a(5));
    }

    public final Object a(int i) {
        switch (qyv.a[i - 1]) {
            case 1:
                return new qyu();
            case 2:
                return new qyt();
            case 3:
                return reu.a((rgh) zzryy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzryv", "zzryw", "zzryx"});
            case 4:
                return zzryy;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qyu.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzryy);
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
        reu.a(qyu.class, zzryy);
    }
}
