package defpackage;

/* renamed from: azqx */
public final class azqx extends anxl implements anzf {
    public static final azqx e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    private azqx() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0000\u0000\u0004\u0007\u0001\u0007\u0007\u0004\b\u0007\u0005", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azqx();
            case 4:
                return new azqw();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azqx.class) {
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
        azqx azqx = new azqx();
        e = azqx;
        anxl.registerDefaultInstance(azqx.class, azqx);
    }
}
