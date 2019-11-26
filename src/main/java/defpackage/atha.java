package defpackage;

/* renamed from: atha */
public final class atha extends anxl implements anzf {
    public static final atha c;
    private static volatile anzq d;
    public int a;
    public int b;

    private atha() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0004\u0002", new Object[]{"a", "b"});
            case 3:
                return new atha();
            case 4:
                return new atgz();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atha.class) {
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
        atha atha = new atha();
        c = atha;
        anxl.registerDefaultInstance(atha.class, atha);
    }
}
