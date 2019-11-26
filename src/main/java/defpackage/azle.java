package defpackage;

/* renamed from: azle */
public final class azle extends anxl implements anzf {
    public static final azle g;
    private static volatile anzq h;
    public int a;
    public azlk b;
    public int c;
    public anvu d = anvu.a;
    public anvu e = anvu.a;
    public anvu f = anvu.a;

    private azle() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0001\u0002\n\u0002\u0003\n\u0003\u0004\t\u0000\u0005\n\u0004", new Object[]{"a", "c", azlb.a, "d", "e", "b", "f"});
            case 3:
                return new azle();
            case 4:
                return new azld();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azle.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azle azle = new azle();
        g = azle;
        anxl.registerDefaultInstance(azle.class, azle);
    }
}
