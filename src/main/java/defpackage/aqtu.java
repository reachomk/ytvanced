package defpackage;

/* renamed from: aqtu */
public final class aqtu extends anxl implements anzf {
    public static final aqtu g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c;
    public aqts d;
    public aqtw e;
    public aquc f;

    private aqtu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0003\t\u0007\u0005\u0004\u0001\b\t\u0004\n\t\b", new Object[]{"a", "b", "e", "c", "d", "f"});
            case 3:
                return new aqtu();
            case 4:
                return new aqtx();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqtu.class) {
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
        aqtu aqtu = new aqtu();
        g = aqtu;
        anxl.registerDefaultInstance(aqtu.class, aqtu);
    }
}
