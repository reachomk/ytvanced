package defpackage;

/* renamed from: rad */
public final class rad extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rad zzsav = new rad();
    public int zzbfv;
    public String zzsat = "";
    public rfi zzsau = rgv.b;

    private rad() {
    }

    public static rag a() {
        return (rag) ((ret) zzsav.a(5));
    }

    public final Object a(int i) {
        switch (raf.a[i - 1]) {
            case 1:
                return new rad();
            case 2:
                return new rag();
            case 3:
                return reu.a((rgh) zzsav, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzbfv", "zzsat", "zzsau", qze.class});
            case 4:
                return zzsav;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rad.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzsav);
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
        reu.a(rad.class, zzsav);
    }
}
