package defpackage;

/* renamed from: aoim */
public final class aoim extends anxl implements anzf {
    public static final aoim f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public int d;
    public String e = "";

    private aoim() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0005\b\u0004", new Object[]{"a", "b", arzp.a, "c", arzo.a, "d", arzq.a, "e"});
            case 3:
                return new aoim();
            case 4:
                return new aoil();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aoim.class) {
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
        aoim aoim = new aoim();
        f = aoim;
        anxl.registerDefaultInstance(aoim.class, aoim);
    }
}
