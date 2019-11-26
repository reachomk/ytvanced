package defpackage;

/* renamed from: ayyi */
public final class ayyi extends anxl implements anzf {
    public static final ayyi c;
    private static volatile anzq d;
    public int a;
    public int b;

    private ayyi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", ayyj.a});
            case 3:
                return new ayyi();
            case 4:
                return new ayyh();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ayyi.class) {
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
        ayyi ayyi = new ayyi();
        c = ayyi;
        anxl.registerDefaultInstance(ayyi.class, ayyi);
    }
}
