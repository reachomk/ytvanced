package defpackage;

/* renamed from: azqr */
public final class azqr extends anxl implements anzf {
    public static final azqr h;
    private static volatile anzq i;
    public int a;
    public azpz b;
    public azlk c;
    public boolean d;
    public boolean e;
    public anyd f = anxl.emptyProtobufList();
    public anvu g = anvu.a;

    private azqr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u001b\u0006\n\u0004", new Object[]{"a", "b", "c", "d", "e", "f", azpz.class, "g"});
            case 3:
                return new azqr();
            case 4:
                return new azqq();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azqr.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azqr azqr = new azqr();
        h = azqr;
        anxl.registerDefaultInstance(azqr.class, azqr);
    }
}
