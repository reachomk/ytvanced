package defpackage;

/* renamed from: awbv */
public final class awbv extends anxl implements anzf {
    public static final awbv f;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;

    private awbv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0000\u0002\u0007\u0001\u0004\u0004\u0002\u0005\u0004\u0003\u0006\u0007\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awbv();
            case 4:
                return new awbu();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awbv.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awbv awbv = new awbv();
        f = awbv;
        anxl.registerDefaultInstance(awbv.class, awbv);
    }
}
