package defpackage;

/* renamed from: aucm */
public final class aucm extends anxl implements anzf {
    public static final aucm c;
    private static volatile anzq d;
    public int a;
    public long b;

    private aucm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0003\u0001", new Object[]{"a", "b"});
            case 3:
                return new aucm();
            case 4:
                return new aucl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aucm.class) {
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
        aucm aucm = new aucm();
        c = aucm;
        anxl.registerDefaultInstance(aucm.class, aucm);
    }
}
