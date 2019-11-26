package defpackage;

/* renamed from: atsv */
public final class atsv extends anxl implements anzf {
    public static final atsv g;
    private static volatile anzq h;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public String f = "";

    private atsv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\f\u0003\u0005\b\u0004", new Object[]{"a", "b", avsi.a(), "c", "d", avof.a, "e", avoi.a, "f"});
            case 3:
                return new atsv();
            case 4:
                return new atsu();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atsv.class) {
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
        atsv atsv = new atsv();
        g = atsv;
        anxl.registerDefaultInstance(atsv.class, atsv);
    }
}
