package defpackage;

/* renamed from: awib */
public final class awib extends anxl implements anzf {
    public static final awib c;
    private static volatile anzq d;
    public int a;
    public boolean b;

    private awib() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0007\u0002", new Object[]{"a", "b"});
            case 3:
                return new awib();
            case 4:
                return new awia();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (awib.class) {
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
        awib awib = new awib();
        c = awib;
        anxl.registerDefaultInstance(awib.class, awib);
    }
}
