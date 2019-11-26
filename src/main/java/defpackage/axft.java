package defpackage;

/* renamed from: axft */
public final class axft extends anxl implements anzf {
    public static final axft a;
    public static final anxr b = anxl.newSingularGeneratedExtension(apxu.d, axfr.c, axfr.c, null, 144224893, aobm.MESSAGE, axfr.class);
    private static volatile anzq c;

    private axft() {
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
                return new axft();
            case 4:
                return new axfs();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (axft.class) {
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
        axft axft = new axft();
        a = axft;
        anxl.registerDefaultInstance(axft.class, axft);
    }
}
