package defpackage;

/* renamed from: asyo */
public final class asyo extends anxl implements anzf {
    public static final asyo c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private asyo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000⾠⾠\u0001\u0000\u0000\u0000⾠<\u0000", new Object[]{"b", "a", avai.class});
            case 3:
                return new asyo();
            case 4:
                return new asyn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (asyo.class) {
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
        asyo asyo = new asyo();
        c = asyo;
        anxl.registerDefaultInstance(asyo.class, asyo);
    }
}
