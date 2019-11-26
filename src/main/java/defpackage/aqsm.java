package defpackage;

/* renamed from: aqsm */
public final class aqsm extends anxl implements anzf {
    public static final aqsm h;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    private aqsm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\f\u0003\u0005\f\u0004\u0006\u0004\u0005", new Object[]{"a", "b", "c", "d", "e", aqsj.a, "f", aqsk.a, "g"});
            case 3:
                return new aqsm();
            case 4:
                return new aqsl();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqsm.class) {
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
        aqsm aqsm = new aqsm();
        h = aqsm;
        anxl.registerDefaultInstance(aqsm.class, aqsm);
    }
}
