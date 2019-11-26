package defpackage;

/* renamed from: aott */
public final class aott extends anxl implements anzf {
    public static final aott d;
    private static volatile anzq e;
    public int a;
    public aotv b;
    public boolean c;

    private aott() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\t\u0000\u0004\u0007\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aott();
            case 4:
                return new aotw();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aott.class) {
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
        aott aott = new aott();
        d = aott;
        anxl.registerDefaultInstance(aott.class, aott);
    }
}
