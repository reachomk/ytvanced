package defpackage;

/* renamed from: awav */
public final class awav extends anxl implements anzf {
    public static final awav d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private awav() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", awmy.a});
            case 3:
                return new awav();
            case 4:
                return new awau();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awav.class) {
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
        awav awav = new awav();
        d = awav;
        anxl.registerDefaultInstance(awav.class, awav);
    }
}
