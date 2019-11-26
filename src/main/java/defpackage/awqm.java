package defpackage;

/* renamed from: awqm */
public final class awqm extends anxl implements anzf {
    public static final awqm f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    private awqm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{"a", "b", awqg.a(), "c", "d", awqc.a(), "e", awqc.a()});
            case 3:
                return new awqm();
            case 4:
                return new awqp();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awqm.class) {
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
        awqm awqm = new awqm();
        f = awqm;
        anxl.registerDefaultInstance(awqm.class, awqm);
    }
}
