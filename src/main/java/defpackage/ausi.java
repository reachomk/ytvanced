package defpackage;

/* renamed from: ausi */
public final class ausi extends anxl implements anzf {
    public static final ausi e;
    private static volatile anzq f;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();

    private ausi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\f\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", ausj.a, "c", ause.class, "d", ause.class});
            case 3:
                return new ausi();
            case 4:
                return new aush();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ausi.class) {
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
        ausi ausi = new ausi();
        e = ausi;
        anxl.registerDefaultInstance(ausi.class, ausi);
    }
}
