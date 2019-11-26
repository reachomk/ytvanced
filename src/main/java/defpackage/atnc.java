package defpackage;

/* renamed from: atnc */
public final class atnc extends anxl implements anzf {
    public static final atnc d;
    private static volatile anzq e;
    public int a;
    public int b;
    public atne c;

    private atnc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"a", "b", atmr.a, "c"});
            case 3:
                return new atnc();
            case 4:
                return new atnb();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atnc.class) {
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
        atnc atnc = new atnc();
        d = atnc;
        anxl.registerDefaultInstance(atnc.class, atnc);
    }
}
