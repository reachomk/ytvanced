package defpackage;

/* renamed from: arhb */
public final class arhb extends anxl implements anzf {
    public static final arhb h;
    private static volatile anzq i;
    public int a;
    public long b;
    public int c;
    public argz d;
    public argz e;
    public boolean f;
    public boolean g;

    private arhb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0000\u0003\u0003\u0002\u0004\f\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u0007\u0006\b\u0007\u0007", new Object[]{"a", "b", "c", arhc.a, "d", "e", "f", "g"});
            case 3:
                return new arhb();
            case 4:
                return new arha();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arhb.class) {
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
        arhb arhb = new arhb();
        h = arhb;
        anxl.registerDefaultInstance(arhb.class, arhb);
    }
}
