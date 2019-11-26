package defpackage;

/* renamed from: avpd */
public final class avpd extends anxl implements anzf {
    public static final avpd e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    private avpd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u000b\u0001\u0003\u000b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new avpd();
            case 4:
                return new avpc();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avpd.class) {
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
        avpd avpd = new avpd();
        e = avpd;
        anxl.registerDefaultInstance(avpd.class, avpd);
    }
}
