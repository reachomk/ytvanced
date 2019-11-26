package defpackage;

/* renamed from: astv */
public final class astv extends anxl implements anzf {
    public static final astv f;
    private static volatile anzq g;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public asud e;

    private astv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0002\u0000\u0001\f\u0000\u0006\u001b\u0007\u001b\n\t\u0007", new Object[]{"a", "b", asua.a, "c", astz.class, "d", asuh.class, "e"});
            case 3:
                return new astv();
            case 4:
                return new asty();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (astv.class) {
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
        astv astv = new astv();
        f = astv;
        anxl.registerDefaultInstance(astv.class, astv);
    }
}
