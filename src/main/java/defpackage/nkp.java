package defpackage;

/* renamed from: nkp */
public final class nkp extends anxl implements anzf {
    public static final nkp e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public long c;
    public long d;

    private nkp() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\b\u0000\u0003\u0002\u0001\u0004\u0002\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nkp();
            case 4:
                return new nks();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (nkp.class) {
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
        nkp nkp = new nkp();
        e = nkp;
        anxl.registerDefaultInstance(nkp.class, nkp);
    }
}
