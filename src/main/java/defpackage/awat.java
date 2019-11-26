package defpackage;

/* renamed from: awat */
public final class awat extends anxl implements anzf {
    public static final awat g;
    private static volatile anzq h;
    public int a;
    public awan b;
    public aoim c;
    public awav d;
    public awax e;
    public awar f;

    private awat() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awat();
            case 4:
                return new awas();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awat.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awat awat = new awat();
        g = awat;
        anxl.registerDefaultInstance(awat.class, awat);
    }
}
