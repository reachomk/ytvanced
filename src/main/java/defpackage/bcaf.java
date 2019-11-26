package defpackage;

/* renamed from: bcaf */
public final class bcaf extends anxl implements anzf {
    public static final bcaf d;
    private static volatile anzq e;
    public int a;
    public int b;
    public bcah c;

    private bcaf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new bcaf();
            case 4:
                return new bcai();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (bcaf.class) {
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
        bcaf bcaf = new bcaf();
        d = bcaf;
        anxl.registerDefaultInstance(bcaf.class, bcaf);
    }
}
