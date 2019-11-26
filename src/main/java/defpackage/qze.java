package defpackage;

/* renamed from: qze */
public final class qze extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qze zzrzs = new qze();
    public String zzryv;
    public String zzrzo;
    public int zzrzp;
    public boolean zzrzq;
    public String zzrzr;

    private qze() {
        String str = "";
        this.zzrzo = str;
        this.zzryv = str;
        this.zzrzr = str;
    }

    public final Object a(int i) {
        switch (qzg.a[i - 1]) {
            case 1:
                return new qze();
            case 2:
                return new qzd();
            case 3:
                return reu.a((rgh) zzrzs, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzrzo", "zzryv", "zzrzp", "zzrzq", "zzrzr"});
            case 4:
                return zzrzs;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qze.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzrzs);
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
        reu.a(qze.class, zzrzs);
    }
}
