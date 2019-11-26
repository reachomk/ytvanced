package defpackage;

/* renamed from: asik */
public final class asik extends anxl implements anzf {
    public static final asik e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;

    private asik() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u000f\u0003\u0000\u0000\u0000\u0003\b\u0003\u0007\u0007\u0005\u000f\u0007\f", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new asik();
            case 4:
                return new asin();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asik.class) {
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
        asik asik = new asik();
        e = asik;
        anxl.registerDefaultInstance(asik.class, asik);
    }
}
