package defpackage;

/* renamed from: asxr */
public final class asxr extends anxl implements anzf {
    public static final asxr d;
    private static volatile anzq e;
    public int a;
    public int b;
    public aswj c;

    private asxr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0000\u0003\t\u0002", new Object[]{"a", "b", asxt.a, "c"});
            case 3:
                return new asxr();
            case 4:
                return new asxu();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (asxr.class) {
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
        asxr asxr = new asxr();
        d = asxr;
        anxl.registerDefaultInstance(asxr.class, asxr);
    }
}
