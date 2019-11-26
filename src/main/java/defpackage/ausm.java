package defpackage;

/* renamed from: ausm */
public final class ausm extends anxl implements anzf {
    public static final ausm f;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public auso c;
    public autn d;
    public anyd e = anxl.emptyProtobufList();

    private ausm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0002\u0000\u0005\u001a\u0006\t\u0003\u0007\t\u0004\b\u001a", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ausm();
            case 4:
                return new ausl();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ausm.class) {
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
        ausm ausm = new ausm();
        f = ausm;
        anxl.registerDefaultInstance(ausm.class, ausm);
    }
}
