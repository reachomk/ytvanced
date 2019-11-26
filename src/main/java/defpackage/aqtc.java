package defpackage;

/* renamed from: aqtc */
public final class aqtc extends anxl implements anzf {
    public static final aqtc c;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private aqtc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqtc();
            case 4:
                return new aqtf();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqtc.class) {
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
        aqtc aqtc = new aqtc();
        c = aqtc;
        anxl.registerDefaultInstance(aqtc.class, aqtc);
    }
}
