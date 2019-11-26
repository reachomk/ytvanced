package defpackage;

/* renamed from: ansf */
public final class ansf extends anxl implements anzf {
    public static final ansf b;
    private static volatile anzq c;
    public anyy a = anyy.b;

    private ansf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", ansh.a});
            case 3:
                return new ansf();
            case 4:
                return new anse();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (ansf.class) {
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
        ansf ansf = new ansf();
        b = ansf;
        anxl.registerDefaultInstance(ansf.class, ansf);
    }
}
