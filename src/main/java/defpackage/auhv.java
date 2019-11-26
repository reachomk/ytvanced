package defpackage;

/* renamed from: auhv */
public final class auhv extends anxl implements anzf {
    public static final auhv f;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public long c;
    public float d;
    public float e;

    private auhv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0001\u0002\u0004\u0001\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new auhv();
            case 4:
                return new auhu();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (auhv.class) {
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
        auhv auhv = new auhv();
        f = auhv;
        anxl.registerDefaultInstance(auhv.class, auhv);
    }
}
