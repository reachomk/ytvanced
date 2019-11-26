package defpackage;

/* renamed from: ayzk */
public final class ayzk extends anxl implements anzf {
    public static final ayzk f;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c = "";
    public boolean d;
    public int e;

    private ayzk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0004\u0007\u0003\u0006\f\u0005", new Object[]{"a", "b", ayza.a(), "c", "d", "e", ayze.a});
            case 3:
                return new ayzk();
            case 4:
                return new ayzj();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayzk.class) {
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
        ayzk ayzk = new ayzk();
        f = ayzk;
        anxl.registerDefaultInstance(ayzk.class, ayzk);
    }
}
