package defpackage;

/* renamed from: aztl */
public final class aztl extends anxl implements anzf {
    public static final aztl b;
    public static final anxr c;
    private static volatile anzq d;
    public anyy a = anyy.b;

    private aztl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", aztn.a});
            case 3:
                return new aztl();
            case 4:
                return new aztk();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aztl.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aztl aztl = new aztl();
        b = aztl;
        anxl.registerDefaultInstance(aztl.class, aztl);
        azth azth = azth.a;
        aztl aztl2 = b;
        c = anxl.newSingularGeneratedExtension(azth, aztl2, aztl2, null, 188495463, aobm.MESSAGE, aztl.class);
    }
}
