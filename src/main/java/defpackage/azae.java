package defpackage;

/* renamed from: azae */
public final class azae extends anxl implements anzf {
    public static final azae d;
    private static volatile anzq e;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();

    private azae() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001a", new Object[]{"a", "b", ayza.a(), "c"});
            case 3:
                return new azae();
            case 4:
                return new azad();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azae.class) {
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
        azae azae = new azae();
        d = azae;
        anxl.registerDefaultInstance(azae.class, azae);
    }
}
