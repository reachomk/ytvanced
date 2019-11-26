package defpackage;

/* renamed from: aqlj */
public final class aqlj extends anxl implements anzf {
    public static final aqlj d;
    private static volatile anzq e;
    public int a;
    public int b;
    public int c;

    private aqlj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u000b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aqlj();
            case 4:
                return new aqli();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqlj.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqlj aqlj = new aqlj();
        d = aqlj;
        anxl.registerDefaultInstance(aqlj.class, aqlj);
    }
}
