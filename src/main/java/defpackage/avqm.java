package defpackage;

/* renamed from: avqm */
public final class avqm extends anxl implements anzf {
    public static final avqm c;
    private static volatile anzq d;
    public int a;
    public avqk b;

    private avqm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ﳟ㛅ﳟ㛅\u0001\u0000\u0000\u0000ﳟ㛅\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new avqm();
            case 4:
                return new avql();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avqm.class) {
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
        avqm avqm = new avqm();
        c = avqm;
        anxl.registerDefaultInstance(avqm.class, avqm);
    }
}
