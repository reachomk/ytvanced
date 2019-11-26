package defpackage;

/* renamed from: arzg */
public final class arzg extends anxl implements anzf {
    public static final arzg a;
    private static volatile anzq b;

    private arzg() {
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
                return new arzg();
            case 4:
                return new arzj();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (arzg.class) {
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
        arzg arzg = new arzg();
        a = arzg;
        anxl.registerDefaultInstance(arzg.class, arzg);
    }
}
