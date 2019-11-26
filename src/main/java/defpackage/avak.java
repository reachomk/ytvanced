package defpackage;

/* renamed from: avak */
public final class avak extends anxl implements anzf {
    public static final avak d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public int c;

    private avak() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001\n\u0000\u0004\f\u0003", new Object[]{"a", "b", "c", atla.a});
            case 3:
                return new avak();
            case 4:
                return new avan();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avak.class) {
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
        avak avak = new avak();
        d = avak;
        anxl.registerDefaultInstance(avak.class, avak);
    }
}
