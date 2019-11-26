package defpackage;

/* renamed from: aqwr */
public final class aqwr extends anxl implements anzf {
    public static final aqwr a;
    public static final anxr b;
    private static volatile anzq c;

    private aqwr() {
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
                return new aqwr();
            case 4:
                return new aqwq();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aqwr.class) {
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
        aqwr aqwr = new aqwr();
        a = aqwr;
        anxl.registerDefaultInstance(aqwr.class, aqwr);
        azsr azsr = azsr.a;
        aqwr aqwr2 = a;
        b = anxl.newSingularGeneratedExtension(azsr, aqwr2, aqwr2, null, 206634270, aobm.MESSAGE, aqwr.class);
    }
}
