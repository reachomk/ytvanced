package defpackage;

/* renamed from: aukf */
public final class aukf extends anxl implements anzf {
    public static final aukf e;
    private static volatile anzq f;
    public int a;
    public double b;
    public double c;
    public double d;

    private aukf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0001\u0003\u0000\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aukf();
            case 4:
                return new auki();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aukf.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aukf aukf = new aukf();
        e = aukf;
        anxl.registerDefaultInstance(aukf.class, aukf);
    }
}
