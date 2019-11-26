package defpackage;

/* renamed from: ayvx */
public final class ayvx extends anxl implements anzf {
    public static final ayvx g;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public int e;
    public int f;

    private ayvx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003<\u0000\u0004\f\u0002", new Object[]{"c", "b", "a", "d", "e", ayvw.a, ayvz.class, "f", ayvv.a()});
            case 3:
                return new ayvx();
            case 4:
                return new aywa();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ayvx.class) {
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
        ayvx ayvx = new ayvx();
        g = ayvx;
        anxl.registerDefaultInstance(ayvx.class, ayvx);
    }
}
