package defpackage;

/* renamed from: aoqz */
public final class aoqz extends anxl implements anzf {
    public static final aoqz c;
    private static volatile anzq d;
    public int a;
    public int b;

    private aoqz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f\u0001", new Object[]{"a", "b", aorb.a});
            case 3:
                return new aoqz();
            case 4:
                return new aore();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aoqz.class) {
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
        aoqz aoqz = new aoqz();
        c = aoqz;
        anxl.registerDefaultInstance(aoqz.class, aoqz);
    }
}
