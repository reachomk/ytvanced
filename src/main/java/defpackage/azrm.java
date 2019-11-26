package defpackage;

/* renamed from: azrm */
public final class azrm extends anxl implements anzf {
    public static final azrm c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private azrm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", azro.class});
            case 3:
                return new azrm();
            case 4:
                return new azrp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (azrm.class) {
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
        azrm azrm = new azrm();
        c = azrm;
        anxl.registerDefaultInstance(azrm.class, azrm);
    }
}
