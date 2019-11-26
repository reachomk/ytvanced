package defpackage;

/* renamed from: aost */
public final class aost extends anxl implements anzf {
    public static final aost c;
    private static volatile anzq d;
    public int a;
    public aosr b;

    private aost() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ﲡ㤸ﲡ㤸\u0001\u0000\u0000\u0000ﲡ㤸\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new aost();
            case 4:
                return new aosw();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aost.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aost aost = new aost();
        c = aost;
        anxl.registerDefaultInstance(aost.class, aost);
    }
}
