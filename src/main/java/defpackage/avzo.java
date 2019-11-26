package defpackage;

/* renamed from: avzo */
public final class avzo extends anxl implements anzf {
    public static final avzo f;
    private static volatile anzq g;
    public int a;
    public int b;
    public anxz c = anxl.emptyIntList();
    public int d;
    public boolean e;

    private avzo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0016\u0003\u0004\u0001\u0004\u0007\u0002", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new avzo();
            case 4:
                return new avzn();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avzo.class) {
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
        avzo avzo = new avzo();
        f = avzo;
        anxl.registerDefaultInstance(avzo.class, avzo);
    }
}
