package defpackage;

/* renamed from: avps */
public final class avps extends anxl implements anzf {
    public static final avps c;
    private static volatile anzq d;
    public int a;
    public int b;

    private avps() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f\u0001", new Object[]{"a", "b", avrr.a});
            case 3:
                return new avps();
            case 4:
                return new avpr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avps.class) {
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
        avps avps = new avps();
        c = avps;
        anxl.registerDefaultInstance(avps.class, avps);
    }
}
