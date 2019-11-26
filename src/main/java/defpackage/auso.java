package defpackage;

/* renamed from: auso */
public final class auso extends anxl implements anzf {
    public static final auso d;
    private static volatile anzq e;
    public int a;
    public ausa b;
    public ausc c;

    private auso() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001☋㔥\u0002\u0000\u0000\u0000☋\t\u0000㔥\t\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new auso();
            case 4:
                return new ausn();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auso.class) {
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
        auso auso = new auso();
        d = auso;
        anxl.registerDefaultInstance(auso.class, auso);
    }
}
