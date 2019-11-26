package defpackage;

/* renamed from: awxv */
public final class awxv extends anxl implements anzf {
    public static final awxv d;
    private static volatile anzq e;
    public int a;
    public awxt b;
    public int c;

    private awxv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", awxx.a});
            case 3:
                return new awxv();
            case 4:
                return new awxy();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awxv.class) {
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
        awxv awxv = new awxv();
        d = awxv;
        anxl.registerDefaultInstance(awxv.class, awxv);
    }
}
