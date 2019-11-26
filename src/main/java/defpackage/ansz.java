package defpackage;

/* renamed from: ansz */
public final class ansz extends anxl implements anzf {
    public static final ansz g;
    private static volatile anzq h;
    public int a = 0;
    public Object b;
    public antn c;
    public int d;
    public anti e;
    public ansd f;

    private ansz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0000\u0007\u0001\u0000\u0001\n\u0007\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\f\u0007\t\n\t", new Object[]{"b", "a", "c", ants.class, ansn.class, ansv.class, "d", "e", "f"});
            case 3:
                return new ansz();
            case 4:
                return new ansy();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ansz.class) {
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
        ansz ansz = new ansz();
        g = ansz;
        anxl.registerDefaultInstance(ansz.class, ansz);
    }
}
