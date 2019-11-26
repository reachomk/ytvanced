package defpackage;

/* renamed from: atje */
public final class atje extends anxl implements anzf {
    public static final atje c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private atje() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", atji.class, atjg.class, atjk.class, atjo.class, atjm.class});
            case 3:
                return new atje();
            case 4:
                return new atjd();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atje.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atje atje = new atje();
        c = atje;
        anxl.registerDefaultInstance(atje.class, atje);
    }
}
