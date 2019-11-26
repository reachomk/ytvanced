package defpackage;

/* renamed from: aquc */
public final class aquc extends anxl implements anzf {
    public static final aquc g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public aqua c;
    public aqua d;
    public aqua e;
    public aqua f;

    private aquc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001Ɛ\u0005\u0000\u0000\u0000\u0001\u0007\u0000d\t\u0001È\t\u0002Ĭ\t\u0003Ɛ\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aquc();
            case 4:
                return new aquf();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aquc.class) {
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
        aquc aquc = new aquc();
        g = aquc;
        anxl.registerDefaultInstance(aquc.class, aquc);
    }
}
