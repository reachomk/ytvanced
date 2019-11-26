package defpackage;

/* renamed from: aseu */
public final class aseu extends anxl implements anzf {
    public static final aseu c;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    public anyd b;

    private aseu() {
        anxl.emptyProtobufList();
        this.b = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001a\u0003\u001a", new Object[]{"a", "b"});
            case 3:
                return new aseu();
            case 4:
                return new asex();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aseu.class) {
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
        aseu aseu = new aseu();
        c = aseu;
        anxl.registerDefaultInstance(aseu.class, aseu);
    }
}
