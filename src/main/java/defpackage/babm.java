package defpackage;

/* renamed from: babm */
public final class babm extends anxl implements anzf {
    public static final babm c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private babm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", badk.class, bacz.class, bada.class, babo.class, babq.class, baam.class, badt.class});
            case 3:
                return new babm();
            case 4:
                return new babp();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (babm.class) {
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
        babm babm = new babm();
        c = babm;
        anxl.registerDefaultInstance(babm.class, babm);
    }
}
