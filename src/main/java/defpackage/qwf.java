package defpackage;

/* renamed from: qwf */
public final class qwf extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwf zzrws = new qwf();
    public qwl zzrwq;
    public qyo zzrwr;

    private qwf() {
    }

    public final qwl a() {
        qwl qwl = this.zzrwq;
        return qwl == null ? qwl.zzrwx : qwl;
    }

    public final qyo b() {
        qyo qyo = this.zzrwr;
        return qyo == null ? qyo.zzryr : qyo;
    }

    public static qwf a(rdg rdg) {
        return (qwf) reu.a(zzrws, rdg);
    }

    public final Object a(int i) {
        switch (qwh.a[i - 1]) {
            case 1:
                return new qwf();
            case 2:
                return new qwi();
            case 3:
                return reu.a((rgh) zzrws, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzrwq", "zzrwr"});
            case 4:
                return zzrws;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwf.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrws);
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
        reu.a(qwf.class, zzrws);
    }
}
