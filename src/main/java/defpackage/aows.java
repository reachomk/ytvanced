package defpackage;

/* renamed from: aows */
public final class aows extends anxl implements anzf {
    public static final aows a;
    public static final anxr b = anxl.newSingularGeneratedExtension(aoli.u, Boolean.valueOf(false), null, null, 120958174, aobm.BOOL, Boolean.class);
    private static volatile anzq c;

    private aows() {
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
                return new aows();
            case 4:
                return new aowv();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aows.class) {
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
        aows aows = new aows();
        a = aows;
        anxl.registerDefaultInstance(aows.class, aows);
    }
}
