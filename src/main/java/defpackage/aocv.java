package defpackage;

/* renamed from: aocv */
public final class aocv extends anxl implements anzf {
    public static final aocv f;
    private static volatile anzq g;
    public int a;
    public double b;
    public double c;
    public double d;
    public double e;

    private aocv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0001\u0003\u0000\u0002\u0004\u0000\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aocv();
            case 4:
                return new aocy();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aocv.class) {
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
        aocv aocv = new aocv();
        f = aocv;
        anxl.registerDefaultInstance(aocv.class, aocv);
    }
}
