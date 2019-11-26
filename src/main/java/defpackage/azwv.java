package defpackage;

/* renamed from: azwv */
public final class azwv extends anxl implements anzf {
    public static final azwv a;
    public static final anxr b;
    private static volatile anzq c;

    private azwv() {
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
                return new azwv();
            case 4:
                return new azwu();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (azwv.class) {
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
        azwv azwv = new azwv();
        a = azwv;
        anxl.registerDefaultInstance(azwv.class, azwv);
        azsr azsr = azsr.a;
        azwv azwv2 = a;
        b = anxl.newSingularGeneratedExtension(azsr, azwv2, azwv2, null, 225399221, aobm.MESSAGE, azwv.class);
    }
}
