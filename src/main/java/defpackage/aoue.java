package defpackage;

/* renamed from: aoue */
public final class aoue extends anxl implements anzf {
    public static final aoue c;
    private static volatile anzq d;
    public int a;
    public int b;

    private aoue() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", aouh.a()});
            case 3:
                return new aoue();
            case 4:
                return new aouj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aoue.class) {
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
        aoue aoue = new aoue();
        c = aoue;
        anxl.registerDefaultInstance(aoue.class, aoue);
    }
}
