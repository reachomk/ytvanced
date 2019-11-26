package defpackage;

/* renamed from: afij */
public final class afij extends anxl implements anzf {
    public static final afij d;
    private static volatile anzq e;
    public long a;
    public int b;
    public long c;

    private afij() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new afij();
            case 4:
                return new afii();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (afij.class) {
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
        afij afij = new afij();
        d = afij;
        anxl.registerDefaultInstance(afij.class, afij);
    }
}
