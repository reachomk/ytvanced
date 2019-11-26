package defpackage;

/* renamed from: bces */
public final class bces extends anxl implements anzf {
    public static final bces e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public anxz d = anxl.emptyIntList();

    private bces() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0016", new Object[]{"a", "b", bcet.a, "c", "d"});
            case 3:
                return new bces();
            case 4:
                return new bcer();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (bces.class) {
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
        bces bces = new bces();
        e = bces;
        anxl.registerDefaultInstance(bces.class, bces);
    }
}
