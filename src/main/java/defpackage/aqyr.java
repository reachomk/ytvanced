package defpackage;

/* renamed from: aqyr */
public final class aqyr extends anxl implements anzf {
    public static final aqyr d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;

    private aqyr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000", new Object[]{"a", "b", aqyp.class, "c"});
            case 3:
                return new aqyr();
            case 4:
                return new aqyq();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqyr.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqyr aqyr = new aqyr();
        d = aqyr;
        anxl.registerDefaultInstance(aqyr.class, aqyr);
    }
}
