package defpackage;

/* renamed from: amol */
public final class amol extends anxl implements anzf {
    public static final amol c;
    private static volatile anzq d;
    public int a;
    public int b;

    private amol() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new amol();
            case 4:
                return new amoo();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (amol.class) {
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
        amol amol = new amol();
        c = amol;
        anxl.registerDefaultInstance(amol.class, amol);
    }
}
