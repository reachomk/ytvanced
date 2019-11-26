package defpackage;

/* renamed from: awmc */
public final class awmc extends anxl implements anzf {
    public static final awmc e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public anya d = anxl.emptyFloatList();

    private awmc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0013", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new awmc();
            case 4:
                return new awmf();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awmc.class) {
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
        awmc awmc = new awmc();
        e = awmc;
        anxl.registerDefaultInstance(awmc.class, awmc);
    }
}
