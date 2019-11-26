package defpackage;

/* renamed from: badw */
public final class badw extends anxl implements anzf {
    public static final badw e;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public bady c;
    public anyd d = anxl.emptyProtobufList();

    private badw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\t\u0000\u0003\u001b", new Object[]{"a", "b", badu.class, "c", "d", babm.class});
            case 3:
                return new badw();
            case 4:
                return new badz();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (badw.class) {
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
        badw badw = new badw();
        e = badw;
        anxl.registerDefaultInstance(badw.class, badw);
    }
}
