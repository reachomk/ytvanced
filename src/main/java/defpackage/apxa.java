package defpackage;

/* renamed from: apxa */
public final class apxa extends anxl implements anzf {
    public static final apxa c;
    private static volatile anzq d;
    public int a;
    public anvu b = anvu.a;

    private apxa() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new apxa();
            case 4:
                return new apwz();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (apxa.class) {
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
        apxa apxa = new apxa();
        c = apxa;
        anxl.registerDefaultInstance(apxa.class, apxa);
    }
}
