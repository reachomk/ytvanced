package defpackage;

/* renamed from: azpz */
public final class azpz extends anxl implements anzf {
    public static final azpz g;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public int c;
    public long d = -1;
    public long e = -1;
    public boolean f;

    private azpz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0007\u0004", new Object[]{"a", "b", "c", azqm.a, "d", "e", "f"});
            case 3:
                return new azpz();
            case 4:
                return new azpy();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azpz.class) {
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
        azpz azpz = new azpz();
        g = azpz;
        anxl.registerDefaultInstance(azpz.class, azpz);
    }
}
