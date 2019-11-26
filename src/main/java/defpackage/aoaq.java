package defpackage;

/* renamed from: aoaq */
public final class aoaq extends anxl implements anzf {
    public static final aoaq b;
    private static volatile anzq c;
    public long a;

    private aoaq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new aoaq();
            case 4:
                return new aoap();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aoaq.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoaq aoaq = new aoaq();
        b = aoaq;
        anxl.registerDefaultInstance(aoaq.class, aoaq);
    }
}
