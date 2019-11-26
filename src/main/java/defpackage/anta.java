package defpackage;

/* renamed from: anta */
public final class anta extends anxl implements anzf {
    public static final anta c;
    private static volatile anzq d;
    public antg a;
    public anyd b = anxl.emptyProtobufList();

    private anta() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ț\u0002\t", new Object[]{"b", "a"});
            case 3:
                return new anta();
            case 4:
                return new antd();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (anta.class) {
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
        anta anta = new anta();
        c = anta;
        anxl.registerDefaultInstance(anta.class, anta);
    }
}
