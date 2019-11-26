package defpackage;

/* renamed from: awgm */
public final class awgm extends anxl implements anzf {
    public static final awgm d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private awgm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new awgm();
            case 4:
                return new awgl();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awgm.class) {
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
        awgm awgm = new awgm();
        d = awgm;
        anxl.registerDefaultInstance(awgm.class, awgm);
    }
}
