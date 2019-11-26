package defpackage;

/* renamed from: arwt */
public final class arwt extends anxl implements anzf {
    public static final arwt c;
    private static volatile anzq d;
    public int a;
    public axix b;

    private arwt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001⼎⼎\u0001\u0000\u0000\u0000⼎\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new arwt();
            case 4:
                return new arww();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (arwt.class) {
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
        arwt arwt = new arwt();
        c = arwt;
        anxl.registerDefaultInstance(arwt.class, arwt);
    }
}
