package defpackage;

/* renamed from: ayzw */
public final class ayzw extends anxl implements anzf {
    public static final ayzw e;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public String d = "";

    private ayzw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\b\u0000", new Object[]{"a", "b", ayzk.class, "c", ayzq.class, "d"});
            case 3:
                return new ayzw();
            case 4:
                return new ayzv();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayzw.class) {
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
        ayzw ayzw = new ayzw();
        e = ayzw;
        anxl.registerDefaultInstance(ayzw.class, ayzw);
    }
}
