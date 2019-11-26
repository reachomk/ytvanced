package defpackage;

/* renamed from: atyq */
public final class atyq extends anxl implements anzf {
    public static final atyq e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public int d;

    private atyq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{"a", "b", atzc.a, "c", atza.a, "d", atzb.a});
            case 3:
                return new atyq();
            case 4:
                return new atyt();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atyq.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atyq atyq = new atyq();
        e = atyq;
        anxl.registerDefaultInstance(atyq.class, atyq);
    }
}
