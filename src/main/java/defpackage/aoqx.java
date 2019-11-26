package defpackage;

/* renamed from: aoqx */
public final class aoqx extends anxl implements anzf {
    public static final aoqx h;
    private static volatile anzq i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    private aoqx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005", new Object[]{"a", "b", "c", aqvf.a, "d", "e", aycv.a, "f", aycs.a, "g", ayco.a});
            case 3:
                return new aoqx();
            case 4:
                return new aora();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aoqx.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoqx aoqx = new aoqx();
        h = aoqx;
        anxl.registerDefaultInstance(aoqx.class, aoqx);
    }
}
