package defpackage;

/* renamed from: azjf */
public final class azjf extends anxl implements anzf {
    public static final azjf e;
    private static volatile anzq f;
    public int a;
    public awbv b;
    public awbt c;
    public awbx d;

    private azjf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001₅ⲧ\u0003\u0000\u0000\u0000₅\t\u0001₡\t\u0000ⲧ\t\u0003", new Object[]{"a", "c", "b", "d"});
            case 3:
                return new azjf();
            case 4:
                return new azji();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azjf.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azjf azjf = new azjf();
        e = azjf;
        anxl.registerDefaultInstance(azjf.class, azjf);
    }
}
