package defpackage;

/* renamed from: aqwl */
public final class aqwl extends anxl implements anzf {
    public static final aqwl a;
    public static final anxr b;
    private static volatile anzq c;

    private aqwl() {
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
                return new aqwl();
            case 4:
                return new aqwk();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aqwl.class) {
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
        aqwl aqwl = new aqwl();
        a = aqwl;
        anxl.registerDefaultInstance(aqwl.class, aqwl);
        azsr azsr = azsr.a;
        aqwl aqwl2 = a;
        b = anxl.newSingularGeneratedExtension(azsr, aqwl2, aqwl2, null, 230793507, aobm.MESSAGE, aqwl.class);
    }
}
