package defpackage;

/* renamed from: bcdv */
public final class bcdv extends anxl implements anzf {
    public static final bcdv h;
    private static volatile anzq i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public anyd f = anxl.emptyProtobufList();
    public int g;

    private bcdv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u001b\u0006\u0004\u0004", new Object[]{"a", "b", "c", "d", "e", "f", bcdt.class, "g"});
            case 3:
                return new bcdv();
            case 4:
                return new bcdy();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (bcdv.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcdv bcdv = new bcdv();
        h = bcdv;
        anxl.registerDefaultInstance(bcdv.class, bcdv);
    }
}
