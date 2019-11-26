package defpackage;

/* renamed from: apuu */
public final class apuu extends anxl implements anzf {
    public static final apuu c;
    private static volatile anzq d;
    public int a;
    public anvu b = anvu.a;

    private apuu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new apuu();
            case 4:
                return new aput();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (apuu.class) {
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
        apuu apuu = new apuu();
        c = apuu;
        anxl.registerDefaultInstance(apuu.class, apuu);
    }
}
