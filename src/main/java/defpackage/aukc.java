package defpackage;

/* renamed from: aukc */
public final class aukc extends anxl implements anzf {
    public static final aukc d;
    private static volatile anzq e;
    public int a;
    public boolean b;
    public aorp c;

    private aukc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aukc();
            case 4:
                return new aukb();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aukc.class) {
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
        aukc aukc = new aukc();
        d = aukc;
        anxl.registerDefaultInstance(aukc.class, aukc);
    }
}
