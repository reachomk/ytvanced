package defpackage;

/* renamed from: asxb */
public final class asxb extends anxl implements anzf {
    public static final asxb d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public int c = 1;

    private asxb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", atnv.a});
            case 3:
                return new asxb();
            case 4:
                return new asxe();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (asxb.class) {
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
        asxb asxb = new asxb();
        d = asxb;
        anxl.registerDefaultInstance(asxb.class, asxb);
    }
}
