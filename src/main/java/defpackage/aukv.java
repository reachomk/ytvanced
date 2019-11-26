package defpackage;

/* renamed from: aukv */
public final class aukv extends anxl implements anzf {
    public static final aukv d;
    private static volatile anzq e;
    public int a;
    public aqrw b;
    public aukt c;

    private aukv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003\t\u0002\u0005\t\u0004", new Object[]{"a", "b", "c"});
            case 3:
                return new aukv();
            case 4:
                return new auku();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aukv.class) {
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
        aukv aukv = new aukv();
        d = aukv;
        anxl.registerDefaultInstance(aukv.class, aukv);
    }
}
