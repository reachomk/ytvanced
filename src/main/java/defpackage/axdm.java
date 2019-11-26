package defpackage;

/* renamed from: axdm */
public final class axdm extends anxl implements anzf {
    public static final axdm a;
    public static final anxr b = anxl.newSingularGeneratedExtension(axdo.g, Boolean.valueOf(false), null, null, 177189345, aobm.BOOL, Boolean.class);
    private static volatile anzq c;

    private axdm() {
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
                return new axdm();
            case 4:
                return new axdp();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (axdm.class) {
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
        axdm axdm = new axdm();
        a = axdm;
        anxl.registerDefaultInstance(axdm.class, axdm);
    }
}
