package defpackage;

/* renamed from: auql */
public final class auql extends anxl implements anzf {
    public static final auql f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public aupl e;

    private auql() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\t\u0003", new Object[]{"a", "b", auru.a, "c", auro.a, "d", "e"});
            case 3:
                return new auql();
            case 4:
                return new auqo();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (auql.class) {
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
        auql auql = new auql();
        f = auql;
        anxl.registerDefaultInstance(auql.class, auql);
    }
}
