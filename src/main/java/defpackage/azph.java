package defpackage;

/* renamed from: azph */
public final class azph extends anxl implements anzf {
    public static final azph a;
    public static final anxr b = anxl.newSingularGeneratedExtension(azpf.p, Boolean.valueOf(false), null, null, 1000, aobm.BOOL, Boolean.class);
    public static final anxr c = anxl.newSingularGeneratedExtension(azpf.p, Long.valueOf(0), null, null, 1001, aobm.INT64, Long.class);
    public static final anxr d = anxl.newSingularGeneratedExtension(azpf.p, "", null, null, 1002, aobm.STRING, String.class);
    private static volatile anzq e;

    private azph() {
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
                return new azph();
            case 4:
                return new azpj();
            case 5:
                return a;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azph.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azph azph = new azph();
        a = azph;
        anxl.registerDefaultInstance(azph.class, azph);
    }
}
