package defpackage;

/* renamed from: qxo */
public final class qxo extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qxo zzrxn = new qxo();
    public qyz zzrxm;

    private qxo() {
    }

    public final qyz a() {
        qyz qyz = this.zzrxm;
        return qyz == null ? qyz.zzrzn : qyz;
    }

    public final Object a(int i) {
        switch (qxq.a[i - 1]) {
            case 1:
                return new qxo();
            case 2:
                return new qxn();
            case 3:
                return reu.a((rgh) zzrxn, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzrxm"});
            case 4:
                return zzrxn;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qxo.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrxn);
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
        reu.a(qxo.class, zzrxn);
    }
}
