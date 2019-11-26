package defpackage;

/* renamed from: azto */
public final class azto extends anxl implements anzf {
    public static final azto a;
    public static final anxr b;
    private static volatile anzq c;

    private azto() {
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
                return new azto();
            case 4:
                return new aztr();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (azto.class) {
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
        azto azto = new azto();
        a = azto;
        anxl.registerDefaultInstance(azto.class, azto);
        azwn azwn = azwn.a;
        azto azto2 = a;
        b = anxl.newSingularGeneratedExtension(azwn, azto2, azto2, null, 158796327, aobm.MESSAGE, azto.class);
    }
}
