package defpackage;

/* renamed from: baaa */
public final class baaa extends anxl implements anzf {
    public static final baaa e;
    private static volatile anzq f;
    public int a;
    public anvu b = anvu.a;
    public int c;
    public int d;

    private baaa() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0000\u0004\n\u0002\u0007\u000b\u0005\n\u000b\b", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new baaa();
            case 4:
                return new baad();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (baaa.class) {
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
        baaa baaa = new baaa();
        e = baaa;
        anxl.registerDefaultInstance(baaa.class, baaa);
    }
}
