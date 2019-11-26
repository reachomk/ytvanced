package defpackage;

/* renamed from: azrj */
public final class azrj extends anxl implements anzf {
    public static final azrj e;
    private static volatile anzq f;
    public int a;
    public int b;
    public boolean c;
    public String d = "";

    private azrj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\b\u0002", new Object[]{"a", "b", azrg.a, "c", "d"});
            case 3:
                return new azrj();
            case 4:
                return new azri();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azrj.class) {
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
        azrj azrj = new azrj();
        e = azrj;
        anxl.registerDefaultInstance(azrj.class, azrj);
    }
}
