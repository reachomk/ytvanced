package defpackage;

/* renamed from: axda */
public final class axda extends anxl implements anzf {
    public static final axda c;
    private static volatile anzq d;
    public int a;
    public axcy b;

    private axda() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ﷵ㝅ﷵ㝅\u0001\u0000\u0000\u0000ﷵ㝅\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new axda();
            case 4:
                return new axdd();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (axda.class) {
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
        axda axda = new axda();
        c = axda;
        anxl.registerDefaultInstance(axda.class, axda);
    }
}
