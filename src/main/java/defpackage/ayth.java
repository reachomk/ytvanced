package defpackage;

/* renamed from: ayth */
public final class ayth extends anxl implements anzf {
    public static final ayth e;
    private static volatile anzq f;
    public int a;
    public aysx b;
    public int c;
    public int d;

    private ayth() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0004\f\u0003", new Object[]{"a", "b", "c", ayug.a, "d", ayue.a});
            case 3:
                return new ayth();
            case 4:
                return new aytk();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayth.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        ayth ayth = new ayth();
        e = ayth;
        anxl.registerDefaultInstance(ayth.class, ayth);
    }
}
