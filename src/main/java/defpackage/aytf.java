package defpackage;

/* renamed from: aytf */
public final class aytf extends anxl implements anzf {
    public static final aytf a;
    private static volatile anzq b;

    private aytf() {
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
                return new aytf();
            case 4:
                return new ayti();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aytf.class) {
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
        aytf aytf = new aytf();
        a = aytf;
        anxl.registerDefaultInstance(aytf.class, aytf);
    }
}
