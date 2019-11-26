package defpackage;

/* renamed from: qzh */
public final class qzh extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzh zzrzz = new qzh();
    public int zzrzm;
    public qyu zzrzw;
    public int zzrzx;
    public int zzrzy;

    private qzh() {
    }

    public final qyu a() {
        qyu qyu = this.zzrzw;
        return qyu == null ? qyu.zzryy : qyu;
    }

    public final qyx b() {
        qyx a = qyx.a(this.zzrzx);
        return a == null ? qyx.UNRECOGNIZED : a;
    }

    public final rab aW_() {
        rab a = rab.a(this.zzrzm);
        return a == null ? rab.UNRECOGNIZED : a;
    }

    public final Object a(int i) {
        switch (qzj.a[i - 1]) {
            case 1:
                return new qzh();
            case 2:
                return new qzk();
            case 3:
                return reu.a((rgh) zzrzz, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzrzw", "zzrzx", "zzrzy", "zzrzm"});
            case 4:
                return zzrzz;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzh.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrzz);
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
        reu.a(qzh.class, zzrzz);
    }
}
