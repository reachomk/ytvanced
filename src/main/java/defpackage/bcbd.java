package defpackage;

/* renamed from: bcbd */
public final class bcbd extends anxl implements anzf {
    public static final bcbd e;
    private static volatile anzq f;
    public int a;
    public long b;
    public int c;
    public anyd d = anxl.emptyProtobufList();

    private bcbd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u000b\u0001\u0003\u001a", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new bcbd();
            case 4:
                return new bcbg();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (bcbd.class) {
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
        bcbd bcbd = new bcbd();
        e = bcbd;
        anxl.registerDefaultInstance(bcbd.class, bcbd);
    }
}
