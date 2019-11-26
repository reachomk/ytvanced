package defpackage;

/* renamed from: amoz */
public final class amoz extends anxl implements anzf {
    public static final amoz b;
    private static volatile anzq c;
    public anvu a = anvu.a;

    private amoz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0000\u0001\u0000\u0000\t\t\u0001\u0000\u0000\u0000\t\n", new Object[]{"a"});
            case 3:
                return new amoz();
            case 4:
                return new ampc();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (amoz.class) {
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
        amoz amoz = new amoz();
        b = amoz;
        anxl.registerDefaultInstance(amoz.class, amoz);
    }
}
