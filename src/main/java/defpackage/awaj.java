package defpackage;

/* renamed from: awaj */
public final class awaj extends anxl implements anzf {
    public static final awaj a;
    private static volatile anzq b;

    private awaj() {
        anxl.emptyIntList();
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
                return new awaj();
            case 4:
                return new awai();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (awaj.class) {
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
        awaj awaj = new awaj();
        a = awaj;
        anxl.registerDefaultInstance(awaj.class, awaj);
    }
}
