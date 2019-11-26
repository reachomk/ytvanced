package defpackage;

/* renamed from: aths */
public final class aths extends anxl implements anzf {
    public static final aths d;
    private static volatile anzq e;
    public int a;
    public boolean b;
    public boolean c;

    private aths() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aths();
            case 4:
                return new athr();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aths.class) {
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
        aths aths = new aths();
        d = aths;
        anxl.registerDefaultInstance(aths.class, aths);
    }
}
