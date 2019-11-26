package defpackage;

/* renamed from: bccl */
public final class bccl extends anxl implements anzf {
    public static final bccl d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private bccl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001", new Object[]{"a", "b", bccn.a, "c"});
            case 3:
                return new bccl();
            case 4:
                return new bcco();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (bccl.class) {
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
        bccl bccl = new bccl();
        d = bccl;
        anxl.registerDefaultInstance(bccl.class, bccl);
    }
}
