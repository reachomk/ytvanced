package defpackage;

/* renamed from: aytn */
public final class aytn extends anxl implements anzf {
    public static final aytn e;
    private static volatile anzq f;
    public int a;
    public aysx b;
    public int c;
    public long d;

    private aytn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", aytp.a, "d"});
            case 3:
                return new aytn();
            case 4:
                return new aytq();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aytn.class) {
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
        aytn aytn = new aytn();
        e = aytn;
        anxl.registerDefaultInstance(aytn.class, aytn);
    }
}
