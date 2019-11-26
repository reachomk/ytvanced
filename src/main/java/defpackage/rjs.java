package defpackage;

/* renamed from: rjs */
public final class rjs extends reu implements rgj {
    public static volatile rgu zzbei;
    public static final rjs zzwou = new rjs();
    public rfi zzwot = rgv.b;

    private rjs() {
    }

    public final Object a(int i) {
        switch (rjw.a[i - 1]) {
            case 1:
                return new rjs();
            case 2:
                return new rjr();
            case 3:
                return reu.a((rgh) zzwou, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzwot", rju.class});
            case 4:
                return zzwou;
            case 5:
                Object obj = zzbei;
                if (obj == null) {
                    synchronized (rjs.class) {
                        obj = zzbei;
                        if (obj == null) {
                            obj = new rew(zzwou);
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
        reu.a(rjs.class, zzwou);
    }
}
