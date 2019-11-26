package defpackage;

/* renamed from: arcb */
public final class arcb extends anxl implements anzf {
    public static final arcb e;
    private static volatile anzq f;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";

    private arcb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003\b\u0002", new Object[]{"c", "b", "a", azsm.a, azsn.a, "d"});
            case 3:
                return new arcb();
            case 4:
                return new arca();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arcb.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arcb arcb = new arcb();
        e = arcb;
        anxl.registerDefaultInstance(arcb.class, arcb);
    }
}
