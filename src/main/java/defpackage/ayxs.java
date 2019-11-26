package defpackage;

/* renamed from: ayxs */
public final class ayxs extends anxl implements anzf {
    public static final ayxs g;
    private static volatile anzq h;
    public int a;
    public ayxu b;
    public int c;
    public int d;
    public long e;
    public long f;

    private ayxs() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0003\u0003\u0005\u0003\u0004", new Object[]{"a", "b", "c", ayxy.a, "d", aqvf.a, "e", "f"});
            case 3:
                return new ayxs();
            case 4:
                return new ayxv();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ayxs.class) {
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
        ayxs ayxs = new ayxs();
        g = ayxs;
        anxl.registerDefaultInstance(ayxs.class, ayxs);
    }
}
