package defpackage;

/* renamed from: amph */
public final class amph extends anxl implements anzf {
    public static final amph b;
    private static volatile anzq c;
    public anyd a = anxl.emptyProtobufList();

    private amph() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", anrk.class});
            case 3:
                return new amph();
            case 4:
                return new ampk();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (amph.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        amph amph = new amph();
        b = amph;
        anxl.registerDefaultInstance(amph.class, amph);
    }
}
