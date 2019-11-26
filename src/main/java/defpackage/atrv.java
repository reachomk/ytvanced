package defpackage;

/* renamed from: atrv */
public final class atrv extends anxl implements anzf {
    public static final atrv f;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public azfa c;
    public atst d;
    public int e;

    private atrv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\t\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", "d", "e", attm.a});
            case 3:
                return new atrv();
            case 4:
                return new atru();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atrv.class) {
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
        atrv atrv = new atrv();
        f = atrv;
        anxl.registerDefaultInstance(atrv.class, atrv);
    }
}
