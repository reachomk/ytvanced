package defpackage;

/* renamed from: azqv */
public final class azqv extends anxl implements anzf {
    public static final azqv c;
    private static volatile anzq d;
    public int a;
    public azqt b;

    private azqv() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\t\u0001", new Object[]{"a", "b"});
            case 3:
                return new azqv();
            case 4:
                return new azqu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (azqv.class) {
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
        azqv azqv = new azqv();
        c = azqv;
        anxl.registerDefaultInstance(azqv.class, azqv);
    }
}
