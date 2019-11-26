package defpackage;

/* renamed from: ansn */
public final class ansn extends anxl implements anzf {
    public static final ansn c;
    private static volatile anzq d;
    public String a = "";
    public ansp b;

    private ansn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0000\u0000\u0005Ȉ\u0006\t", new Object[]{"a", "b"});
            case 3:
                return new ansn();
            case 4:
                return new ansm();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ansn.class) {
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
        ansn ansn = new ansn();
        c = ansn;
        anxl.registerDefaultInstance(ansn.class, ansn);
    }
}
