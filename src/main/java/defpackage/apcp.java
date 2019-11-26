package defpackage;

/* renamed from: apcp */
public final class apcp extends anxl implements anzf {
    public static final apcp c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private apcp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000\"\"\u0001\u0000\u0000\u0000\"<\u0000", new Object[]{"b", "a", apct.class});
            case 3:
                return new apcp();
            case 4:
                return new apco();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (apcp.class) {
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
        apcp apcp = new apcp();
        c = apcp;
        anxl.registerDefaultInstance(apcp.class, apcp);
    }
}
