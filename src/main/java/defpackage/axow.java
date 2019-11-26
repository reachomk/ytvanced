package defpackage;

/* renamed from: axow */
public final class axow extends anxl implements anzf {
    public static final axow a;
    public static final anxr b;
    public static final anxr c;
    private static volatile anzq d;

    private axow() {
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
                return new axow();
            case 4:
                return new axoy();
            case 5:
                return a;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (axow.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axow axow = new axow();
        a = axow;
        anxl.registerDefaultInstance(axow.class, axow);
        axpi axpi = axpi.g;
        Boolean valueOf = Boolean.valueOf(false);
        b = anxl.newSingularGeneratedExtension(axpi, valueOf, null, null, 128093714, aobm.BOOL, Boolean.class);
        c = anxl.newSingularGeneratedExtension(axpi.g, valueOf, null, null, 127992852, aobm.BOOL, Boolean.class);
    }
}
