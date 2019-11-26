package defpackage;

/* renamed from: aqvz */
public final class aqvz extends anxl implements anzf {
    public static final aqvz f;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;

    private aqvz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqvz();
            case 4:
                return new aqvy();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqvz.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqvz aqvz = new aqvz();
        f = aqvz;
        anxl.registerDefaultInstance(aqvz.class, aqvz);
    }
}
