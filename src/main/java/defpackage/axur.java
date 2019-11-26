package defpackage;

/* renamed from: axur */
public final class axur extends anxl implements anzf {
    public static final axur g;
    private static volatile anzq h;
    public int a;
    public int b;
    public long c;
    public long d;
    public int e;
    public boolean f;

    private axur() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\f\u0003\u0005\u0007\u0004", new Object[]{"a", "b", axuw.a, "c", "d", "e", axus.a, "f"});
            case 3:
                return new axur();
            case 4:
                return new axuu();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axur.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axur axur = new axur();
        g = axur;
        anxl.registerDefaultInstance(axur.class, axur);
    }
}
