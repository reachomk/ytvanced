package defpackage;

/* renamed from: asas */
public final class asas extends anxl implements anzf {
    public static final asas e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public anyd d = anxl.emptyProtobufList();

    private asas() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\f\u0000\u0004\u000b\u0003\u0005\u001b", new Object[]{"a", "b", asau.a(), "c", "d", avss.class});
            case 3:
                return new asas();
            case 4:
                return new asav();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asas.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asas asas = new asas();
        e = asas;
        anxl.registerDefaultInstance(asas.class, asas);
    }
}
