package defpackage;

/* renamed from: ammz */
public final class ammz extends anxl implements anzf {
    public static final ammz c;
    private static volatile anzq d;
    public int a;
    public ammx b;

    private ammz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new ammz();
            case 4:
                return new amnc();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ammz.class) {
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
        ammz ammz = new ammz();
        c = ammz;
        anxl.registerDefaultInstance(ammz.class, ammz);
    }
}
