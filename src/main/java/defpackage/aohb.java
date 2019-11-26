package defpackage;

/* renamed from: aohb */
public final class aohb extends anxl implements anzf {
    public static final aohb e;
    private static volatile anzq f;
    public int a;
    public aogz b;
    public aohd c;
    public boolean d;

    private aohb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aohb();
            case 4:
                return new aoha();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aohb.class) {
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
        aohb aohb = new aohb();
        e = aohb;
        anxl.registerDefaultInstance(aohb.class, aohb);
    }
}
