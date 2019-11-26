package defpackage;

/* renamed from: qzm */
public final class qzm extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzm zzsab = new qzm();
    public int zzbfv;
    public int zzrzt;
    public rfi zzsaa = rgv.b;

    private qzm() {
    }

    public final Object a(int i) {
        switch (qzq.a[i - 1]) {
            case 1:
                return new qzm();
            case 2:
                return new qzl();
            case 3:
                return reu.a((rgh) zzsab, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzbfv", "zzrzt", "zzsaa", qzo.class});
            case 4:
                return zzsab;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzm.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsab);
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
        reu.a(qzm.class, zzsab);
    }
}
