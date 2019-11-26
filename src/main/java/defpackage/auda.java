package defpackage;

/* renamed from: auda */
public final class auda extends anxl implements anzf {
    public static final auda d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private auda() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"a", "b", aucw.a, "c", aucv.a});
            case 3:
                return new auda();
            case 4:
                return new aucz();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auda.class) {
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
        auda auda = new auda();
        d = auda;
        anxl.registerDefaultInstance(auda.class, auda);
    }
}
