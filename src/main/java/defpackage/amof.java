package defpackage;

/* renamed from: amof */
public final class amof extends anxl implements anzf {
    public static final amof g;
    private static volatile anzq h;
    public int a = 0;
    public Object b;
    public amoq c;
    public amot d;
    public amor e;
    public amox f;

    private amof() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0000\b\u0001\u0000\u0001d\b\u0000\u0000\u0000\u0001<\u0000\u0002\t\u0003\t\u0004\t\u0006Ȼ\u0000\u0007Ȼ\u0000\n\tdȻ\u0000", new Object[]{"b", "a", amol.class, "c", "d", "e", "f"});
            case 3:
                return new amof();
            case 4:
                return new amoi();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (amof.class) {
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
        amof amof = new amof();
        g = amof;
        anxl.registerDefaultInstance(amof.class, amof);
    }
}
