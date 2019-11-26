package defpackage;

/* renamed from: axvv */
public final class axvv extends anxl implements anzf {
    public static final axvv c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private axvv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䄉䄉\u0001\u0000\u0000\u0000䄉<\u0000", new Object[]{"b", "a", axwo.class});
            case 3:
                return new axvv();
            case 4:
                return new axvx();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (axvv.class) {
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
        axvv axvv = new axvv();
        c = axvv;
        anxl.registerDefaultInstance(axvv.class, axvv);
    }
}
