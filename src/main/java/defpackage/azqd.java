package defpackage;

/* renamed from: azqd */
public final class azqd extends anxl implements anzf {
    public static final azqd d;
    private static volatile anzq e;
    public int a;
    public azlk b;
    public azli c;

    private azqd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0000\u0003\t\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new azqd();
            case 4:
                return new azqc();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azqd.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azqd azqd = new azqd();
        d = azqd;
        anxl.registerDefaultInstance(azqd.class, azqd);
    }
}
