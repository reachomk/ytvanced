package defpackage;

/* renamed from: aokq */
public final class aokq extends anxl implements anzf {
    public static final aokq d;
    private static volatile anzq e;
    public int a;
    public aoko b;
    public aohb c;

    private aokq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001㋿㋿\u0002\u0000\u0000\u0000㋿\t\u0001㋿\t\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new aokq();
            case 4:
                return new aokr();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aokq.class) {
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
        aokq aokq = new aokq();
        d = aokq;
        anxl.registerDefaultInstance(aokq.class, aokq);
    }
}
