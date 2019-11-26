package defpackage;

/* renamed from: aojq */
public final class aojq extends anxl implements anzf {
    public static final aojq b;
    private static volatile anzq c;
    public anyy a = anyy.b;

    private aojq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", aojs.a});
            case 3:
                return new aojq();
            case 4:
                return new aojt();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aojq.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aojq aojq = new aojq();
        b = aojq;
        anxl.registerDefaultInstance(aojq.class, aojq);
    }
}
