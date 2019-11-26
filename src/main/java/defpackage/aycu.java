package defpackage;

/* renamed from: aycu */
public final class aycu extends anxl implements anzf {
    public static final aycu f;
    private static volatile anzq g;
    public int a;
    public aotn b;
    public aord c;
    public aovd d;
    public boolean e;

    private aycu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0000\u0003\t\u0002\u0004\t\u0003\u0005\u0007\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aycu();
            case 4:
                return new aycx();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aycu.class) {
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
        aycu aycu = new aycu();
        f = aycu;
        anxl.registerDefaultInstance(aycu.class, aycu);
    }
}
