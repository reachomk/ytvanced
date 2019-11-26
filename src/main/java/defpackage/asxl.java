package defpackage;

/* renamed from: asxl */
public final class asxl extends anxl implements anzf {
    public static final asxl b;
    private static volatile anzq c;
    public anyd a = anxl.emptyProtobufList();

    private asxl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new asxl();
            case 4:
                return new asxo();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (asxl.class) {
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
        asxl asxl = new asxl();
        b = asxl;
        anxl.registerDefaultInstance(asxl.class, asxl);
    }
}
