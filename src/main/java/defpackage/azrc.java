package defpackage;

/* renamed from: azrc */
public final class azrc extends anxl implements anzf {
    public static final azrc f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    private azrc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", "d", azqy.a, "e", azrb.a});
            case 3:
                return new azrc();
            case 4:
                return new azrf();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azrc.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azrc azrc = new azrc();
        f = azrc;
        anxl.registerDefaultInstance(azrc.class, azrc);
    }
}
