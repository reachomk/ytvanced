package defpackage;

/* renamed from: awcc */
public final class awcc extends anxl implements anzf {
    public static final awcc g;
    private static volatile anzq h;
    public int a;
    public float b;
    public azda c;
    public boolean d;
    public long e;
    public long f;

    private awcc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0007\u0003\u0004\u0002\u0004\u0005\u0002\u0005\u0006\t\u0002", new Object[]{"a", "b", "d", "e", "f", "c"});
            case 3:
                return new awcc();
            case 4:
                return new awcb();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awcc.class) {
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
        awcc awcc = new awcc();
        g = awcc;
        anxl.registerDefaultInstance(awcc.class, awcc);
    }
}
