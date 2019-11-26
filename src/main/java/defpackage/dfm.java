package defpackage;

/* renamed from: dfm */
public final class dfm extends anxl implements anzf {
    public static final dfm c;
    private static volatile anzq d;
    public int a;
    public int b = 2;

    private dfm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"a", "b", dfo.a});
            case 3:
                return new dfm();
            case 4:
                return new dfp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (dfm.class) {
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
        dfm dfm = new dfm();
        c = dfm;
        anxl.registerDefaultInstance(dfm.class, dfm);
    }
}
