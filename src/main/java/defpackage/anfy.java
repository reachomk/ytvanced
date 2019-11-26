package defpackage;

/* renamed from: anfy */
public final class anfy extends anxl implements anzf {
    public static final anfy a;
    private static volatile anzq b;

    static {
        anfy anfy = new anfy();
        a = anfy;
        anxl.registerDefaultInstance(anfy.class, anfy);
    }

    private anfy() {
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
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new anfy();
            case 4:
                return new anfx();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (anfy.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
