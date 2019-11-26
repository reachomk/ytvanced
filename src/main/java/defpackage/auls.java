package defpackage;

/* renamed from: auls */
public final class auls extends anxl implements anzf {
    public static final auls g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    private auls() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\u000b\u0004", new Object[]{"a", "b", auln.a, "c", aulo.a, "d", aulp.a, "e", aulq.a, "f"});
            case 3:
                return new auls();
            case 4:
                return new aulr();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auls.class) {
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
        auls auls = new auls();
        g = auls;
        anxl.registerDefaultInstance(auls.class, auls);
    }
}
