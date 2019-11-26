package defpackage;

/* renamed from: atos */
public final class atos extends anxl implements anzf {
    public static final atos c;
    private static volatile anzq d;
    public int a;
    public long b;

    private atos() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\u0002\u0000", new Object[]{"a", "b"});
            case 3:
                return new atos();
            case 4:
                return new ator();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atos.class) {
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
        atos atos = new atos();
        c = atos;
        anxl.registerDefaultInstance(atos.class, atos);
    }
}
