package defpackage;

/* renamed from: bcbs */
public final class bcbs extends anxl implements anzf {
    public static final bcbs c;
    private static volatile anzq d;
    public int a;
    public int b = -1;

    private bcbs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", bcbt.a});
            case 3:
                return new bcbs();
            case 4:
                return new bcbr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (bcbs.class) {
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
        bcbs bcbs = new bcbs();
        c = bcbs;
        anxl.registerDefaultInstance(bcbs.class, bcbs);
    }
}
