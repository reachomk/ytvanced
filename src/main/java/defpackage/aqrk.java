package defpackage;

/* renamed from: aqrk */
public final class aqrk extends anxl implements anzf {
    public static final aqrk c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aqrk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000㡿㡿\u0001\u0000\u0000\u0000㡿<\u0000", new Object[]{"b", "a", apfb.class});
            case 3:
                return new aqrk();
            case 4:
                return new aqrj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqrk.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqrk aqrk = new aqrk();
        c = aqrk;
        anxl.registerDefaultInstance(aqrk.class, aqrk);
    }
}
