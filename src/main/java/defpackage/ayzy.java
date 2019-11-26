package defpackage;

/* renamed from: ayzy */
public final class ayzy extends anxl implements anzf {
    public static final ayzy c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private ayzy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", ayzw.class});
            case 3:
                return new ayzy();
            case 4:
                return new ayzx();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ayzy.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayzy ayzy = new ayzy();
        c = ayzy;
        anxl.registerDefaultInstance(ayzy.class, ayzy);
    }
}
