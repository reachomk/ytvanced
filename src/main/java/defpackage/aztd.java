package defpackage;

/* renamed from: aztd */
public final class aztd extends anxl implements anzf {
    public static final aztd d;
    public static final anxr e;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;

    private aztd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000", new Object[]{"a", "b", aztf.class, "c"});
            case 3:
                return new aztd();
            case 4:
                return new aztc();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aztd.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        aztd aztd = new aztd();
        d = aztd;
        anxl.registerDefaultInstance(aztd.class, aztd);
        azsz azsz = azsz.a;
        aztd aztd2 = d;
        e = anxl.newSingularGeneratedExtension(azsz, aztd2, aztd2, null, 188490103, aobm.MESSAGE, aztd.class);
    }
}
