package defpackage;

/* renamed from: arkz */
public final class arkz extends anxl implements anzf {
    public static final arkz f;
    private static volatile anzq g;
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;

    private arkz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", "d", "e", arkw.a});
            case 3:
                return new arkz();
            case 4:
                return new arky();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arkz.class) {
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
        arkz arkz = new arkz();
        f = arkz;
        anxl.registerDefaultInstance(arkz.class, arkz);
    }
}
