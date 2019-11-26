package defpackage;

/* renamed from: bacc */
public final class bacc extends anxl implements anzf {
    public static final anyb d = new bacf();
    public static final bacc e;
    private static volatile anzq f;
    public int a;
    public int b;
    public anxz c = anxl.emptyIntList();

    private bacc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001e", new Object[]{"a", "b", bach.a(), "c", bach.a()});
            case 3:
                return new bacc();
            case 4:
                return new bace();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (bacc.class) {
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
        bacc bacc = new bacc();
        e = bacc;
        anxl.registerDefaultInstance(bacc.class, bacc);
    }
}
