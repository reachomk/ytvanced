package defpackage;

/* renamed from: aqeu */
public final class aqeu extends anxl implements anzf {
    public static final aqeu c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aqeu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䂺䂺\u0001\u0000\u0000\u0000䂺<\u0000", new Object[]{"b", "a", aqfc.class});
            case 3:
                return new aqeu();
            case 4:
                return new aqet();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqeu.class) {
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
        aqeu aqeu = new aqeu();
        c = aqeu;
        anxl.registerDefaultInstance(aqeu.class, aqeu);
    }
}
