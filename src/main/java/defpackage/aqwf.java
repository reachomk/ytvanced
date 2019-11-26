package defpackage;

/* renamed from: aqwf */
public final class aqwf extends anxl implements anzf {
    public static final aqwf a;
    private static volatile anzq b;

    private aqwf() {
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
                return new aqwf();
            case 4:
                return new aqwe();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aqwf.class) {
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
        aqwf aqwf = new aqwf();
        a = aqwf;
        anxl.registerDefaultInstance(aqwf.class, aqwf);
    }
}
