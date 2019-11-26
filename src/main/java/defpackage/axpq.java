package defpackage;

/* renamed from: axpq */
public final class axpq extends anxl implements anzf {
    public static final axpq a;
    public static final anxr b = anxl.newSingularGeneratedExtension(axpw.e, Boolean.valueOf(false), null, null, 239610506, aobm.BOOL, Boolean.class);
    private static volatile anzq c;

    private axpq() {
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
                return new axpq();
            case 4:
                return new axpp();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (axpq.class) {
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
        axpq axpq = new axpq();
        a = axpq;
        anxl.registerDefaultInstance(axpq.class, axpq);
    }
}
