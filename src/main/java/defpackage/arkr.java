package defpackage;

/* renamed from: arkr */
public final class arkr extends anxl implements anzf {
    public static final arkr d;
    private static volatile anzq e;
    public int a;
    public int b;
    public long c;

    private arkr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{"a", "b", arkt.a, "c"});
            case 3:
                return new arkr();
            case 4:
                return new arkq();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arkr.class) {
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
        arkr arkr = new arkr();
        d = arkr;
        anxl.registerDefaultInstance(arkr.class, arkr);
    }
}
