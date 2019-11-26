package defpackage;

/* renamed from: avss */
public final class avss extends anxl implements anzf {
    public static final avss c;
    private static volatile anzq d;
    public int a;
    public avsq b;

    private avss() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001䒑䒑\u0001\u0000\u0000\u0000䒑\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new avss();
            case 4:
                return new avsv();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avss.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avss avss = new avss();
        c = avss;
        anxl.registerDefaultInstance(avss.class, avss);
    }
}
