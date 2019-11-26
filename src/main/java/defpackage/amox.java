package defpackage;

/* renamed from: amox */
public final class amox extends anxl implements anzf {
    public static final amox b;
    private static volatile anzq c;
    public anvu a = anvu.a;

    private amox() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u000f\u000f\u0001\u0000\u0000\u0000\u000f\n", new Object[]{"a"});
            case 3:
                return new amox();
            case 4:
                return new ampa();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (amox.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        amox amox = new amox();
        b = amox;
        anxl.registerDefaultInstance(amox.class, amox);
    }
}
