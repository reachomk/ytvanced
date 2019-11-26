package defpackage;

/* renamed from: avsg */
public final class avsg extends anxl implements anzf {
    public static final avsg e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    private avsg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\f\u0001\u0004\f\u0002", new Object[]{"a", "b", "c", avsd.a, "d", avog.a});
            case 3:
                return new avsg();
            case 4:
                return new avsf();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avsg.class) {
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
        avsg avsg = new avsg();
        e = avsg;
        anxl.registerDefaultInstance(avsg.class, avsg);
    }
}
