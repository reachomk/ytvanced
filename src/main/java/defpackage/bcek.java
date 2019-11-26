package defpackage;

/* renamed from: bcek */
public final class bcek extends anxl implements anzf {
    public static final bcek e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anye c = anxl.emptyLongList();
    public long d;

    private bcek() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0017", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new bcek();
            case 4:
                return new bcej();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (bcek.class) {
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
        bcek bcek = new bcek();
        e = bcek;
        anxl.registerDefaultInstance(bcek.class, bcek);
    }
}
