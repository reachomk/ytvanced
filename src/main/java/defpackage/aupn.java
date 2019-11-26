package defpackage;

/* renamed from: aupn */
public final class aupn extends anxl implements anzf {
    public static final aupn f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public String e = "";

    private aupn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0004\u0007\u0003\u0005\b\u0004", new Object[]{"a", "b", aurl.a, "c", auru.a, "d", "e"});
            case 3:
                return new aupn();
            case 4:
                return new aupq();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aupn.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aupn aupn = new aupn();
        f = aupn;
        anxl.registerDefaultInstance(aupn.class, aupn);
    }
}
