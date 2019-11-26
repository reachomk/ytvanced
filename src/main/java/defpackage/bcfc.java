package defpackage;

/* renamed from: bcfc */
public final class bcfc extends anxl implements anzf {
    public static final bcfc a;
    private static volatile anzq b;

    private bcfc() {
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
                return new bcfc();
            case 4:
                return new bcfb();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (bcfc.class) {
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

    static {
        bcfc bcfc = new bcfc();
        a = bcfc;
        anxl.registerDefaultInstance(bcfc.class, bcfc);
    }
}
