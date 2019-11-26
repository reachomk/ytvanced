package defpackage;

/* renamed from: qzv */
public final class qzv extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzv zzsai = new qzv();
    public int zzrwm;
    public raa zzsah;

    private qzv() {
    }

    public final raa a() {
        raa raa = this.zzsah;
        return raa == null ? raa.zzsal : raa;
    }

    public final Object a(int i) {
        switch (qzx.a[i - 1]) {
            case 1:
                return new qzv();
            case 2:
                return new qzy();
            case 3:
                return reu.a((rgh) zzsai, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzrwm", "zzsah"});
            case 4:
                return zzsai;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzv.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsai);
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
        reu.a(qzv.class, zzsai);
    }
}
