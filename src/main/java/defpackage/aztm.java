package defpackage;

/* renamed from: aztm */
public final class aztm extends anxl implements anzf {
    public static final aztm c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aztm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001?\u0000\u00024\u0000\u0003;\u0000\u0004:\u0000\u0005=\u0000\u0006<\u0000\u0007<\u0000\b7\u0000\t>\u0000", new Object[]{"b", "a", azti.a, aztl.class, aztb.class});
            case 3:
                return new aztm();
            case 4:
                return new aztp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aztm.class) {
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
        aztm aztm = new aztm();
        c = aztm;
        anxl.registerDefaultInstance(aztm.class, aztm);
    }
}
