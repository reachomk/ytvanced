package defpackage;

/* renamed from: ampb */
public final class ampb extends anxl implements anzf {
    public static final ampb c;
    private static volatile anzq d;
    public String a = "";
    public float b;

    private ampb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0001", new Object[]{"a", "b"});
            case 3:
                return new ampb();
            case 4:
                return new ampe();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ampb.class) {
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
        ampb ampb = new ampb();
        c = ampb;
        anxl.registerDefaultInstance(ampb.class, ampb);
    }
}
