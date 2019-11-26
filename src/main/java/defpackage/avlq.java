package defpackage;

/* renamed from: avlq */
public final class avlq extends anxl implements anzf {
    public static final avlq a;
    public static final anxr b = anxl.newSingularGeneratedExtension(avls.g, asnl.j, asnl.j, null, 1000, aobm.MESSAGE, asnl.class);
    private static volatile anzq c;

    private avlq() {
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
                return new avlq();
            case 4:
                return new avlt();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (avlq.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
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
        avlq avlq = new avlq();
        a = avlq;
        anxl.registerDefaultInstance(avlq.class, avlq);
    }
}
