package defpackage;

/* renamed from: aovf */
public final class aovf extends anxl implements anzf {
    public static final aovf g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;

    private aovf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0005\u0007\u0002\u0006\u0007\u0003\u0007\u0002\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aovf();
            case 4:
                return new aovi();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aovf.class) {
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
        aovf aovf = new aovf();
        g = aovf;
        anxl.registerDefaultInstance(aovf.class, aovf);
    }
}
