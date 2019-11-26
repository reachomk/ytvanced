package defpackage;

/* renamed from: axzj */
public final class axzj extends anxl implements anzf {
    public static final axzj f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public anyd d = anxl.emptyProtobufList();
    public aojx e;

    private axzj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0004\u001b\u0005\t\u0002", new Object[]{"a", "b", "c", "d", aojo.class, "e"});
            case 3:
                return new axzj();
            case 4:
                return new axzi();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axzj.class) {
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
        axzj axzj = new axzj();
        f = axzj;
        anxl.registerDefaultInstance(axzj.class, axzj);
    }
}
