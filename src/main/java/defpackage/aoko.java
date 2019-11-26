package defpackage;

/* renamed from: aoko */
public final class aoko extends anxl implements anzf {
    public static final aoko d;
    private static volatile anzq e;
    public int a;
    public int b;
    public aogz c;

    private aoko() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001\f\u0000\u0004\t\u0003", new Object[]{"a", "b", aoks.a, "c"});
            case 3:
                return new aoko();
            case 4:
                return new aokn();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aoko.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoko aoko = new aoko();
        d = aoko;
        anxl.registerDefaultInstance(aoko.class, aoko);
    }
}
