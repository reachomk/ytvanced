package defpackage;

/* renamed from: antq */
public final class antq extends anxl implements anzf {
    public static final antq c;
    private static volatile anzq d;
    public anti a;
    public ants b;

    private antq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\t", new Object[]{"a", "b"});
            case 3:
                return new antq();
            case 4:
                return new antt();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (antq.class) {
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
        antq antq = new antq();
        c = antq;
        anxl.registerDefaultInstance(antq.class, antq);
    }
}
