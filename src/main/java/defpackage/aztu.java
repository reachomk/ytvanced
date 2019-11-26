package defpackage;

/* renamed from: aztu */
public final class aztu extends anxl implements anzf {
    public static final aztu c;
    private static volatile anzq d;
    public int a;
    public int b;

    private aztu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", aztw.a});
            case 3:
                return new aztu();
            case 4:
                return new aztx();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aztu.class) {
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
        aztu aztu = new aztu();
        c = aztu;
        anxl.registerDefaultInstance(aztu.class, aztu);
    }
}
