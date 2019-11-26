package defpackage;

/* renamed from: azuh */
public final class azuh extends anxl implements anzf {
    public static final azuh c;
    public static final anxr d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;

    private azuh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new azuh();
            case 4:
                return new azug();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azuh.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        azuh azuh = new azuh();
        c = azuh;
        anxl.registerDefaultInstance(azuh.class, azuh);
        azvv azvv = azvv.a;
        azuh azuh2 = c;
        d = anxl.newSingularGeneratedExtension(azvv, azuh2, azuh2, null, 169768054, aobm.MESSAGE, azuh.class);
    }
}
