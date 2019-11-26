package defpackage;

/* renamed from: auqb */
public final class auqb extends anxl implements anzf {
    public static final auqb g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c;
    public long d;
    public boolean e;
    public aupl f;

    private auqb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0007\u0003\u0005\t\u0004", new Object[]{"a", "b", auru.a, "c", auro.a, "d", "e", "f"});
            case 3:
                return new auqb();
            case 4:
                return new auqe();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auqb.class) {
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
        auqb auqb = new auqb();
        g = auqb;
        anxl.registerDefaultInstance(auqb.class, auqb);
    }
}
