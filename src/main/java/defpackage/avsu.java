package defpackage;

/* renamed from: avsu */
public final class avsu extends anxl implements anzf {
    public static final avsu e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();

    private avsu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0007\u0000", new Object[]{"a", "c", avsw.class, "d", avsy.class, "b"});
            case 3:
                return new avsu();
            case 4:
                return new avsx();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avsu.class) {
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
        avsu avsu = new avsu();
        e = avsu;
        anxl.registerDefaultInstance(avsu.class, avsu);
    }
}
