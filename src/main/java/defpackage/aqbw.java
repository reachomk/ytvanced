package defpackage;

/* renamed from: aqbw */
public final class aqbw extends anxl implements anzf {
    public static final aqbw c;
    private static volatile anzq d;
    public int a;
    public aqbu b;

    private aqbw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㭎㭎\u0001\u0000\u0000\u0000㭎\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new aqbw();
            case 4:
                return new aqbv();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqbw.class) {
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
        aqbw aqbw = new aqbw();
        c = aqbw;
        anxl.registerDefaultInstance(aqbw.class, aqbw);
    }
}
