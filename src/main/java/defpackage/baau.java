package defpackage;

/* renamed from: baau */
public final class baau extends anxl implements anzf {
    public static final anyb d = new baax();
    public static final baau e;
    private static volatile anzq f;
    public int a;
    public int b;
    public anxz c = anxl.emptyIntList();

    private baau() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001e", new Object[]{"a", "b", baaz.a(), "c", baaz.a()});
            case 3:
                return new baau();
            case 4:
                return new baaw();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (baau.class) {
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
        baau baau = new baau();
        e = baau;
        anxl.registerDefaultInstance(baau.class, baau);
    }
}
