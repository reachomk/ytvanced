package defpackage;

/* renamed from: azdm */
public final class azdm extends anxl implements anzf {
    public static final anyb c = new azdl();
    public static final azdm h;
    private static volatile anzq i;
    public int a;
    public anxz b = anxl.emptyIntList();
    public int d;
    public int e;
    public int f;
    public int g;

    private azdm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001e\u0002\u000b\u0000\u0003\u000b\u0001\u0004\u000b\u0002\u0005\u000b\u0003", new Object[]{"a", "b", azdn.a(), "d", "e", "f", "g"});
            case 3:
                return new azdm();
            case 4:
                return new azdo();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azdm.class) {
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
        azdm azdm = new azdm();
        h = azdm;
        anxl.registerDefaultInstance(azdm.class, azdm);
    }
}
