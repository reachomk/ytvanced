package defpackage;

/* renamed from: awlm */
public final class awlm extends anxl implements anzf {
    public static final awlm c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private awlm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䂹䂹\u0001\u0000\u0000\u0000䂹<\u0000", new Object[]{"b", "a", ayym.class});
            case 3:
                return new awlm();
            case 4:
                return new awlp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (awlm.class) {
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
        awlm awlm = new awlm();
        c = awlm;
        anxl.registerDefaultInstance(awlm.class, awlm);
    }
}
