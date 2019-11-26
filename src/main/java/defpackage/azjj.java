package defpackage;

/* renamed from: azjj */
public final class azjj extends anxl implements anzf {
    public static final azjj c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private azjj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000ﶀ㴹ﶀ㴹\u0001\u0000\u0000\u0000ﶀ㴹<\u0000", new Object[]{"b", "a", azjh.class});
            case 3:
                return new azjj();
            case 4:
                return new azjl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (azjj.class) {
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
        azjj azjj = new azjj();
        c = azjj;
        anxl.registerDefaultInstance(azjj.class, azjj);
    }
}
