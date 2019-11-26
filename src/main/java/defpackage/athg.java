package defpackage;

/* renamed from: athg */
public final class athg extends anxl implements anzf {
    public static final athg f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public anxz d = anxl.emptyIntList();
    public int e;

    private athg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u000b\u0001\u0003\u001d\u0005\f\u0003", new Object[]{"a", "b", "c", "d", "e", athi.a});
            case 3:
                return new athg();
            case 4:
                return new athf();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (athg.class) {
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
        athg athg = new athg();
        f = athg;
        anxl.registerDefaultInstance(athg.class, athg);
    }
}
