package defpackage;

/* renamed from: azli */
public final class azli extends anxl implements anzf {
    public static final azli f;
    private static volatile anzq g;
    public int a;
    public int b;
    public long c;
    public anyd d = anxl.emptyProtobufList();
    public int e;

    private azli() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u001c\u0004\u0004\u0002", new Object[]{"a", "b", avpv.a, "c", "d", "e"});
            case 3:
                return new azli();
            case 4:
                return new azlh();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azli.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azli azli = new azli();
        f = azli;
        anxl.registerDefaultInstance(azli.class, azli);
    }
}
