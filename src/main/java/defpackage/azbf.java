package defpackage;

/* renamed from: azbf */
public final class azbf extends anxl implements anzf {
    public static final azbf b;
    private static volatile anzq c;
    public anya a = anxl.emptyFloatList();

    private azbf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"a"});
            case 3:
                return new azbf();
            case 4:
                return new azbe();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (azbf.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azbf azbf = new azbf();
        b = azbf;
        anxl.registerDefaultInstance(azbf.class, azbf);
    }
}
