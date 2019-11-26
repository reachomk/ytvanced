package defpackage;

/* renamed from: apfq */
public final class apfq extends anxl implements anzf {
    public static final apfq f;
    private static volatile anzq g;
    public int a;
    public apft b;
    public apft c;
    public apft d;
    public apft e;

    private apfq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new apfq();
            case 4:
                return new apfv();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (apfq.class) {
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
        apfq apfq = new apfq();
        f = apfq;
        anxl.registerDefaultInstance(apfq.class, apfq);
    }
}
