package defpackage;

/* renamed from: auhp */
public final class auhp extends anxl implements anzf {
    public static final auhp g;
    private static volatile anzq h;
    public int a;
    public auhj b;
    public int c;
    public int d;
    public int e;
    public int f;

    private auhp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\t\u0000\u0003\u0004\u0001\u0004\f\u0002\u0005\f\u0003\u0006\u0004\u0004", new Object[]{"a", "b", "c", "d", auie.a, "e", auhy.a, "f"});
            case 3:
                return new auhp();
            case 4:
                return new auho();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auhp.class) {
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
        auhp auhp = new auhp();
        g = auhp;
        anxl.registerDefaultInstance(auhp.class, auhp);
    }
}
