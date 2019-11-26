package defpackage;

/* renamed from: aqwn */
public final class aqwn extends anxl implements anzf {
    public static final aqwn a;
    public static final anxr b;
    private static volatile anzq c;

    private aqwn() {
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
                return new aqwn();
            case 4:
                return new aqwm();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aqwn.class) {
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
        aqwn aqwn = new aqwn();
        a = aqwn;
        anxl.registerDefaultInstance(aqwn.class, aqwn);
        azsr azsr = azsr.a;
        aqwn aqwn2 = a;
        b = anxl.newSingularGeneratedExtension(azsr, aqwn2, aqwn2, null, 234870342, aobm.MESSAGE, aqwn.class);
    }
}
