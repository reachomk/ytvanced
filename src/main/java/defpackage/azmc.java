package defpackage;

/* renamed from: azmc */
public final class azmc extends anxl implements anzf {
    public static final azmc d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public int c;

    private azmc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", azmj.a});
            case 3:
                return new azmc();
            case 4:
                return new azmb();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azmc.class) {
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
        azmc azmc = new azmc();
        d = azmc;
        anxl.registerDefaultInstance(azmc.class, azmc);
    }
}
