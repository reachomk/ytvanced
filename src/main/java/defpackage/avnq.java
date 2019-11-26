package defpackage;

/* renamed from: avnq */
public final class avnq extends anxl implements anzf {
    public static final avnq a;
    private static volatile anzq b;

    private avnq() {
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
                return new avnq();
            case 4:
                return new avnt();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (avnq.class) {
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

    static {
        avnq avnq = new avnq();
        a = avnq;
        anxl.registerDefaultInstance(avnq.class, avnq);
    }
}
