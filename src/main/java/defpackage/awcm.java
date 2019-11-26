package defpackage;

/* renamed from: awcm */
public final class awcm extends anxl implements anzf {
    public static final awcm a;
    private static volatile anzq b;

    private awcm() {
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
                return new awcm();
            case 4:
                return new awcl();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (awcm.class) {
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
        awcm awcm = new awcm();
        a = awcm;
        anxl.registerDefaultInstance(awcm.class, awcm);
    }
}
