package defpackage;

/* renamed from: aosl */
public final class aosl extends anxl implements anzf {
    public static final aosl f;
    private static volatile anzq g;
    public int a;
    public aosp b;
    public aosn c;
    public aosp d;
    public aosn e;

    private aosl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aosl();
            case 4:
                return new aoso();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aosl.class) {
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
        aosl aosl = new aosl();
        f = aosl;
        anxl.registerDefaultInstance(aosl.class, aosl);
    }
}