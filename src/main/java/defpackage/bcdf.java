package defpackage;

/* renamed from: bcdf */
public final class bcdf extends anxl implements anzf {
    public static final bcdf f;
    private static volatile anzq g;
    public int a;
    public long b;
    public boolean c;
    public int d;
    public String e = "";

    private bcdf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0003\u0004\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new bcdf();
            case 4:
                return new bcdi();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (bcdf.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcdf bcdf = new bcdf();
        f = bcdf;
        anxl.registerDefaultInstance(bcdf.class, bcdf);
    }
}
