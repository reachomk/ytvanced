package defpackage;

/* renamed from: arac */
public final class arac extends anxl implements anzf {
    public static final arac g;
    private static volatile anzq h;
    public int a;
    public arah b;
    public int c = 1;
    public araj d;
    public anyd e = anxl.emptyProtobufList();
    public aqzt f;

    private arac() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\f\u0001\u0004\t\u0003\u0005\u001b\u0006\t\u0004", new Object[]{"a", "b", "c", arae.a, "d", "e", aqzv.class, "f"});
            case 3:
                return new arac();
            case 4:
                return new araf();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arac.class) {
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
        arac arac = new arac();
        g = arac;
        anxl.registerDefaultInstance(arac.class, arac);
    }
}
