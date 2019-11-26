package defpackage;

/* renamed from: amoq */
public final class amoq extends anxl implements anzf {
    public static final amoq d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private amoq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004", new Object[]{"a", "b", "c"});
            case 3:
                return new amoq();
            case 4:
                return new amop();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (amoq.class) {
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
        amoq amoq = new amoq();
        d = amoq;
        anxl.registerDefaultInstance(amoq.class, amoq);
    }
}
