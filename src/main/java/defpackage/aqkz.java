package defpackage;

/* renamed from: aqkz */
public final class aqkz extends anxl implements anzf {
    public static final aqkz c;
    private static volatile anzq d;
    public int a;
    public int b;

    private aqkz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", aqla.a});
            case 3:
                return new aqkz();
            case 4:
                return new aqky();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqkz.class) {
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
        aqkz aqkz = new aqkz();
        c = aqkz;
        anxl.registerDefaultInstance(aqkz.class, aqkz);
    }
}
