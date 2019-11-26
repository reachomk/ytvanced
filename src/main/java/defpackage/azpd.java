package defpackage;

/* renamed from: azpd */
public final class azpd extends anxl implements anzf {
    public static final azpd g;
    private static volatile anzq h;
    public int a;
    public long b;
    public String c = "";
    public long d;
    public long e;
    public long f;

    private azpd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0003\u0000\u0002\b\u0001\u0003\u0003\u0002\u0004\u0002\u0003\u0005\u0002\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new azpd();
            case 4:
                return new azpg();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azpd.class) {
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
        azpd azpd = new azpd();
        g = azpd;
        anxl.registerDefaultInstance(azpd.class, azpd);
    }
}
