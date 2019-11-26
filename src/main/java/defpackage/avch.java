package defpackage;

/* renamed from: avch */
public final class avch extends anxl implements anzf {
    public static final avch c;
    private static volatile anzq d;
    public int a;
    public int b;

    private avch() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", avcj.a});
            case 3:
                return new avch();
            case 4:
                return new avcl();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avch.class) {
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
        avch avch = new avch();
        c = avch;
        anxl.registerDefaultInstance(avch.class, avch);
    }
}
