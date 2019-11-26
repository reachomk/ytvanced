package defpackage;

/* renamed from: aqnv */
public final class aqnv extends anxl implements anzf {
    public static final aqnv f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public anyd d = anxl.emptyProtobufList();
    public int e;

    private aqnv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u001a\u0004\u0004\u0002", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqnv();
            case 4:
                return new aqnu();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqnv.class) {
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
        aqnv aqnv = new aqnv();
        f = aqnv;
        anxl.registerDefaultInstance(aqnv.class, aqnv);
    }
}
