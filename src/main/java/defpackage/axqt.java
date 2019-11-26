package defpackage;

/* renamed from: axqt */
public final class axqt extends anxl implements anzf {
    public static final axqt g;
    private static volatile anzq h;
    public int a;
    public anvu b = anvu.a;
    public int c = -1;
    public String d;
    public boolean e;
    public String f;

    private axqt() {
        String str = "";
        this.d = str;
        this.f = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\n\u0000\u0002\f\u0001\u0003\b\u0002\u0004\u0007\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", axqv.a, "d", "e", "f"});
            case 3:
                return new axqt();
            case 4:
                return new axqs();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axqt.class) {
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
        axqt axqt = new axqt();
        g = axqt;
        anxl.registerDefaultInstance(axqt.class, axqt);
    }
}
