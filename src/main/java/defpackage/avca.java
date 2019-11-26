package defpackage;

/* renamed from: avca */
public final class avca extends anxl implements anzf {
    public static final avca e;
    private static volatile anzq f;
    public int a;
    public int b = 0;
    public Object c;
    public int d;

    private avca() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002:\u0000", new Object[]{"c", "b", "a", "d", avcb.a});
            case 3:
                return new avca();
            case 4:
                return new avbz();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avca.class) {
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
        avca avca = new avca();
        e = avca;
        anxl.registerDefaultInstance(avca.class, avca);
    }
}
