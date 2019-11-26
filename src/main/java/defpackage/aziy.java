package defpackage;

/* renamed from: aziy */
public final class aziy extends anxl implements anzf {
    public static final aziy c;
    private static volatile anzq d;
    public int a;
    public int b;

    private aziy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", aulx.a});
            case 3:
                return new aziy();
            case 4:
                return new azja();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aziy.class) {
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
        aziy aziy = new aziy();
        c = aziy;
        anxl.registerDefaultInstance(aziy.class, aziy);
    }
}
