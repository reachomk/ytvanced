package defpackage;

/* renamed from: ayet */
public final class ayet extends anxl implements anzf {
    public static final ayet d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private ayet() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"a", "b", ayem.a(), "c", ayem.a()});
            case 3:
                return new ayet();
            case 4:
                return new ayew();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayet.class) {
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
        ayet ayet = new ayet();
        d = ayet;
        anxl.registerDefaultInstance(ayet.class, ayet);
    }
}
