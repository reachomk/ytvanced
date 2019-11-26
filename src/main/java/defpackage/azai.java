package defpackage;

/* renamed from: azai */
public final class azai extends anxl implements anzf {
    public static final anyb b = new azah();
    public static final azai c;
    private static volatile anzq d;
    public anxz a = anxl.emptyIntList();

    private azai() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", ayzc.a()});
            case 3:
                return new azai();
            case 4:
                return new azak();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (azai.class) {
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
        azai azai = new azai();
        c = azai;
        anxl.registerDefaultInstance(azai.class, azai);
    }
}
