package defpackage;

/* renamed from: avsw */
public final class avsw extends anxl implements anzf {
    public static final avsw e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public long d;

    private avsw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b\u0003\u0002\u0001", new Object[]{"a", "b", "c", avsy.class, "d"});
            case 3:
                return new avsw();
            case 4:
                return new avsz();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avsw.class) {
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
        avsw avsw = new avsw();
        e = avsw;
        anxl.registerDefaultInstance(avsw.class, avsw);
    }
}
