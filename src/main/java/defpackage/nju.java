package defpackage;

/* renamed from: nju */
public final class nju extends anxl implements anzf {
    public static final nju d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public anvu c = anvu.a;

    private nju() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004\n\u0000\u0005\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nju();
            case 4:
                return new njt();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (nju.class) {
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
        nju nju = new nju();
        d = nju;
        anxl.registerDefaultInstance(nju.class, nju);
    }
}
