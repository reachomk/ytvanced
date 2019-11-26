package defpackage;

/* renamed from: arfq */
public final class arfq extends anxl implements anzf {
    public static final arfq e;
    private static volatile anzq f;
    public int a;
    public long b;
    public int c;
    public anvu d = anvu.a;

    private arfq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\n\u0002\u0004\u0002\u0000\u0005\f\u0001", new Object[]{"a", "d", "b", "c", arfs.a});
            case 3:
                return new arfq();
            case 4:
                return new arft();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arfq.class) {
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
        arfq arfq = new arfq();
        e = arfq;
        anxl.registerDefaultInstance(arfq.class, arfq);
    }
}
