package defpackage;

/* renamed from: axuy */
public final class axuy extends anxl implements anzf {
    public static final axuy d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private axuy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", axuv.a});
            case 3:
                return new axuy();
            case 4:
                return new axux();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axuy.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axuy axuy = new axuy();
        d = axuy;
        anxl.registerDefaultInstance(axuy.class, axuy);
    }
}
