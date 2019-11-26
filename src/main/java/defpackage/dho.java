package defpackage;

/* renamed from: dho */
public final class dho extends anxl implements anzf {
    public static final dho f;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public boolean e;

    private dho() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0003\u0001\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003\u0007\u0001\u0004<\u0000\u0006\b\u0000", new Object[]{"c", "b", "a", "e", dhs.class, "d"});
            case 3:
                return new dho();
            case 4:
                return new dhr();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (dho.class) {
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
        dho dho = new dho();
        f = dho;
        anxl.registerDefaultInstance(dho.class, dho);
    }
}
