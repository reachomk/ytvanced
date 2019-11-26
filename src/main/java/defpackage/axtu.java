package defpackage;

/* renamed from: axtu */
public final class axtu extends anxl implements anzf {
    public static final axtu e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public int c;
    public boolean d;

    private axtu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0003\u000b\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new axtu();
            case 4:
                return new axtt();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (axtu.class) {
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
        axtu axtu = new axtu();
        e = axtu;
        anxl.registerDefaultInstance(axtu.class, axtu);
    }
}
