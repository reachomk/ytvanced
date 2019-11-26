package defpackage;

/* renamed from: aqol */
public final class aqol extends anxl implements anzf {
    public static final aqol c;
    private static volatile anzq d;
    public int a;
    public aqnv b;

    private aqol() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001䔠䔠\u0001\u0000\u0000\u0000䔠\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqol();
            case 4:
                return new aqok();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqol.class) {
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
        aqol aqol = new aqol();
        c = aqol;
        anxl.registerDefaultInstance(aqol.class, aqol);
    }
}
