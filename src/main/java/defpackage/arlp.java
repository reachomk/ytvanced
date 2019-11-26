package defpackage;

/* renamed from: arlp */
public final class arlp extends anxl implements anzf {
    public static final arlp d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private arlp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\f\u0001\u0004\f\u0003", new Object[]{"a", "b", arlq.a, "c", arlm.a});
            case 3:
                return new arlp();
            case 4:
                return new arlo();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arlp.class) {
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
        arlp arlp = new arlp();
        d = arlp;
        anxl.registerDefaultInstance(arlp.class, arlp);
    }
}
