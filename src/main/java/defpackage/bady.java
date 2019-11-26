package defpackage;

/* renamed from: bady */
public final class bady extends anxl implements anzf {
    public static final bady c;
    private static volatile anzq d;
    public int a;
    public double b;

    private bady() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000", new Object[]{"a", "b"});
            case 3:
                return new bady();
            case 4:
                return new baeb();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (bady.class) {
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
        bady bady = new bady();
        c = bady;
        anxl.registerDefaultInstance(bady.class, bady);
    }
}
