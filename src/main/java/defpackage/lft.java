package defpackage;

/* renamed from: lft */
public final class lft extends anxl implements anzf {
    public static final lft e;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    public int d;

    private lft() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\u0004\u0000\u0004\u0004\u0001", new Object[]{"a", "b", lfv.class, "c", "d"});
            case 3:
                return new lft();
            case 4:
                return new lfs();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (lft.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        lft lft = new lft();
        e = lft;
        anxl.registerDefaultInstance(lft.class, lft);
    }
}
