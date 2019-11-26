package defpackage;

/* renamed from: aqes */
public final class aqes extends anxl implements anzf {
    public static final aqes c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aqes() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䂹䂹\u0001\u0000\u0000\u0000䂹<\u0000", new Object[]{"b", "a", awhh.class});
            case 3:
                return new aqes();
            case 4:
                return new aqer();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqes.class) {
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
        aqes aqes = new aqes();
        c = aqes;
        anxl.registerDefaultInstance(aqes.class, aqes);
    }
}
