package defpackage;

/* renamed from: aofl */
public final class aofl extends anxl implements anzf {
    public static final aofl d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public String c = "";

    private aofl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\n\u0002\u0004\b\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new aofl();
            case 4:
                return new aofk();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aofl.class) {
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
        aofl aofl = new aofl();
        d = aofl;
        anxl.registerDefaultInstance(aofl.class, aofl);
    }
}
