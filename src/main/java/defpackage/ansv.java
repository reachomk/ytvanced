package defpackage;

/* renamed from: ansv */
public final class ansv extends anxl implements anzf {
    public static final ansv a;
    private static volatile anzq b;

    private ansv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0000\u0000", null);
            case 3:
                return new ansv();
            case 4:
                return new ansu();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ansv.class) {
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
        ansv ansv = new ansv();
        a = ansv;
        anxl.registerDefaultInstance(ansv.class, ansv);
    }
}
