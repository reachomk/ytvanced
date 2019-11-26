package defpackage;

/* renamed from: aorh */
public final class aorh extends anxl implements anzf {
    public static final aorh g;
    private static volatile anzq h;
    public int a;
    public long b;
    public long c;
    public aorj d;
    public aorl e;
    public aorn f;

    private aorh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0000\u0002\t\u0002\u0003\t\u0003\u0004\u0002\u0001\u0005\t\u0004", new Object[]{"a", "b", "d", "e", "c", "f"});
            case 3:
                return new aorh();
            case 4:
                return new aork();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aorh.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aorh aorh = new aorh();
        g = aorh;
        anxl.registerDefaultInstance(aorh.class, aorh);
    }
}
