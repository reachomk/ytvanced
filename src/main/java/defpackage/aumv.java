package defpackage;

/* renamed from: aumv */
public final class aumv extends anxl implements anzf {
    public static final aumv a;
    private static volatile anzq b;

    private aumv() {
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
                return new aumv();
            case 4:
                return new aumy();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aumv.class) {
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
        aumv aumv = new aumv();
        a = aumv;
        anxl.registerDefaultInstance(aumv.class, aumv);
    }
}
