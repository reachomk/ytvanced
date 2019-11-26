package defpackage;

/* renamed from: bcbb */
public final class bcbb extends anxl implements anzf {
    public static final bcbb c;
    private static volatile anzq d;
    public int a;
    public bcbf b;

    private bcbb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t\u0005", new Object[]{"a", "b"});
            case 3:
                return new bcbb();
            case 4:
                return new bcbe();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (bcbb.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        bcbb bcbb = new bcbb();
        c = bcbb;
        anxl.registerDefaultInstance(bcbb.class, bcbb);
    }
}
