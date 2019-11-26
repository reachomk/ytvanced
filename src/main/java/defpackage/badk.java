package defpackage;

/* renamed from: badk */
public final class badk extends anxl implements anzf {
    public static final badk f;
    private static volatile anzq g;
    public int a;
    public int b;
    public aocx c;
    public int d;
    public boolean e;

    private badk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\f\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", badm.a, "e"});
            case 3:
                return new badk();
            case 4:
                return new badn();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (badk.class) {
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
        badk badk = new badk();
        f = badk;
        anxl.registerDefaultInstance(badk.class, badk);
    }
}
