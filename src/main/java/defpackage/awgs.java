package defpackage;

/* renamed from: awgs */
public final class awgs extends anxl implements anzf {
    public static final anyb b = new awgv();
    public static final awgs c;
    private static volatile anzq d;
    public anxz a = anxl.emptyIntList();

    private awgs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", awgx.a()});
            case 3:
                return new awgs();
            case 4:
                return new awgu();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (awgs.class) {
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
        awgs awgs = new awgs();
        c = awgs;
        anxl.registerDefaultInstance(awgs.class, awgs);
    }
}
