package defpackage;

/* renamed from: ayxw */
public final class ayxw extends anxl implements anzf {
    public static final ayxw f;
    private static volatile anzq g;
    public int a;
    public ayxu b;
    public int c;
    public boolean d;
    public int e;

    private ayxw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", ayyb.a, "d", "e", aqvf.a});
            case 3:
                return new ayxw();
            case 4:
                return new ayxz();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayxw.class) {
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
        ayxw ayxw = new ayxw();
        f = ayxw;
        anxl.registerDefaultInstance(ayxw.class, ayxw);
    }
}
