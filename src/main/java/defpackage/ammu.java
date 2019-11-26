package defpackage;

/* renamed from: ammu */
public final class ammu extends anxl implements anzf {
    public static final ammu a;
    public static final anxr b = anxl.newSingularGeneratedExtension(arlv.E, Boolean.valueOf(false), null, null, 97848766, aobm.BOOL, Boolean.class);
    private static volatile anzq c;

    private ammu() {
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
                return new ammu();
            case 4:
                return new ammt();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (ammu.class) {
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
        ammu ammu = new ammu();
        a = ammu;
        anxl.registerDefaultInstance(ammu.class, ammu);
    }
}
