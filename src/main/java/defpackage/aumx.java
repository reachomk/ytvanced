package defpackage;

/* renamed from: aumx */
public final class aumx extends anxl implements anzf {
    public static final aumx a;
    private static volatile anzq b;

    private aumx() {
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
                return new aumx();
            case 4:
                return new auna();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aumx.class) {
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
        aumx aumx = new aumx();
        a = aumx;
        anxl.registerDefaultInstance(aumx.class, aumx);
    }
}
