package defpackage;

/* renamed from: awym */
public final class awym extends anxl implements anzf {
    public static final awym f;
    private static volatile anzq g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;

    private awym() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0005\u0001\u0004\u0006\u0001\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awym();
            case 4:
                return new awyp();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awym.class) {
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
        awym awym = new awym();
        f = awym;
        anxl.registerDefaultInstance(awym.class, awym);
    }
}
