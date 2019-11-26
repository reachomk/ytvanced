package defpackage;

/* renamed from: bcch */
public final class bcch extends anxl implements anzf {
    public static final bcch f;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c = "";
    public anxz d = anxl.emptyIntList();
    public int e;

    private bcch() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0005'\u0006\u0004\u0002", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new bcch();
            case 4:
                return new bcck();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (bcch.class) {
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
        bcch bcch = new bcch();
        f = bcch;
        anxl.registerDefaultInstance(bcch.class, bcch);
    }
}
