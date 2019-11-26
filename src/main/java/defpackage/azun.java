package defpackage;

/* renamed from: azun */
public final class azun extends anxl implements anzf {
    public static final azun d;
    public static final anxr e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;

    private azun() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new azun();
            case 4:
                return new azum();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azun.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azun azun = new azun();
        d = azun;
        anxl.registerDefaultInstance(azun.class, azun);
        azsz azsz = azsz.a;
        azun azun2 = d;
        e = anxl.newSingularGeneratedExtension(azsz, azun2, azun2, null, 212323971, aobm.MESSAGE, azun.class);
    }
}
