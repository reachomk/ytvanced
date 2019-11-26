package defpackage;

/* renamed from: qxu */
public final class qxu extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxu zzrxt = new qxu();
    public qye zzrxq;
    public qxo zzrxr;
    public int zzrxs;

    private qxu() {
    }

    public final qye a() {
        qye qye = this.zzrxq;
        return qye == null ? qye.zzryc : qye;
    }

    public final qxo b() {
        qxo qxo = this.zzrxr;
        return qxo == null ? qxo.zzrxn : qxo;
    }

    public final qxm aV_() {
        qxm a = qxm.a(this.zzrxs);
        return a == null ? qxm.UNRECOGNIZED : a;
    }

    public final Object a(int i) {
        switch (qxw.a[i - 1]) {
            case 1:
                return new qxu();
            case 2:
                return new qxt();
            case 3:
                return reu.a((rgh) zzrxt, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzrxq", "zzrxr", "zzrxs"});
            case 4:
                return zzrxt;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxu.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxt);
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
        reu.a(qxu.class, zzrxt);
    }
}
