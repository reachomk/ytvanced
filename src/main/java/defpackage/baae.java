package defpackage;

/* renamed from: baae */
public final class baae extends anxl implements anzf {
    public static final baae c;
    private static volatile anzq d;
    public anyy a = anyy.b;
    public anyy b = anyy.b;

    private baae() {
        anxl.emptyIntList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyIntList();
        anxl.emptyIntList();
        anxl.emptyIntList();
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0018\u0019\u0002\u0002\u0000\u0000\u00182\u00192", new Object[]{"a", baag.a, "b", baaj.a});
            case 3:
                return new baae();
            case 4:
                return new baah();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (baae.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        baae baae = new baae();
        c = baae;
        anxl.registerDefaultInstance(baae.class, baae);
    }
}
