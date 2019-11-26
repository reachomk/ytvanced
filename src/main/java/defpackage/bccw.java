package defpackage;

/* renamed from: bccw */
public final class bccw extends anxl implements anzf {
    public static final bccw d;
    private static volatile anzq e;
    public int a;
    public int b;
    public anxz c = anxl.emptyIntList();

    private bccw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002'", new Object[]{"a", "b", bccx.a, "c"});
            case 3:
                return new bccw();
            case 4:
                return new bccv();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (bccw.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        bccw bccw = new bccw();
        d = bccw;
        anxl.registerDefaultInstance(bccw.class, bccw);
    }
}
