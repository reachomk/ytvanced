package defpackage;

/* renamed from: qye */
public final class qye extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qye zzryc = new qye();
    public int zzrxz;
    public int zzrya;
    public rdg zzryb = rdg.a;

    private qye() {
    }

    public final qyf a() {
        qyf a = qyf.a(this.zzrxz);
        return a == null ? qyf.UNRECOGNIZED : a;
    }

    public final qyh b() {
        qyh a = qyh.a(this.zzrya);
        return a == null ? qyh.UNRECOGNIZED : a;
    }

    public final Object a(int i) {
        switch (qyg.a[i - 1]) {
            case 1:
                return new qye();
            case 2:
                return new qyd();
            case 3:
                return reu.a((rgh) zzryc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzrxz", "zzrya", "zzryb"});
            case 4:
                return zzryc;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qye.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzryc);
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
        reu.a(qye.class, zzryc);
    }
}
