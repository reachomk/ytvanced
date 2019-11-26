package defpackage;

/* renamed from: qyp */
public final class qyp extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qyp zzryu = new qyp();
    public int zzrys;
    public int zzryt;

    private qyp() {
    }

    public final qyh a() {
        qyh a = qyh.a(this.zzrys);
        return a == null ? qyh.UNRECOGNIZED : a;
    }

    public final Object a(int i) {
        switch (qyr.a[i - 1]) {
            case 1:
                return new qyp();
            case 2:
                return new qys();
            case 3:
                return reu.a((rgh) zzryu, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzrys", "zzryt"});
            case 4:
                return zzryu;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qyp.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzryu);
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
        reu.a(qyp.class, zzryu);
    }
}
