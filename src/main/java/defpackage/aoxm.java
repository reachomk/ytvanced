package defpackage;

/* renamed from: aoxm */
public final class aoxm extends anxl implements anzf {
    public static final aoxm c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aoxm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", aoxo.class});
            case 3:
                return new aoxm();
            case 4:
                return new aoxl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aoxm.class) {
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
        aoxm aoxm = new aoxm();
        c = aoxm;
        anxl.registerDefaultInstance(aoxm.class, aoxm);
    }
}
