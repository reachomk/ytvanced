package defpackage;

/* renamed from: aytd */
public final class aytd extends anxl implements anzf {
    public static final aytd a;
    private static volatile anzq b;

    private aytd() {
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
                return new aytd();
            case 4:
                return new aytg();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aytd.class) {
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
        aytd aytd = new aytd();
        a = aytd;
        anxl.registerDefaultInstance(aytd.class, aytd);
    }
}
