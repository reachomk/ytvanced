package defpackage;

/* renamed from: apbr */
public final class apbr extends anxl implements anzf {
    public static final apbr g;
    private static volatile anzq h;
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;

    private apbr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0002\u0003\u0004\u0003\u0004\u0004\u0004\u0005\f\u0001", new Object[]{"a", "b", apbk.a, "d", "e", "f", "c", apbj.a});
            case 3:
                return new apbr();
            case 4:
                return new apbu();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apbr.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apbr apbr = new apbr();
        g = apbr;
        anxl.registerDefaultInstance(apbr.class, apbr);
    }
}
