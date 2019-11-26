package defpackage;

/* renamed from: ayit */
public final class ayit extends anxl implements anzf {
    public static final ayit e;
    private static volatile anzq f;
    public int a;
    public int b;
    public float c;
    public float d;

    private ayit() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0001\u0001\u0003\u0001\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ayit();
            case 4:
                return new ayis();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayit.class) {
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
        ayit ayit = new ayit();
        e = ayit;
        anxl.registerDefaultInstance(ayit.class, ayit);
    }
}
