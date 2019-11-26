package defpackage;

/* renamed from: qwe */
public final class qwe extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qwe zzrwp = new qwe();
    public int zzrwm;
    public qwk zzrwn;
    public qyj zzrwo;

    private qwe() {
    }

    public final qwk a() {
        qwk qwk = this.zzrwn;
        return qwk == null ? qwk.zzrwv : qwk;
    }

    public final qyj b() {
        qyj qyj = this.zzrwo;
        return qyj == null ? qyj.zzryq : qyj;
    }

    public static qwd aU_() {
        return (qwd) ((ret) zzrwp.a(5));
    }

    public final Object a(int i) {
        switch (qwg.a[i - 1]) {
            case 1:
                return new qwe();
            case 2:
                return new qwd();
            case 3:
                return reu.a((rgh) zzrwp, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzrwm", "zzrwn", "zzrwo"});
            case 4:
                return zzrwp;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qwe.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrwp);
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
        reu.a(qwe.class, zzrwp);
    }
}
