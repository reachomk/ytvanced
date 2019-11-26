package defpackage;

/* renamed from: azra */
public final class azra extends anxl implements anzf {
    public static final azra d;
    private static volatile anzq e;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();

    private azra() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"a", "b", azqz.a, "c", azrc.class});
            case 3:
                return new azra();
            case 4:
                return new azrd();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azra.class) {
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
        azra azra = new azra();
        d = azra;
        anxl.registerDefaultInstance(azra.class, azra);
    }
}
