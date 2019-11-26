package defpackage;

/* renamed from: aqzd */
public final class aqzd extends anxl implements anzf {
    public static final aqzd a;
    private static volatile anzq b;

    private aqzd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new aqzd();
            case 4:
                return new aqzc();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aqzd.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqzd aqzd = new aqzd();
        a = aqzd;
        anxl.registerDefaultInstance(aqzd.class, aqzd);
    }
}
