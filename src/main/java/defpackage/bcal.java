package defpackage;

/* renamed from: bcal */
public final class bcal extends anxl implements anzf {
    public static final bcal a;
    private static volatile anzq b;

    private bcal() {
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
                return new bcal();
            case 4:
                return new bcao();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (bcal.class) {
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
        bcal bcal = new bcal();
        a = bcal;
        anxl.registerDefaultInstance(bcal.class, bcal);
    }
}
