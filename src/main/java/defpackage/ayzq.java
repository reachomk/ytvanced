package defpackage;

/* renamed from: ayzq */
public final class ayzq extends anxl implements anzf {
    public static final ayzq f;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public boolean e;

    private ayzq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007\u0005\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", "a", "d", ayzd.a, ayzs.class, ayzo.class, "e", ayzu.class, ayzm.class});
            case 3:
                return new ayzq();
            case 4:
                return new ayzp();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayzq.class) {
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
        ayzq ayzq = new ayzq();
        f = ayzq;
        anxl.registerDefaultInstance(ayzq.class, ayzq);
    }
}
