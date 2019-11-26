package defpackage;

/* renamed from: awyh */
public final class awyh extends anxl implements anzf {
    public static final awyh c;
    private static volatile anzq d;
    public int a;
    public awyf b;

    private awyh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001䝮䝮\u0001\u0000\u0000\u0000䝮\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new awyh();
            case 4:
                return new awyj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (awyh.class) {
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
        awyh awyh = new awyh();
        c = awyh;
        anxl.registerDefaultInstance(awyh.class, awyh);
    }
}
