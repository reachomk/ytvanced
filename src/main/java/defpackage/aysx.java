package defpackage;

/* renamed from: aysx */
public final class aysx extends anxl implements anzf {
    public static final aysx e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public int c;
    public int d;

    private aysx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\f\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", aytu.a, "d", aytr.a});
            case 3:
                return new aysx();
            case 4:
                return new ayta();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aysx.class) {
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
        aysx aysx = new aysx();
        e = aysx;
        anxl.registerDefaultInstance(aysx.class, aysx);
    }
}
