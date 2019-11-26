package defpackage;

/* renamed from: udq */
public final class udq extends anxl implements anzf {
    public static final udq d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;

    private udq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000", new Object[]{"a", "b", udo.class, "c"});
            case 3:
                return new udq();
            case 4:
                return new udt();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (udq.class) {
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
        udq udq = new udq();
        d = udq;
        anxl.registerDefaultInstance(udq.class, udq);
    }
}
