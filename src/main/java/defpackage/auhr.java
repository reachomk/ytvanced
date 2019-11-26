package defpackage;

/* renamed from: auhr */
public final class auhr extends anxl implements anzf {
    public static final auhr d;
    private static volatile anzq e;
    public int a;
    public auhj b;
    public int c;

    private auhr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", auic.a});
            case 3:
                return new auhr();
            case 4:
                return new auhq();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auhr.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auhr auhr = new auhr();
        d = auhr;
        anxl.registerDefaultInstance(auhr.class, auhr);
    }
}
