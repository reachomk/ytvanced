package defpackage;

/* renamed from: auke */
public final class auke extends anxl implements anzf {
    public static final auke g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;

    private auke() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0000\u0003\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0005\u0006\u0002\u0006", new Object[]{"a", "b", aukg.a, "c", "d", "e", "f"});
            case 3:
                return new auke();
            case 4:
                return new aukd();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auke.class) {
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
        auke auke = new auke();
        g = auke;
        anxl.registerDefaultInstance(auke.class, auke);
    }
}
