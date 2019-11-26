package defpackage;

/* renamed from: asim */
public final class asim extends anxl implements anzf {
    public static final asim f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public int d;
    public asjh e;

    private asim() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u000b\u0000\u0002\f\u0001\u0003\f\u0002\u0005\t\u0004", new Object[]{"a", "b", "c", asio.a, "d", asir.a, "e"});
            case 3:
                return new asim();
            case 4:
                return new asip();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asim.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asim asim = new asim();
        f = asim;
        anxl.registerDefaultInstance(asim.class, asim);
    }
}
