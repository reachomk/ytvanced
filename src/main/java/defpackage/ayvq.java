package defpackage;

/* renamed from: ayvq */
public final class ayvq extends anxl implements anzf {
    public static final ayvq d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c = "";

    private ayvq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002\u001b\u0003\b\u0001", new Object[]{"a", "b", ayvs.class, "c"});
            case 3:
                return new ayvq();
            case 4:
                return new ayvp();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayvq.class) {
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
        ayvq ayvq = new ayvq();
        d = ayvq;
        anxl.registerDefaultInstance(ayvq.class, ayvq);
    }
}
