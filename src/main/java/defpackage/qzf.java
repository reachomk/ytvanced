package defpackage;

/* renamed from: qzf */
public final class qzf extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzf zzrzv = new qzf();
    public int zzbfv;
    public int zzrzt;
    public rfi zzrzu = rgv.b;

    private qzf() {
    }

    public final int a() {
        return this.zzrzu.size();
    }

    public final Object a(int i) {
        switch (qzj.a[i - 1]) {
            case 1:
                return new qzf();
            case 2:
                return new qzi();
            case 3:
                return reu.a((rgh) zzrzv, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzbfv", "zzrzt", "zzrzu", qzh.class});
            case 4:
                return zzrzv;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzf.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrzv);
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
        reu.a(qzf.class, zzrzv);
    }
}
