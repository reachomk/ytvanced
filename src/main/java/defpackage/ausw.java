package defpackage;

/* renamed from: ausw */
public final class ausw extends anxl implements anzf {
    public static final ausw e;
    private static volatile anzq f;
    public int a;
    public int b;
    public auta c;
    public int d;

    private ausw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0004\u0002", new Object[]{"a", "b", autm.a, "c", "d"});
            case 3:
                return new ausw();
            case 4:
                return new ausv();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ausw.class) {
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
        ausw ausw = new ausw();
        e = ausw;
        anxl.registerDefaultInstance(ausw.class, ausw);
    }
}
