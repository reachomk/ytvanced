package defpackage;

/* renamed from: aqhj */
public final class aqhj extends anxl implements anzf {
    public static final aqhj e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public int d;

    private aqhj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aqhj();
            case 4:
                return new aqhm();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqhj.class) {
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
        aqhj aqhj = new aqhj();
        e = aqhj;
        anxl.registerDefaultInstance(aqhj.class, aqhj);
    }
}
