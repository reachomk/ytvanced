package defpackage;

/* renamed from: aorp */
public final class aorp extends anxl implements anzf {
    public static final aorp f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public anyd e = anxl.emptyProtobufList();

    private aorp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u0007\u0002\u0004\u001b", new Object[]{"a", "b", "c", aoru.a, "d", "e", avwc.class});
            case 3:
                return new aorp();
            case 4:
                return new aors();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aorp.class) {
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
        aorp aorp = new aorp();
        f = aorp;
        anxl.registerDefaultInstance(aorp.class, aorp);
    }
}
