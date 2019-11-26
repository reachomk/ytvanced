package defpackage;

/* renamed from: azlq */
public final class azlq extends anxl implements anzf {
    public static final azlq d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public int c;

    private azlq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", azmh.a});
            case 3:
                return new azlq();
            case 4:
                return new azlp();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azlq.class) {
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
        azlq azlq = new azlq();
        d = azlq;
        anxl.registerDefaultInstance(azlq.class, azlq);
    }
}
