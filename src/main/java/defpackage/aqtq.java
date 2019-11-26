package defpackage;

/* renamed from: aqtq */
public final class aqtq extends anxl implements anzf {
    public static final aqtq g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public aulg c;
    public int d;
    public aqtw e;
    public boolean f;

    private aqtq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\t\u0003\u0005\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aqtq();
            case 4:
                return new aqtt();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqtq.class) {
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
        aqtq aqtq = new aqtq();
        g = aqtq;
        anxl.registerDefaultInstance(aqtq.class, aqtq);
    }
}
