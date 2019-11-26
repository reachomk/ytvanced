package defpackage;

/* renamed from: arcy */
public final class arcy extends anxl implements anzf {
    public static final arcy a;
    private static volatile anzq b;

    private arcy() {
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
                return new arcy();
            case 4:
                return new arcx();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (arcy.class) {
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
        arcy arcy = new arcy();
        a = arcy;
        anxl.registerDefaultInstance(arcy.class, arcy);
    }
}
