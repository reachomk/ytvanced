package defpackage;

/* renamed from: aogz */
public final class aogz extends anxl implements anzf {
    public static final aogz c;
    private static volatile anzq d;
    public int a;
    public int b;

    private aogz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b\u0000", new Object[]{"a", "b"});
            case 3:
                return new aogz();
            case 4:
                return new aogy();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aogz.class) {
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
        aogz aogz = new aogz();
        c = aogz;
        anxl.registerDefaultInstance(aogz.class, aogz);
    }
}
