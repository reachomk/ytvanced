package defpackage;

/* renamed from: asjz */
public final class asjz extends anxl implements anzf {
    public static final asjz e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    private asjz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0004\f\u0005\u0005\b\u0006", new Object[]{"a", "b", "c", askb.a, "d"});
            case 3:
                return new asjz();
            case 4:
                return new asjy();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asjz.class) {
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
        asjz asjz = new asjz();
        e = asjz;
        anxl.registerDefaultInstance(asjz.class, asjz);
    }
}