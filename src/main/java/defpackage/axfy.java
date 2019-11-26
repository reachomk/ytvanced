package defpackage;

/* renamed from: axfy */
public final class axfy extends anxl implements anzf {
    public static final axfy e;
    private static volatile anzq f;
    public int a;
    public int b = 0;
    public Object c;
    public axhe d;

    private axfy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002;\u0000\u0003:\u0000\u00045\u0000", new Object[]{"c", "b", "a", "d"});
            case 3:
                return new axfy();
            case 4:
                return new axfx();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (axfy.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axfy axfy = new axfy();
        e = axfy;
        anxl.registerDefaultInstance(axfy.class, axfy);
    }
}
