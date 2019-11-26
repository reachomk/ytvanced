package defpackage;

/* renamed from: azwd */
public final class azwd extends anxl implements anzf {
    public static final azwd e;
    private static volatile anzq f;
    public int a;
    public float b;
    public int c;
    public anya d = anxl.emptyFloatList();

    private azwd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0001\u0000\u0002\f\u0001\u0003\u0013", new Object[]{"a", "b", "c", azwe.a, "d"});
            case 3:
                return new azwd();
            case 4:
                return new azwc();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azwd.class) {
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
        azwd azwd = new azwd();
        e = azwd;
        anxl.registerDefaultInstance(azwd.class, azwd);
    }
}
