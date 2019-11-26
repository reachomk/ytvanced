package defpackage;

/* renamed from: awbr */
public final class awbr extends anxl implements anzf {
    public static final awbr e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    private awbr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", awbp.a, "d", awbo.a});
            case 3:
                return new awbr();
            case 4:
                return new awbq();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awbr.class) {
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
        awbr awbr = new awbr();
        e = awbr;
        anxl.registerDefaultInstance(awbr.class, awbr);
    }
}
