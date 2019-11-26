package defpackage;

/* renamed from: aqvv */
public final class aqvv extends anxl implements anzf {
    public static final aqvv f;
    private static volatile anzq g;
    public int a;
    public aqwd b;
    public aqvz c;
    public aqvx d;
    public aqwb e;

    private aqvv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqvv();
            case 4:
                return new aqvu();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqvv.class) {
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
        aqvv aqvv = new aqvv();
        f = aqvv;
        anxl.registerDefaultInstance(aqvv.class, aqvv);
    }
}
