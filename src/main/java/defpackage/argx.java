package defpackage;

/* renamed from: argx */
public final class argx extends anxl implements anzf {
    public static final argx f;
    private static volatile anzq g;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public int e;

    private argx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0007\u0001\u0003\u0004\u0000\u0004\u0007\u0002\u0005\f\u0003", new Object[]{"a", "c", "b", "d", "e", aqui.a()});
            case 3:
                return new argx();
            case 4:
                return new argw();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (argx.class) {
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
        argx argx = new argx();
        f = argx;
        anxl.registerDefaultInstance(argx.class, argx);
    }
}
