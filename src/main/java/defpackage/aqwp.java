package defpackage;

/* renamed from: aqwp */
public final class aqwp extends anxl implements anzf {
    public static final aqwp a;
    public static final anxr b;
    private static volatile anzq c;

    private aqwp() {
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
                return new aqwp();
            case 4:
                return new aqwo();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aqwp.class) {
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
        aqwp aqwp = new aqwp();
        a = aqwp;
        anxl.registerDefaultInstance(aqwp.class, aqwp);
        azsr azsr = azsr.a;
        aqwp aqwp2 = a;
        b = anxl.newSingularGeneratedExtension(azsr, aqwp2, aqwp2, null, 221166232, aobm.MESSAGE, aqwp.class);
    }
}
