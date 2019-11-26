package defpackage;

/* renamed from: avki */
public final class avki extends anxl implements anzf {
    public static final avki e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public long c;
    public boolean d;

    private avki() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u0007\u0001\u0004\u0007\u0003\u0005\u0002\u0002", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new avki();
            case 4:
                return new avkk();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avki.class) {
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
        avki avki = new avki();
        e = avki;
        anxl.registerDefaultInstance(avki.class, avki);
    }
}
