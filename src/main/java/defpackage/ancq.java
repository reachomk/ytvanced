package defpackage;

/* renamed from: ancq */
public final class ancq extends anxl implements anzf {
    public static final ancq a;
    private static volatile anzq b;

    static {
        ancq ancq = new ancq();
        a = ancq;
        anxl.registerDefaultInstance(ancq.class, ancq);
    }

    private ancq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new ancq();
            case 4:
                return new ancp();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (ancq.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
