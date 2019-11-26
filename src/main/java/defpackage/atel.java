package defpackage;

/* renamed from: atel */
public final class atel extends anxl implements anzf {
    public static final atel c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private atel() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000᪓ↂ\u0002\u0000\u0000\u0000᪓<\u0000ↂ<\u0000", new Object[]{"b", "a", awgq.class, awei.class});
            case 3:
                return new atel();
            case 4:
                return new ateo();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atel.class) {
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
        atel atel = new atel();
        c = atel;
        anxl.registerDefaultInstance(atel.class, atel);
    }
}
