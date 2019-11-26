package defpackage;

/* renamed from: aydi */
public final class aydi extends anxl implements anzf {
    public static final aydi e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    private aydi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0003\u0007\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aydi();
            case 4:
                return new aydl();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aydi.class) {
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
        aydi aydi = new aydi();
        e = aydi;
        anxl.registerDefaultInstance(aydi.class, aydi);
    }
}
