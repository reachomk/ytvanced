package defpackage;

/* renamed from: arkn */
public final class arkn extends anxl implements anzf {
    public static final arkn c;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private arkn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0001", new Object[]{"a", "b"});
            case 3:
                return new arkn();
            case 4:
                return new arkm();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (arkn.class) {
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
        arkn arkn = new arkn();
        c = arkn;
        anxl.registerDefaultInstance(arkn.class, arkn);
    }
}
