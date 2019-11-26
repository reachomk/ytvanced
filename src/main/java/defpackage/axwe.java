package defpackage;

/* renamed from: axwe */
public final class axwe extends anxl implements anzf {
    public static final axwe d;
    private static volatile anzq e;
    public int a;
    public int b;
    public boolean c;

    private axwe() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001", new Object[]{"a", "b", axwj.a, "c"});
            case 3:
                return new axwe();
            case 4:
                return new axwh();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axwe.class) {
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
        axwe axwe = new axwe();
        d = axwe;
        anxl.registerDefaultInstance(axwe.class, axwe);
    }
}
