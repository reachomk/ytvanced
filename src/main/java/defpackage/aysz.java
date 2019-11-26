package defpackage;

/* renamed from: aysz */
public final class aysz extends anxl implements anzf {
    public static final aysz e;
    private static volatile anzq f;
    public int a;
    public aysx b;
    public int c;
    public long d;

    private aysz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", ayts.a, "d"});
            case 3:
                return new aysz();
            case 4:
                return new aytc();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aysz.class) {
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
        aysz aysz = new aysz();
        e = aysz;
        anxl.registerDefaultInstance(aysz.class, aysz);
    }
}
