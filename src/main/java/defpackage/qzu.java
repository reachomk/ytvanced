package defpackage;

/* renamed from: qzu */
public final class qzu extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final qzu zzsag = new qzu();
    public String zzsaf = "";

    private qzu() {
    }

    public final Object a(int i) {
        switch (qzw.a[i - 1]) {
            case 1:
                return new qzu();
            case 2:
                return new qzt();
            case 3:
                return reu.a((rgh) zzsag, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzsaf"});
            case 4:
                return zzsag;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (qzu.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsag);
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
        reu.a(qzu.class, zzsag);
    }
}
