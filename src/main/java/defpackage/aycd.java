package defpackage;

/* renamed from: aycd */
public final class aycd extends anxl implements anzf {
    public static final aycd d;
    private static volatile anzq e;
    public int a;
    public long b;
    public long c;

    private aycd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u0002\u0001\u0004\u0002\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new aycd();
            case 4:
                return new aycc();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aycd.class) {
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
        aycd aycd = new aycd();
        d = aycd;
        anxl.registerDefaultInstance(aycd.class, aycd);
    }
}
