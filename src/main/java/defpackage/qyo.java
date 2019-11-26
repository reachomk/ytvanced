package defpackage;

/* renamed from: qyo */
public final class qyo extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qyo zzryr = new qyo();
    public int zzrww;
    public qyp zzryp;

    private qyo() {
    }

    public final qyp a() {
        qyp qyp = this.zzryp;
        return qyp == null ? qyp.zzryu : qyp;
    }

    public final Object a(int i) {
        switch (qyq.a[i - 1]) {
            case 1:
                return new qyo();
            case 2:
                return new qyn();
            case 3:
                return reu.a((rgh) zzryr, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzryp", "zzrww"});
            case 4:
                return zzryr;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qyo.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzryr);
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
        reu.a(qyo.class, zzryr);
    }
}
