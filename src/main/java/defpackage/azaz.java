package defpackage;

/* renamed from: azaz */
public final class azaz extends anxl implements anzf {
    public static final azaz b;
    private static volatile anzq c;
    public anyd a = anxl.emptyProtobufList();

    private azaz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", azbb.class});
            case 3:
                return new azaz();
            case 4:
                return new azay();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (azaz.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azaz azaz = new azaz();
        b = azaz;
        anxl.registerDefaultInstance(azaz.class, azaz);
    }
}
